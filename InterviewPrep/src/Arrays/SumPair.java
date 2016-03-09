package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SumPair {
public static void main(String[] args) {
	int a[]={2,3,1,4,5};
//	findSumPair(a,5);
//	findSumPairEfficient(a,5);//uses additional memory O(n)
	findSumPairEfficient2(a,5);//does not used addition memory O(nlogn)
printPairsUsingTwoPointers(a, 5);
}
private static void findSumPairEfficient2(int[] a, int k) {
	if(a.length<2){
		return;
	}
	Arrays.sort(a);
	int i=0;
	int j=a.length-1;
	while(i<j){
	int sum=a[i]+a[j];
	if(k==sum){
		System.out.println(i+","+j);
		i=i+1;
		j=j-1;
	}
	else if(sum < k){ 
		i = i +1;
			}
	else if (sum > k) {
       j=j-1;  
	} 
	}
	
}
private static void findSumPairEfficient(int[] a, int sum) {
    ArrayList<Integer> numbers=new ArrayList<>();
   for(int i=0;i<a.length;i++){
    	numbers.add(a[i]);
    }
	for(int i:a){
		int b=sum-i;
		if(numbers.contains(b)){
			System.out.println(i+","+b);
		}
	}
}
/**
 * Complexity is O(n*n)
 * @param a
 * @param sum
 */
private static void findSumPair(int[] a, int sum) {
	 for(int i=0;i<a.length;i++){
		 int k=a[i];
		 for(int j=i+1;j<a.length;j++){
			 if(k+a[j]==sum){
				 System.out.println(k+","+a[j]);
			 }
		 }
	 }
	
}
public static void printPairsUsingTwoPointers(int[] numbers, int k){ 
	if(numbers.length < 2){ return; } 
	Arrays.sort(numbers); int left = 0; 
	int right = numbers.length -1; 
	while(left < right){ 
		int sum = numbers[left] + numbers[right];
		if(sum == k){ 
			System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
			left = left + 1; 
			right = right -1; }
		else if(sum < k){ 
			left = left +1;
				}
		else if (sum > k) {
			right = right -1;
			} 
		} 
	} 


}
