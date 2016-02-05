package Sorting;



import java.util.Arrays;
import java.util.Random;

class QuickSort3 {

    public static void main(String[] args) {

        int A[] = {7,4,10,9,1,5,8,2,6,3};
            A = quickSort(A, 0, A.length - 1);
            System.out.println(Arrays.toString(A));

    }

    public static int[] quickSort(int[] A, int start, int end) {

        if (start>=end)
            return A;
        int partitionIndex = randomizedPartition(A, start, end);
        quickSort(A, start, partitionIndex-1);
        quickSort(A, partitionIndex+1, end);
        return A;

    }

    public static int randomizedPartition(int[] A, int start, int end) {

        Random r = new Random();
        int PivotIndex = r.nextInt(end-start+1)+start;
        int temp = A[PivotIndex];
        A[PivotIndex] = A[end];
        A[end] = temp;
        return partition(A, start, end);
    }

    public static int partition(int[] A, int start, int end){

        int pivot = A[end];
        int partitionIndex = start;
        for (int i=start;i<end;i++){
            if (A[i] <= pivot){
                int temp = A[i];
                A[i] = A[partitionIndex];
                A[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp = A[partitionIndex];
        A[partitionIndex] = A[end];
        A[end] = temp;
        return partitionIndex;

    }
}
