package Arrays;

import java.util.Arrays;

public class CountTripplets {

	public static int countWithSmallerValue(int[] a, int sum) {
	  int result=0;
		for(int i=0;i<a.length-2;i++){
		   for(int j=i+1;j<a.length-1;j++){
			   for(int k=j+1;k<a.length;k++){
				   if(a[i]+a[j]+a[k]<sum){
					  result++;   
				   }
			   }
		   }
			
		}
		return result;
	}

	public static int SortAndCount(int[] a, int sum) {
		int res=0;
		Arrays.sort(a);
		for(int i=a.length-1;i>0;i--){
			int k=i-1;
			int j=0;
			while(k>j){
				if(a[i]+a[j]+a[k]>=sum){
					k--;
				}
				else{
					System.out.println(a[i]+"+"+a[j]+"+"+a[k]);
					k--;
					res++;
				}
			}
		}
		return res;
	}

}
