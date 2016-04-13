package Arrays;

import java.util.Arrays;

public class PythogoreanTripplet {
	public static void main(String[] args) {
		int [] a={3,1,4,6,5};
		//System.out.println(triplet(a));
		System.out.println(efficientTripplet(a));
	}

	private static boolean efficientTripplet(int[] a) {
	Arrays.sort(a);
	for(int i=0;i<a.length;i++){
		a[i]=a[i]*a[i];
	}
	for(int i=a.length-1;i>=2;i--){
	int last=i-1;
	int first=0;
	while(first<last){
		
			if(a[first]+a[last]==a[i]){
				return true;
			}
			if(a[first]+a[last]<a[i]){
				first++;
			}else{
				last--;
			}
		}
	}
		return false;
	}

	private static boolean triplet(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-2;i++){
			for(int j=1+1;j<a.length-1;j++){
				for(int k=j+1;k<a.length;k++){
					if(Math.pow(a[i],2)+Math.pow(a[j],2)==Math.pow(a[k], 2)){
						System.out.println(Math.pow(a[i],2)+"+"+Math.pow(a[j],2)+"=="+Math.pow(a[k], 2));
						return true;
					}
				}
			}
		}
		return false;
	}

}
