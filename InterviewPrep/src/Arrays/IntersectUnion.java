package Arrays;

public class IntersectUnion {
	public static void main(String[] args) {
		int [] a={1,2,3,4};
		int [] b={3,4,5,6,7};
		union(a,b);
		intersect(a,b);
	}

	private static void union(int[] a, int[] b) {
	
		int i=a.length;
		int j=b.length;
		int k=0,l=0;
		while(k<i&&l<j){
			if(a[k]<b[l]){
				System.out.print(a[k]+",");
				k++;
			}
			else if(b[l]<a[k]){
				System.out.print(b[l]+",");
				l++;
			}else{
				System.out.print(a[k]+",");
				k++;
				l++;
			}
		}
		while(k<i){
			System.out.print(a[k]+",");
			k++;
		}
		while(l<j){
			System.out.print(b[l]+",");
		    l++;
		}
	
	}
	private static void intersect(int[] a, int[] b) {
		
		int i=a.length;
		int j=b.length;
		int k=0,l=0;
		while(k<i&&l<j){
			if(a[k]<b[l]){
				k++;
			}
			else if(b[l]<a[k]){
				
				l++;
			}else{
				System.out.print(a[k]+",");
				k++;
				l++;
			}
		}
		
	}
}
