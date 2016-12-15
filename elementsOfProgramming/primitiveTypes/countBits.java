package primitiveTypes;

public class countBits {
	public static void main(String[] args) {
		System.out.println(countBits.count(11));
		System.out.println(8<<1);
	}

	private static short count(int x) {
		short numBits=0;
		while(x!=0){
			numBits+=(x&1);
			x>>>=1;
		}
		return numBits;
		
	}

}
