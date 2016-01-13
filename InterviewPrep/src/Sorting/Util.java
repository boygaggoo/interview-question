package Sorting;

public class Util {

	public static void printArray(int[] arr) {
		for(int i:arr){
			System.out.print(i+ ",");
		}
		System.out.println();
		
	}
	public static void swap(int i, int min, int[] a) {
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}

}
