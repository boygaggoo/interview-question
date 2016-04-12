package algorithms;

public class DiagnolDifference {

    public static void main(String[] args) {
        int a[][]={{11, 2 ,4},
        		{4, 5 ,6},
        		{10 ,8 ,-12}};
        System.out.println(getAbsDiff(a));

}

	private static int getAbsDiff(int[][] a) {
	     int first_diag=0,second_diag=0,abs_diff=0;
	     int N=a.length;
	     for(int i=0,j=N-1,k=0,count=0;count<N;i++,j--,k++,count++){
	    	 first_diag+=a[k][k];
	    	 second_diag+=a[i][j];
	     }
	     abs_diff=Math.abs(first_diag-second_diag);
		return abs_diff;
	}
}
