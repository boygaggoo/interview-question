package Recursion;

public class Fibonacci {
   static int F[]=new int[51];
	public static void main(String[] args) {
		 for(int i=0;i<51;i++){
	    	  F[i]=-1;
	      }
	  System.out.println(iterFib(40));
	  System.out.println(recursiveFib(40));
	  System.out.println(fibWithMemoization(40));
     
	}
	private static int fibWithMemoization(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return n;
		if(F[n]!=-1){
			return F[n];
		}
		F[n]=fibWithMemoization(n-1)+fibWithMemoization(n-2);
		return F[n];
	}
	/**
	 * Recursive way of finding fibonacci
	 * @param n
	 * @return
	 */
private static int recursiveFib(int n) {
		// TODO Auto-generated method stub
	  if(n<=1)
		  return n;
	   return recursiveFib(n-1)+recursiveFib(n-2);

	}
/**
 * Iterative way to find fibonacci
 * @param n
 * @return
 */
	private static int iterFib(int n) {
		if(n<=1){
			return n;
		}
		int f1,f2,f = 0;
		f1=0;
		f2=1;
		for (int i=2;i<=n;i++){
			f=f1+f2;
			f1=f2;
			f2=f;
		}
		return f;
	}

}
