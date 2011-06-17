package us.rsdk.content.bundle;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Used to describe a bundle component.
 * @author Thomas Nappo
 */
@Retention(RetentionPolicy.SOURCE) // used to inform devs. only
public @interface Description {
	
	String value();
	
}