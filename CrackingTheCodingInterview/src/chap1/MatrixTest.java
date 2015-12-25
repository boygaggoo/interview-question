package chap1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MatrixTest {

	@Test
	public void test() {
		int [][] a=new int[][]{
				{1,0,1},
				{2,3,2},
				{5,5,6}
		};
		System.out.println(Arrays.deepToString(Matrix.setZero(a)));
	}

}
