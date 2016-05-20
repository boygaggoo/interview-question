import java.util.Scanner;


public class DaySeven {
	  public static void main(String[] args) {
	        Scanner in=new Scanner(System.in);
	        int t=in.nextInt();
	        while(t>0){
	        	String s=in.next();
	        	printEvenOddChar(s);
	        	t--;
	        }
	    }

	private static void printEvenOddChar(String s) {
		char [] charArray=s.toCharArray();
		StringBuilder evenString=new StringBuilder();
		StringBuilder oddString=new StringBuilder();
		for(int i=0;i<charArray.length;i++){
			if(i%2==0){
				evenString.append(charArray[i]);
			}else{
				oddString.append(charArray[i]);
			}
		}
		System.out.println(evenString.toString()+" "+oddString.toString());
		
	}

}
