package Recursion;

public class Exponent {
	public static void main(String... args){
		System.out.println(iterExponent(5,22));
		System.out.println(recExponent(5,22));
		System.out.println(betterRecExponent(5,22));
	}
/**
 * The time complexity of this method is O(log n)
 * @param base
 * @param exponent
 * @return
 */
	private static int betterRecExponent(int base, int exp) {
		// TODO Auto-generated method stub
		if(exp==0){
			return 1;
		}
		else if(exp%2==0){
			int result=betterRecExponent(base, exp/2);
			return result*result;
		}
		else{
		return base*betterRecExponent(base, exp-1);
		}
	
		}
/**
 * The time complexity is O(n)
 * @param base
 * @param power
 * @return
 */
	private static int recExponent(int base, int power) {
		// TODO Auto-generated method stub
		if(power==0){
			return 1;
		}
		return base*recExponent(base, power-1);
	}
	/**
	 * This is the iterative approach
	 * @param base
	 * @param power
	 * @return
	 */

	private static int iterExponent(int base, int power) {
		int result=1;
		if(power==0){
			return 1;
		}
		else{
			for(int i=0;i<power;i++){
				result*=base;
			}
		}
		return result;
	}
}
