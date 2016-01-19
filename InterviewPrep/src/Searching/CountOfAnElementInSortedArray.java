package Searching;

import java.util.Scanner;

public class CountOfAnElementInSortedArray {

    public static void main(String[] args) {

        int A[] = {1,2,3,3,4,5,5,5,6,7,7,8,9,9,9};
        int [] b={1,2,2,2,4,5,5,5,6};
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int count=0;
        int firstIndex = binarySearch(b, in, true);
        int lastIndex = binarySearch(b, in, false);
        System.out.println("Indexs:"+firstIndex+"\n"+lastIndex);
        if (firstIndex != -1)
            count = (lastIndex-firstIndex) + 1;
        System.out.println("Count of " +in+ " is " + count);

    }

    public static int binarySearch(int A[], int in, boolean b){

        int start = 0;
        int end = A.length - 1;
        int result = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
      
            if (A[mid] == in) {
                result = mid;
                if (b == true)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if (A[mid] > in)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return result;

    }
}
