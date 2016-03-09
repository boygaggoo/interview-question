package Arrays;

public class MinMax {
 public static void main(String[] args) {
	int [] a={4,3,1,5,6,8,9,11,-2};
	 findMinMax(a);
}

private static void findMinMax(int[] a) {
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i:a){
    	if(i<min){
    		min=i;
    	}
    	else if(i>max){
    		max=i;
    	}
    }
    System.out.println("Min:"+min+"\nMax:"+max);
	
}
}
