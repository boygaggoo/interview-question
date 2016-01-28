package random;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {
	
	@Test
	public void test() {
		int [][] a={{1,4},{2,3},{5,6}};
		int [][] b={{1,4},{2,3},{1,2}};
		int [] []c=new int[3][2];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<2;j++){
			c[i][j]=a[i][j]+b[i][j];
		}
		
	}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<2;j++){
				if (i==0){
				System.out.printf("%d ", c[i][j]);
				}
				if (i==0 && j==2)
					System.out.println();
				if (i>0)
					System.out.printf("%d ", c[i][j]);
					
				
}
		}
	}
}
