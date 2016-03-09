package String;

public class CountOfOccuOfLetter {
	public static void main(String[] args) {
		System.out.println(countOccurance("aabbacaa",'a'));
	}

	private static int countOccurance(String str, char c) {
		int count=str.length()-str.replace("a","").length();
		return count;
		
	}

}
