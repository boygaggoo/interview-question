package String;

public class CesarCipher {
public static void main(String[] args) {
	System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!",23));
	System.out.println(replaceVowel("Hello",'*'));
	System.out.println(emphasize("dna ctgaaactga", 'a'));
}

public static String emphasize(String msg, char c) {
	StringBuilder result=new StringBuilder(msg);
	for(int i=0;i<result.length();i++){
		if(msg.charAt(i)==c){
			if(i%2==0){
				result.setCharAt(i, '*');
			}
			else {
				result.setCharAt(i, '+');
			}
		}
	
	}
	return result.toString();
}

public static String replaceVowel(String msg, char c) {
	StringBuilder result=new StringBuilder(msg);
	for(int i=0;i<msg.length();i++){
	   if(isVowel(msg.toLowerCase().charAt(i))){
		  result.setCharAt(i, c);
	   }	
	
	}
	return result.toString();
}

public static boolean isVowel(char ch) {
	// TODO Auto-generated method stub
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		return true;
	}
	return false;
}

private static void replaceVowel(String string) {
	// TODO Auto-generated method stub
	
}

public static String encrypt(String msg, int key) {
	String alphabets=generateAlphabts();
    String shiftedAlphabets=alphabets.substring(key)+alphabets.substring(0,key);
	System.out.println("shiftedAlphabets:"+shiftedAlphabets);
	StringBuilder encryptedMessage=new StringBuilder(msg);
	for(int i=0;i<encryptedMessage.length();i++){
		char c=encryptedMessage.charAt(i);
		int pos=alphabets.indexOf(c);
		if(pos!=-1){
		encryptedMessage.setCharAt(i,shiftedAlphabets.charAt(pos));
		}
	}
	return encryptedMessage.toString();
	
}

public static String generateAlphabts() {
	// TODO Auto-generated method stub
	StringBuilder sb=new StringBuilder();
	for(int i=65;i<=90;i++){
		sb.append((char)i+"");
	}
	return sb.toString();
}

public static String cipher(String msg, int shift) {
	// TODO Auto-generated method stub
	 String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) + shift);
	        if (c > 'z'||c>'Z')
	            s += (char)(msg.charAt(x) - (26-shift));
	        else
	            s += (char)(msg.charAt(x) + shift);
	    }
	    return s;
	
}

public static String cipher2(String str, int key) {
	String encrypted = "";
	for(int i = 0; i < str.length(); i++) 
	{
		int c = str.charAt(i);
		
		if (Character.isUpperCase(c)) 
		{
			//26 letters of the alphabet so mod by 26
			c = c + (key % 26);
			if (c > 'Z')
			c = c - 26;
		} 
		else if (Character.isLowerCase(c)) 
		{
			c = c + (key % 26);
			if (c > 'z')
			c = c - 26;
		}
		encrypted += (char) c;
	}
return encrypted;
}

public static String cipher3(String str, int key1, int key2) {
   StringBuilder sb=new StringBuilder();
   for(int i=0;i<str.length();i++){
	   if(i%2==0){
		   sb.append(cipher2(str, key1).charAt(i));
	   }else{
		   sb.append(cipher2(str, key2).charAt(i));
	   }
	   
   }
   return sb.toString();
}
}
