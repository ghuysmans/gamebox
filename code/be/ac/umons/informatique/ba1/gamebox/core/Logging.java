package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.logging.Logger;

/**
 * Provides an unified way to get a handle to a java.util.logging.Logger object
 */

public class Logging {

	public static Logger getLogger(Class<?> cls) {
		return Logger.getLogger(cls.getName());
	}
	
	public static Logger getGlobal() {
		return Logger.getAnonymousLogger();
	}
}
