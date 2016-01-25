package random;

import static org.junit.Assert.*;

import org.junit.Test;

public class TowerOfHonoiTest {

	@Test
	public void test() {
		TowerOfHonoi.solve(2,"A","B","C");
		new TowerOfHonoi(2);
	}

}
