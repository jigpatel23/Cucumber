/**
 * 
 */
package mol.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jigneshkumarpatel
 *
 */
public class SysProp {
	private static final String OsName = System.getProperty("os.name");
	public static String dateTime = new SimpleDateFormat("dd-MM-yyyy_HH-mm").format(new Date());
	
	public static boolean isMac() {
		return OsName.contains("mac");
	}
	
	public static boolean isWin() {
		return OsName.contains("win");
	}

}
