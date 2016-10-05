package random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;



import datastructures.LinkedList;

public class AngryProfessor {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("");
		
		Collections.sort(names);
		Scanner in=new Scanner(System.in);
		int noOfTestcases=in.nextInt();
		
	    while(noOfTestcases>0){
	    	int n=in.nextInt();
			int k=in.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			isClassCancelled(arr, k);
			noOfTestcases--;
	    }
	    
	    }
			private static void isClassCancelled(int[] students, int threshold) {
				int countOfStudents=0;
				for(int i=0;i<students.length;i++){
					if(students[i]<=0){
						countOfStudents++;
					}
				}
				if(countOfStudents>=threshold){
					System.out.println("No");
				}
				else{
					System.out.println("Yes");
				}
				
			}
	    
	}


