package random;

public class ReverseString {
	public static void main( String ...args){
	String s="Hello World";
	char [] stringArray=s.toCharArray();
	int last=s.length()-1;
	for(int i=0;i<stringArray.length/2;i++){
		char c=stringArray[i];
		stringArray[i]=stringArray[last-i];
		stringArray[last-i]=c;
	}
	System.out.println(new String(stringArray));
	}

}
