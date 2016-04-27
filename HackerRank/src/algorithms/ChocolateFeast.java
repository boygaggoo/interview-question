package algorithms;

import java.util.Scanner;
/**
 * Little Bob loves chocolate, and he goes to a store with $N$N in his pocket.
 *  The price of each chocolate is $C$C. The store offers a discount: 
 *  for every MM wrappers he gives to the store, he gets one chocolate for free. 
 *  How many chocolates does Bob get to eat?

Input Format: 
The first line contains the number of test cases, TT. 
TT lines follow, each of which contains three integers, NN, CC, and MM.
 * @author Siddiq Ahmed Syed
 *
 */
public class ChocolateFeast {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int c = in.nextInt();
	            int m = in.nextInt();
	            System.out.println(chocolateBobEats(n,c,m));
	        }
	        
	}

	private static int chocolateBobEats(int n, int c, int m) {
		int totalChocalts=n/c;
		int addChocolates=0;
		int count=totalChocalts;
		if(totalChocalts==m){
			count++;
		}
		else if(totalChocalts>m){
			int newChoc=count-m;
			count++;
			newChoc++;
			if(newChoc==m){
				count++;
			}
			
		}
		
		return count;
	}

}
