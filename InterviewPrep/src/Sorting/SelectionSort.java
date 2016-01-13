package Sorting;
/**
 * This is the implementation of Selection Sort
 * @author Siddiq Ahmed Syed
 *
 */
public class SelectionSort {

	public static int [] sort(int[] a) {
		for(int i=0;i<a.length-1;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			Util.swap(i,min,a);
		}
		return a;
		
	}



}
