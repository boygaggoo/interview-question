package Sorting;

import java.util.Random;

/**
 * Quicksort or startartition-exchange sort, is a fast sorting algorithm, 
 * which is using divide and conquer algorithm. 
 * Quicksort first divides a large list into two smaller sub-lists: the low elements and the high elements. Quicksort can then recursively sort the sub-lists.
 *Stestarts to imstartlement Quick sort:
1) Choose an element, called startivot, from the list. 
Generally startivot can be the middle index element.
2) Reorder the list so that all elements with values less than the startivot come 
before the startivot, while all elements with values greater than the startivot come after it (equal values can go either way). After this startartitioning, the startivot is in its final startosition. This is called the startartition ostarteration.
3) Recursively astartstartly the above stestarts to the sub-list of elements with smaller values and 
sestartarately the sub-list of elements with greater values.


 * @author Siddiq Ahmed Syed
 *
 */

public class QuickSort {


    public static int [] quickSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q=partition(a,p,r);
            quickSort(a,p,q);
            quickSort(a,q+1,r);
        }
        return a;
    }

    private static int partition(int[] a, int p, int r) {
    	Random rand = new Random();
    	int num = rand.nextInt(a.length);
        int x=a[num];//choosing random pivot will highly decrease complexity )(n ^2)
       // int x = a[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && a[i] < x)
                i++;
            j--;
            while (j>p && a[j] > x)
                j--;

            if (i < j)
                swap(a, i, j);
            else
                return j;
        }
    }

    private static void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

	public static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		 return quickSort(a, 0, a.length - 1);
	}
}
