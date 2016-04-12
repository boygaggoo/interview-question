package algorithms;

public class FindDigits {
  public static void main(String[] args) {
	System.out.println(findDigits(1012));
}

private static int findDigits(int num) {
	String s=num+"";
	int count=0;
	for(int i=0;i<s.length();i++){
		int divisor=Integer.parseInt(s.charAt(i)+"");
		if(divisor!=0&&num%divisor==0){
			count++;
		}
	}
	return count;
	
}
}
