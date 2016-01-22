package random;

public class OccuranceSortedList {

	public static int count(int[] a,int k) {
		int start=0;
		int end=a.length;
		int result=-1;
		while(start<=end){
			int medium=(start+end)/2;
			if(k==a[medium]){
				end=medium-1;
				result=medium;
			}
			else if (k<a[medium]){
				end=medium-1;
			}
			else{
				start=medium+1;
			}
			
		}
		return result;
		
	}

	public static int totalCount(int[] a, int i) {
		// TODO Auto-generated method stub
		int firstOccurance=countOcc(a,i,true);
		int lastOccurrance=countOcc(a, i,false);
		return lastOccurrance-firstOccurance+1;
	}

	public static int countOcc(int[] a, int k, boolean firstOcc) {
		int start=0;
		int end=a.length;
		int result=-1;
		while(start<=end){
			int medium=(start+end)/2;
			if(k==a[medium]){
				if(firstOcc){
				end=medium-1;
				}
				else{
					start=medium+1;
				}
				result=medium;
			}
			else if (k<a[medium]){
				end=medium-1;
			}
			else{
				start=medium+1;
			}
			
		}
		return result;
	}

}
