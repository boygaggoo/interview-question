package random;

import java.util.Stack;

public class TowerOfHonoi {
	private Stack<Integer>[] towers=new  Stack[3];
	public TowerOfHonoi(int n) {
		for(int i=0;i<3;i++){
			towers[i]=new Stack<>();
		}
		addDisks(n);
		solve(n,towers[0],towers[1],towers[2]);
	}
	
	
private void solve(int n, Stack<Integer> stack, Stack<Integer> stack2,
			Stack<Integer> stack3) {
		if(n==1){
			int a=stack.pop();
			System.out.println("Stack1:"+a+"-->Stack3");
			stack3.push(a);
			}
		else{
			solve(n-1,stack,stack3,stack2);
			int a=stack.pop();
			System.out.println("Stack2:"+a+"-->Stack3");
			stack3.push(a);
			solve(n-1,stack2,stack,stack3);
		}
		
	}


private void addDisks(int n) {
		for(int i=n;i>0;i--){
			towers[0].push(i);
		}
		
	}


/**
 * Simple way to understand stack of hanoi
 * @param n
 * @param start
 * @param aux
 * @param end
 */
	public static void solve(int n, String start, String aux,
			String end) {
			if(n==1){
				System.out.println(start+"-->"+end);
			}
			else{
				solve(n-1,start,end,aux);
				System.out.println(start+"-->"+end);
				solve(n-1,aux,start,end);
				
			}
		
	}

}
