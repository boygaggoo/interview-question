package maths;

public class NumberMirror {
	public static void main(String[] args) {
		System.out.println(isMirror(12321));
	}

	private static String isMirror(int num) {
		String numString=num+"";
		int j=numString.length()-1;
		for(int i=0;i<numString.length()/2;i++){
			if(numString.charAt(i)!=numString.charAt(j)){
				return "No";
			}
			j--;
		}
		return "Yes";
	}

}
