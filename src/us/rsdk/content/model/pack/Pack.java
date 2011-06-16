package us.rsdk.content.model.pack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * When a field obtains this annotation it will be saved into the output file.
 * 
 * <p>For example, if we have fields called <tt>myUsername</tt> and <tt>myPassword</tt> as so:
 * 		<pre>String myUsername;<br />String myPassword;</pre>
 * we can add a pack annotation to pack them during a save:
 * 		<pre><b><i>@Pack(true)</i></b><br />String myUsername;<br /><b><i>@Pack</i></b><br />String myPassword;</pre>
 * the field <tt>myUsername</tt> will be used as the file name because {@link #key} was marked <code>true</code>.
 * Both fields will be saved inside the file.</p>
 * @author Thomas Nappo
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Pack {
	
	/**
	 * @return Whether or not to use the field as the file key.
	 */
	boolean key() default false;

}