package coding.interview.chap1;
/**
 *This is the optimal solution with time complexity of O(n)
 * 
 * 
 */

public class UniqueString2 {

	public static void main(String[] args) {
		String s="helo";
		System.out.println(UniqueString2.check(s));
		s="hello";	
		System.out.println(UniqueString2.check(s));
	
	}
	/**This method checks if the string(no-unicode) has unique characters
	 *@param s String to be checked
	 * 
	 * @return boolean value 
	 * 
	 */

	private static boolean check(String s) {
		boolean [] charValues=new boolean[256];//total number of ascii values
		
		if(s.length()>256){//if string length is more than 256 than it has repeated characters
			return false;
		}
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);//getting the ascii value of char
			if(charValues[val]){
				return false;
			}
			charValues[val]=true;
			
		}
		return true;
		
		
	}

}
