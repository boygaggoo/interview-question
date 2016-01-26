package random;

import java.util.Scanner;

public class SearchInCircularSortedArray {

    public static void main(String[] args) {

        int A[] = {8,11,13,17,22,29,0,3,5,6,7};
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int index = circularArraySearch(A, in);
        if (index != -1)
        System.out.println("Index of " +in+ " in the given array is " +index);
        else System.out.println("Number not in Array!");

    }

    public static int circularArraySearch(int A[], int in){

        int start = 0;
        int end = A.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (A[mid] == in)
                return mid;
            else if (A[mid] <= A[end]){
                if (in > A[mid] && in <= A[end])
                    start = mid + 1;
                else
                    end = mid -1;
            }
            else if (A[mid] >= A[start]){
                if (in >= A[start] && in < A[mid] )
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;

    }
}