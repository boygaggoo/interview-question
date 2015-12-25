package chap1;

public class StringCompression {

	/**
	 * This is my implementation
	 * @param str
	 * @return
	 */
	public static String compress(String str) {
		char [] strArray=str.toCharArray();
		int count =1;
		char start=strArray[0];
	    String newStr="";
		for(int i=1;i<strArray.length;i++){
			if(strArray[i]!=start){
				newStr+=start+""+count;
				start=strArray[i];
				count=0;
			}
			//checkin for the last character 
			if(i==strArray.length-1){
				count++;
				newStr+=start+""+count;
			}
			count++;
		}
		return newStr;
	}

}
