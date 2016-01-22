package chap3;

import java.nio.Buffer;



/**
 * 3.1 Implement 3 stack with an array
 * @author Siddiq Ahmed Syed
 *
 */
public class Stacks_3_1 {
        public static int stackSize=100;
        public static int [] buffer=new int[3*stackSize];
       public static  int [] pointers={-1,-1,-1};
	public static void main(String[] args) {
	      push(1,1);
	      push(1,4);
	      push(0,1);
	      System.out.println(pop(0));

	}
	private static int pop(int stackNum) {
		if(pointers[stackNum]==-1){
			throw new IndexOutOfBoundsException();
		}
		int val=buffer[absTopOfTSack(stackNum)];
		buffer[absTopOfTSack(stackNum)]=0;//clearing index
		pointers[stackNum]--;
		return val;
		
	}
	private static void push(int stackNum, int val) {
		// TODO Auto-generated method stub
		if(pointers[stackNum]+1>stackSize){
			throw new IndexOutOfBoundsException() ;
		}
		pointers[stackNum]++;
		buffer[absTopOfTSack(stackNum)]=val;
		
	}
	private static int absTopOfTSack(int stackNum) {
		// TODO Auto-generated method stub
		return stackNum*stackSize+pointers[stackNum];
	}
	private static int peek(int stackNumber){
		
		return buffer[stackNumber==0?0:1];
	}

}
