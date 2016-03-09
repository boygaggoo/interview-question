package String;

public class HighestOccuredCharacter {
	public static void main(String[] args) {
		System.out.println(countOccurance("abbbbbc",'b',true));
	}

	private static int countOccurance(String str, char c,boolean occurance) {
		int start=0;
		int end=str.length()-1;
		int result=-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(str.charAt(mid)==c){
				result=mid;
				if(occurance){
					start=mid+1;
				}
				else{
					end=mid-1;
				}
				return mid;
			}
			else if(c<str.charAt(mid)){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			
		}
		return result;
		
		
	}

}
