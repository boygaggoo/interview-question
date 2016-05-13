package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveCharTest {
	@Test public void removeAtBeginning()
	{ 
		assertEquals("bc", RemoveChar.removeChar("abc", 'a')); 
		assertEquals("bc", RemoveChar.removeCharRecursive("abc", 'a')); 
		assertEquals("bcdefgh", RemoveChar.removeCharRecursive("abcdefgh", 'a')); assertEquals("bcdefgh", RemoveChar.removeCharRecursive("abcdefgh", 'a'));
		}
	@Test public void removeAtMiddle()
	{ assertEquals("abd", RemoveChar.removeChar("abcd", 'c'));
	assertEquals("abd", RemoveChar.removeCharRecursive("abcd", 'c')); 
	} 
	@Test public void removeAtEnd(){ 
		assertEquals("abc", RemoveChar.removeChar("abcd", 'd'));
		assertEquals("abc", RemoveChar.removeCharRecursive("abcd", 'd')); 
		} 
	@Test public void cornerCases(){ 
		// empty string test assertEquals("", RemoveChar.removeChar("", 'd'));
		// all removable character test assertEquals("", RemoveChar.removeChar("aaaaaaaaaaaaaa", 'a')); 
		// all but one removable characters assertEquals("b", RemoveChar.removeChar("aaaaaaaaaaaaaab", 'a')); 
		} 
	}

		
