package String;

public class StringRotation {
public static void main(String[] args) {
	System.out.println(isRotation("JavaJ2eeStrutsHibernate","J2eeStrutsHibernateJava"));
}

private static boolean isRotation(String str1, String str2) {
	// TODO Auto-generated method stub
	if(str1.length()!=str2.length()){
		return false;
	}
	String str3=str1+str1;
	if(str3.contains(str2)){
		return true;
	}else{
	return false;
	}
	}
}
