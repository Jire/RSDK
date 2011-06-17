package us.rsdk;

import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import us.rsdk.network.PipelineFactory;

/**
 * <b>Application entry point.</b>
 * 
 * <p>The application will deploy a new RuneScape server module.</p>
 * 
 * @author Thomas Nappo
 */
public class Server {
	
	private static final Logger logger = Logger.getLogger(Server.class.getName());
	
	private final ExecutorService executor = Executors.newCachedThreadPool();
	private final ServerBootstrap bootstrap = new ServerBootstrap();
	
	public static void main(String[] args) {
		Server server = new Server(); // instantize a new server
		                              // which will then be binded to a socket
		                              // and finish.
		server.bind("localhost", 43594);
		server.finish();
	}
	
	/**
	 * Constructs a new server.
	 * 
	 * <p>The already created {@link #executor} will be used for 
	 * boss/worker execution for a new {@link NioServerSocketChannelFactory}
	 * for the {@link bootstrap}'s socket factory.</p>
	 * 
	 * <p>A new {@link PipelineFactory} will be created for the bootstrap as well.</p>
	 */
	public Server() {
		bootstrap.setFactory(new NioServerSocketChannelFactory(executor, executor));
		bootstrap.setPipelineFactory(new PipelineFactory());
	}
	
	/**
	 * Binds the server to a socket.
	 * 
	 * <p>For example, if we want to bind the server to the IP <tt>localhost</tt>
	 * on port <tt>43594</tt> (which is the default RuneScape port) we could call:
	 * 		<pre>bind("localhost", 43594);</pre>
	 * </p>
	 * 
	 * @param host The host name.
	 * @param port A valid port value is between <tt>0</tt> and <tt>65535</tt>.
	 * A port number of <tt>zero</tt> will let the system pick up an ephemeral port in a bind operation. 
	 */
	private void bind(String host, int port) {
		bootstrap.bind(new InetSocketAddress(host, port));
		logger.info("Binded (" + host + "," + port + ")");
	}
	
	/**
	 * Finalizes the server.
	 */
	private void finish() {
		logger.info("Accepting connections.");
	}

}