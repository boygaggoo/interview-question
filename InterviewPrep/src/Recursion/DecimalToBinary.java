package Recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary(5);
		System.out.println();
		DecimalToBinaryIterative(5);

	}

	private static void DecimalToBinary(int num) {
		if(num>0){
			DecimalToBinary(num/2);
			System.out.print(num%2);
		}
		
	}
	private static void DecimalToBinaryIterative(int num) {
	 
		while(num>0){
			System.out.print(num%2);
			num=num/2;
//			System.out.print(num%2);
		}
		
	}

}
