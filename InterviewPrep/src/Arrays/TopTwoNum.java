package Arrays;
/**
 * Find Top Two Numbers in an Array
 * @author Siddiq Ahmed Syed
 *
 */
public class TopTwoNum {
public static void main(String[] args) {
    int a[]={1,4,5,100,7,10,21,9,20};
//    findTopTwo(a);
    findTopTwo2(a);
}

private static void findTopTwo2(int[] a) {
	int max1=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	int j=0;
	while(j<a.length){
		if(a[j]>max1){
			max2=max1;
			max1=a[j];
			
		}
		else if(a[j]>max2){
			max2=a[j];
		}
		j++;
	}
	System.out.println(max1+","+max2);
	
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
