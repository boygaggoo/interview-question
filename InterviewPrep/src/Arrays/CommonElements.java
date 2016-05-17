package Arrays;
/**
Given three arrays sorted in non-decreasing order, print all common 
elements in these arrays.
*/

public class CommonElements {
	public static void main(String[] args) {
		int []input1 = {1, 5, 10, 20, 40, 80,120};
		int [] input2 = {6, 7, 20, 80, 100,120};
		int [] input3 = {3, 4, 15, 20,30, 70, 80, 120};
	    commonElements(input1,input2,input3);

		
	}

	private static void commonElements(int[] a, int[] b, int[] c) {
		int len1=a.length;
		int len2=b.length;
		int len3=c.length;
		int i=0,j=0,k=0;
		while(i<len1&&j<len2&&k<len3){
			if(a[i]==b[j]&&a[i]==c[k]){
				System.out.println(a[i]);
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j]&&a[i]<c[k]){
				i++;
			}
			else if(b[j]<a[i]&&b[j]<c[k]){
				j++;
			}
			else if(c[k]<a[i]&&c[k]<b[j]){
				k++;
			}else{
				i++;
				j++;
				k++;
			}
		}
		
	}
	

	
}
