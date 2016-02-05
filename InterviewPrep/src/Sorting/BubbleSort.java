package Sorting;

public class BubbleSort {

	public static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		for(int j=0;j<a.length-1;j++){
		int flag=0;	//flag to check if all elements are swapped
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				Util.swap(i,i+1,a);
				flag=1;
			}
			
		}
		if(flag==0)break;
		}
		return a;
	}

}
