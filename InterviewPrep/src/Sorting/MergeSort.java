package Sorting;

public class MergeSort {

	public static int [] sort(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		//base case to check if array size is less than 2
		if(n<2)
			return a;
		int mid=n/2;
		int [] leftArray=new int[mid];
		int [] rightArray=new int[n-mid];
		for(int i=0;i<mid;i++){
			leftArray[i]=a[i];
		}
		for(int i=mid;i<n;i++){
			rightArray[i-mid]=a[i];
		}
		sort(leftArray);
		sort(rightArray);
		return Merge(leftArray,rightArray,a);
	}

	private static int [] Merge(int[] leftArray, int[] rightArray, int[] a) {
		int numLeft=leftArray.length;
		int numRight=rightArray.length;
		int i=0,j=0,k=0;
		while(i<numLeft&& j<numRight){
			if(leftArray[i]<=rightArray[j]){
				a[k]=leftArray[i];
				k++;
				i++;
			}
			else{
				a[k]=rightArray[j];
				k++;
				j++;
			}
		}
			while(i<numLeft){
				a[k]=leftArray[i];
				k++;
				i++;
			}
			while(j<numRight){
				a[k]=rightArray[j];
				k++;
				j++;
			}
		
		return a;
	}

}
