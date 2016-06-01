import java.util.Scanner;


public class DayTwentyOne {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        sort(a);
}

	private static void sort(int[] a) {
	   int noOfSwaps=0;
	   for(int i=0;i<a.length-1;i++){
		   for(int j=i+1;j<a.length;j++){
			   if(a[j]<a[i]){
				   swap(a,j,i);
				   noOfSwaps++;
			   }
		   }
	   }
	   System.out.println("Array is sorted in "+noOfSwaps+" swaps.");
	   System.out.println("First Element: "+a[0]
			   +"\nLast Element: "+a[a.length-1]);
		
	}

	private static void swap(int[] a, int j, int i) {
	      int temp=a[j];
	      a[j]=a[i];
	      a[i]=temp;
		
	}
}
