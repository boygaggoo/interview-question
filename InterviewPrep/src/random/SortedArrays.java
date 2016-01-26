package random;

import java.util.Arrays;

//a={1,1,1,2,2,3,4,4,5}
public class SortedArrays {

	public static int removeDuplicates(int[] a) {
	int unique=1;

	int temp=a[0];
		for(int j=1;j<a.length;j++){
			
			if(temp!=a[j]){
				unique++;
				temp=a[j];
			}
	}
	return unique;
		
	}

	public static int removeDuplicates2(int[] a) {

		int count=0;
		int temp=a[0];
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]){count++;}
		}
		return (a.length-count);
	}

	public static int[] removeDuplicates3(int[] b) {
		// TODO Auto-generated method stub
		for(int i=0;i<b.length-1;i++){
			if(b[i]==b[i+1]){b[i]=Integer.MAX_VALUE;}
		}
		for(int i=0;i<b.length;i++){

			for(int j=0;j<b.length-1-i;j++){
				if(b[j]>b[j+1]){
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;

				}
				
			}
		}
		return b;
		
	}

	public static int [] removeDuplicates4(int[] a) {
		// TODO Auto-generated method stub
		int i=0,j=1;
		while(j<a.length){
			if(a[i]==a[j]){
				j++;
			}
			else{
				i++;
				a[i]=a[j];
				j++;
			}
		}
		return Arrays.copyOf(a, i+1);
			
		
	}
}
