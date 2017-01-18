package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
  * Given an array find a subarray whose sum is equal to given X
  * @author Siddiq Ahmed Syed
  *
  */
public class EqualSum {

	public static void main(String[] args) {
		int [] num={0,1,2,3,4,5};
		System.out.println(findSum(num,6));
		
	}

	private static  List<Integer> findSum2(int[] num, int x) {
		List<Integer> result=new ArrayList<>();
		int arrLen=num.length-1,i=0;
		while(i<arrLen){
			if(num[i]+num[arrLen]==x){
				result.add(num[i]);
				result.add(num[arrLen]);
				i++;
				arrLen--;
			}
			if(num[i]+num[arrLen]<x){
				i++;
			}
			else{
				arrLen--;
			}
			
			
		}
		return result;
	}

	private static List<Integer> findSum(int[] num, int x) {
		List<Integer> result=new ArrayList<>();
		int arrLen=num.length,i=0, currSum=0;
		
		while(i<arrLen){
			 currSum=num[i];
			if(currSum==x){
				result.add(num[i]);
			}
			else{
				for(int j=i+1;j<arrLen;j++){
					currSum+=num[j];
						if(currSum==x){
						result.add(num[i]);
						result.add(num[j]);
						return result;
						}
				}
			}
			i++;
		}
		return result;
	}

}
