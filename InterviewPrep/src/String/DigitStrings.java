package String;

import java.util.regex.Pattern;

public class DigitStrings {

	public static boolean isOnlyDigits(String str) {
		Pattern p=Pattern.compile("[0-9]*");
		return p.matcher(str).matches();
		
	}

}
