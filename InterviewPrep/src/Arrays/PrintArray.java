package Arrays;

public class PrintArray {
	public static void main(String[] args) {
		Integer [] num={1,2,3,4};
		printArray(num);
	}

	private static <T> void printArray(T[] num) {
	for(int i=0;i<num.length;i++){
		System.out.println(num[i]);
	}
		
	}

}
