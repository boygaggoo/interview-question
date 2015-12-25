package samples;

public class MinMaxSwap {

	public static void swap(int[] a) {
		int minIndex=getMinIndex(a);
		int maxIndex=getMaxIndex(a);
		swap(a,minIndex,maxIndex);
	
	}

	private static void swap(int[] a, int minIndex, int maxIndex) {
		int temp=a[minIndex];
		a[minIndex]=a[maxIndex];
		a[maxIndex]=temp;
		
	}

	private static int getMaxIndex(int[] a) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max=i;
			}
		}
		return max;
		
	}

	private static int getMinIndex(int[] a) {
		// TODO Auto-generated method stub
		int min=0;
		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				min=i;
			}
		}
		return min;
	}

}
