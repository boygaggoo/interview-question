package Arrays;

public class RotateArray {
public static void main(String[] args) {
	int [][] a={{0,1},
			{3,	2}};
	
	rotate(a,90);
}
//11  0 1
//00  0  1  
private static void rotate(int[][] a, int rot) {
	int len=a.length;
     for(int i=0;i<a.length;i++){
    	 for(int j=0;j<a.length;j++){
    		 System.out.println(a[j][len-1-i]+"="+a[i][j]);
    	 }
     }
     }
}
