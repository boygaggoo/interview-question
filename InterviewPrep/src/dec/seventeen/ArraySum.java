package dec.seventeen;

public class ArraySum {

	public static void main(String[] args) {
		int a[] ={1,2,3,4,5};
//		findPairs(a,6);
		findPairs2(a,6);

	}
private static void findPairs2(int[] a, int sum) {
	   int start=0;
	   int end=a.length-1;
	   while(start<end){
		   
		   if(a[start]+a[end]<sum){
			   start++;
		   }
		   else if(a[start]+a[end]==sum){
			   System.out.println(a[start]+","+a[end]);
			   start++;
			   end--;
		   }
		   else{
			   end--;
		   }
	   }
		
	}
/**
 * Brute force ) n^2
 * @param a
 * @param sum
 */
	private static void findPairs(int[] a, int sum) {
		for (int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
		     if(a[i]+a[j]==sum){
		    	 System.out.println(a[i]+","+a[j]);
		     }
			}
		}
		
	}

}
