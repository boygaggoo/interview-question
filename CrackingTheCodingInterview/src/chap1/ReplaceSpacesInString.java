package chap1;

public class ReplaceSpacesInString {
/**
 * This is my implementations of replacing String with %20
 * @param str
 * @return new string
 */
	public static String replace(String str) {
		return str.replaceAll(" ", "%20");
		
	}
	/**
	 * This is my implementations of replacing String with %20
	 * @param str
	 * @return new string
	 */	
	
	public static String replace2(String str) {
		StringBuffer strBuf=new StringBuffer();
		String [] strArray=str.split(" ");
		strBuf.append(strArray[0]);
		for(int i=1;i<strArray.length;i++){
			strBuf.append("%20");
			strBuf.append(strArray[i]);
			
		}
		return strBuf.toString();
	}
	
	

}
