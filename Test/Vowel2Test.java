package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Vowel2;

public class Vowel2Test {
    Vowel2 vowel=null;
	
	@Before
	public void setUp() throws Exception {
		vowel=new Vowel2();
		
	}

	@After
	public void tearDown() throws Exception {
		vowel =null;
	}
	

	@Test
	public void testVowel() {
		String expected="vowel";
		String actual=vowel.findVowelConsonant("a");
		assertEquals(expected,actual);
	}
	@Test
	public void testConsonant() {
		String expected="consonant";
		String actual=vowel.findVowelConsonant("g");
		assertEquals(expected,actual);
	}
	@Test
	public void testVowelConsonant() {
		String expected="vowelconsonant";
		String actual=vowel.findVowelConsonant("ab");
		assertEquals(expected,actual);
	}

}
