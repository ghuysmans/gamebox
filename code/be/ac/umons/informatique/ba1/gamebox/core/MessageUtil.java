package be.ac.umons.informatique.ba1.gamebox.core;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Utility class using Java's native localization feature
 */
public class MessageUtil {

	/**
	 * Formats and localizes a message using its key
	 * Note: key is the first parameter to allow automatic extraction!
	 * @param key     Key in the localized messages dictionary
	 * @param bundle  Class whom name is used to get a baseName for {@link ResourceBundle#getBundle(String)}
	 * @param objects Optional parameters
	 * @return Message, ready to be displayed
	 */
	public static String getMessage(String key, Class<?> bundle, Object... objects) {
		String fmt = ResourceBundle.getBundle(bundle.getName()).getString(key);
		MessageFormat mf = new MessageFormat(fmt);
		return mf.format(objects);
	}
		
}
