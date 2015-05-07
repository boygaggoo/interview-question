package coding.interview.chap1;
/**
 * The task is to check if the string has 
 * unique characters
 * @author Siddiq Ahmed Syed
 *
 */

public class UniqueString {	
	public static void main(String [] args) {
	 UniqueString us=new UniqueString();
	 us.hasDuplicates("hello");//will print true or false
	 us.hasDuplicates("time");
	}
/**
 * This method print true or false based on the give string
 * This method calls another helper method checkForDuplicates 
 * to compare one character with the rest of remaining characters 
 * @param givenString
 */
	public void hasDuplicates(String givenString) {
		boolean flag=false;
		char [] charArray=givenString.toCharArray();//converting the string to character Array
		for(int i=0;i<charArray.length;i++){
			flag=checkForDuplicates(i,charArray);
			if(flag==true){break;}
			
		}
		System.out.println(flag);
		}
		
	
/**
 * This is a helper method compares the given char with the rest of 
 * character array. If the char matches with any of the other characters 
 * than it return true else if will return false
 * @param from - position of the char  
 * @param charArray-character array consisting of the given string  
 * @return true/false 
 */
	private boolean checkForDuplicates(int from, char[] charArray) {
		int start=from+1;
		for (int j=start;j<charArray.length;j++ ){
			 if(charArray[j]==charArray[from]){
				return true;
			}
			
		}
		return false;
		
	}

}
