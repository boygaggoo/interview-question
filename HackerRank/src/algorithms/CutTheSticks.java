package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * You are given NN sticks, where the length of each stick is a positive integer. 
 * A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. 

The above step is repeated until no sticks are left.

Given the length of NN sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).
 * @author Siddiq Ahmed Syed
 *
 */
public class CutTheSticks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> newArr=new ArrayList<Integer>();
       
        for(int arr_i=0; arr_i < n; arr_i++){
            
            newArr.add(in.nextInt());
        }
        cutThemOut(newArr);
	}

	private static void cutThemOut(ArrayList<Integer> arr) {
		if(arr.size()<1){
			System.out.println("Done");
			return;
		}
		//System.out.println(arr);
		Collections.sort(arr);
		int min=arr.get(0);
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++){
			arr.set(i, arr.get(i)-min);
			
		}
		
		for(int i = 0; i < arr.size();i++){
		    if(arr.get(i).equals(0)){
		        arr.remove(i--);
		    }
		}
		
		
		cutThemOut(arr);
		
		
	}

	
}
