package certification;

public class Q142 {
public static void main(String[] args) {
	String st4;
	st4="hello";
	String str="Java";
	char [] str2={'J','a','v','a'};
	String str3=null;
	for(char c:str2){
		
		str3=str3+c;
	}
	System.out.println(str3);
	if(str.equals(str3)){
		System.out.println("Succesfull");
	}else{
		System.out.println("UnSuccesfull");
	}
	
}
}
