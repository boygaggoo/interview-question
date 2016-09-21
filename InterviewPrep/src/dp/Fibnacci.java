package dp;

import java.util.HashMap;

public class Fibnacci {
	static HashMap<Integer, Integer> memo=new HashMap<Integer, Integer>();
	static int[] fib=new int[40];
	public static void main(String[] args) {
		System.out.println(fibs(25));
	}

	private static int fibs(int n) {
		// TODO Auto-generated method stub
		if(n<=2){
			return 1;
		}
		else{
			if(fib[n]!=0){
				return fib[n];
			}else{
				int result=fibs(n-1)+fibs(n-2);
				fib[n]=result;
			}
		}
		return fib[n];
	
	}

}
