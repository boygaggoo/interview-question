package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class CesarCipherTest {

	@Test
	public void test() {
		assertEquals(CesarCipher.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23), "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!");
//		assertEquals(CesarCipher.cipher("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",15),"Abc");
		System.out.println(CesarCipher.cipher3("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",8,21));
		
	}

}
