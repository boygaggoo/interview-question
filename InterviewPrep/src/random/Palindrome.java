package random;

public class Palindrome {

	public static boolean verify(String s) {
		// TODO Auto-generated method stub
		String given=s.toLowerCase();
		int last=given.length()-1;
		for(int i=0;i<given.length()/2;i++){
			if(given.charAt(i)!=given.charAt(last)){
				return false;
			}
			last--;
			
		}
		return true;
		
	}

}
