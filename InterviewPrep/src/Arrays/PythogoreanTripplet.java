package Arrays;

import java.util.Arrays;

public class PythogoreanTripplet {
	public static void main(String[] args) {
		int [] a={3,1,4,6,5};
		System.out.println(triplet(a));
		System.out.println(efficientTripplet(a));
	}

	private static boolean efficientTripplet(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			a[i]=(int)Math.pow(a[i], 2);
		}
		int last=a.length-1;
		while(last>0){
			for(int i=0;i<last;i++){
				if(a[i]+a[i+1]==a[last]){
					return true;
				}
			}
			last--;
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
