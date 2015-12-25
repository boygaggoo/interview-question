package chap1;

public class Matrix {
/**
 * if there exist a zero than set the complete row and corresponding column
 * to zeros.
 * 
 * @param a
 * @return
 */
	public static int[][] setZero(int[][] a) {
		boolean [] row=new boolean[a.length];
		boolean [] col=new boolean[a[0].length];
		
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]==0){
					row[i]=true;
					col[j]=true;
				}
			}
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(row[i]||col[j]){
					a[i][j]=0;
				}
			}
			
		}
		return a;
	}

}
