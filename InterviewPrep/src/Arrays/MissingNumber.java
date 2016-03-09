package Arrays;

public class MissingNumber {
public static void main(String[] args) {
	int []a={1,2,3,5,6};
	findMissingNumber(a,5);
}

private static void findMissingNumber(int[] a,int n) {
	int actSize=n*(n+1)/2;
	for(int i:a){
		actSize-=i;
	}
	System.out.println(actSize);
	
}
}
