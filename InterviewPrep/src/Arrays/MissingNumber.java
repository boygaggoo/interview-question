package Arrays;

public class MissingNumber {
public static void main(String[] args) {
	int []a={1,2,3,5};
	findMissingNumber(a,5);
}

private static void findMissingNumber(int[] a,int n) {
	int expectedSum=n*((n+1)/2);
	int actualSum=0;
	for(int i:a){
		actualSum+=i;
	}
	System.out.println(expectedSum-actualSum);
	
}
}
