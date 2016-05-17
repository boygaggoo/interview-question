package Arrays;
/**
 * Find Top Two Numbers in an Array
 * @author Siddiq Ahmed Syed
 *
 */
public class TopTwoNum {
public static void main(String[] args) {
    int a[]={1,4,5,7,10,21,9,20};
    findTopTwo(a);
}

private static void findTopTwo(int[] a) {
	int topOne=0;
	int topTwo=Integer.MIN_VALUE;
	int i=0;
	while(i<a.length){
		if(a[i]>topOne){
			topOne=a[i];
			
		}
		if(a[i]>topTwo&&a[i]<topOne){
			topTwo=a[i];
			
		}
		i++;
	}
	
	System.out.println(topOne);
	System.out.println(topTwo);
}
}
