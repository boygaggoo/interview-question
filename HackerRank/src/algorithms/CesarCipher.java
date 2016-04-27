package algorithms;

public class CesarCipher {
	public static void main(String[] args) {
		String s="!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U";
	
		System.out.println(encrypt(s,62));
	}

public static String encrypt(String str, int key) {
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
}
