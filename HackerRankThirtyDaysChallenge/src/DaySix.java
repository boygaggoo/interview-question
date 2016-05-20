import java.util.Scanner;


public class DaySix {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        printMultiples(N);
	    }

	private static void printMultiples(int n) {
		for(int i=1;i<=n;i++){
			System.out.println(n+" x "+i+" = "+n*i);
		}
		
	}

}
