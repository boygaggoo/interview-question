package String;

import java.util.Arrays;
import java.util.regex.Pattern;

public class DigitStrings {

	public static boolean isOnlyDigits(String str) {
		Pattern p=Pattern.compile("[0-9]*");
		return p.matcher(str).matches();
		
	}

	public static boolean isOnlyDigits2(String str) {
		String [] arr=str.split("[0-9]");
		System.out.println(Arrays.toString(arr));
		return arr.length>0?false:true;
	}

}
