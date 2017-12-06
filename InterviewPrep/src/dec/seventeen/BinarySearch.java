package dec.seventeen;

public class BinarySearch {
	public static void main(String[] args) {
		int [] a={1,2,3,4,5,6,7,9};
		System.out.println(search(a,2));
		System.out.println(search(a,7));
		System.out.println(linearSearch(a,7));
	}

	private static boolean linearSearch(int[] a, int key) {
		for(int i=0;i<a.length;i++){
			if (key==a[i]){
				System.out.println("Found at:"+i);
				return true;
			}
		}
		
		return false;
	}

	private static boolean search(int[] a, int i) {
		
		int start=0;
		int end=a.length;
		while(start<  end)
		{
			int middle=(start+end)/2;
		if(a[middle]==i){
			System.out.println("position at:"+middle);
			return true;
		}
		if(i>a[middle]){
			start=middle+1;
		}else{
			end=middle-1;
		}
		
	}
		return false;
	}
}
