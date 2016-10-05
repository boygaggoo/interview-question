package hackerrank.challenge.crackingthecoding;

public class MakingAnagrams {
	public static void main(String[] args) {
		System.out.println(numberNeeded("cde", "abc"));
	}
	
	public static int numberNeeded(String first, String second) {
		StringBuilder sb=new StringBuilder(first);
		StringBuilder sb2=new StringBuilder(second);
		for(char c:second.toCharArray()){
			int pos=sb.indexOf(c+"");
			if(pos!=-1){
				sb.deleteCharAt(pos);
				int pos2=sb2.indexOf(c+"");
				sb2.deleteCharAt(pos2);
			}
		}
//		System.out.println(sb+","+sb2);
	      return sb.length()+sb2.length();
    }

}
