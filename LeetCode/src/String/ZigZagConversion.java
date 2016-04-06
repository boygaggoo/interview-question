package String;
/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number 
 * of rows like this:(you may want to display this pattern in a fixed font
 *  for better legibility)
 * @author Siddiq Ahmed Syed
 *
 */
public class ZigZagConversion {
	public static void main(String[] args) {
		System.out.println(zigzag("paypalishiring",3));
		System.out.println(convert("paypalishiring",3));
	}

	private static String zigzag(String str, int noOfRows) {
		StringBuilder sb=new StringBuilder();
		int point=0;
	    for(int i=0;i<str.length();i++){
	    	sb.append(str.charAt(i));
	    	point++;
	    	if(point==noOfRows){
	    		sb.append("\n");
	    		point=1;
	    	}
	    	
	    }
	    return sb.toString();
	}
	public static String convert(String s, int nRows) {  
		   if (nRows == 1) return s;  
		   
		   StringBuilder ss = new StringBuilder();  
		   int n = nRows + nRows - 2;  
		   // rest rows  
		   for (int i = 0; i < nRows; ++i) {  
		     int cur = i;  
		     while (cur < s.length()) {  
		       ss.append(s.charAt(cur));  
		       cur += n;  
		       if (i > 0 && i < nRows - 1 && (cur - i - i) < s.length()) {  
		         ss.append(s.charAt(cur - i - i));  
		       }  
		     }  
		   }  
		   return ss.toString();  
		 }  

}
