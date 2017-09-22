package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Stmt;

public class StmtTest {
	Stmt st=null;
	@Before
	public void setUp() throws Exception {
		st=new Stmt();
		
	}

	@After
	public void tearDown() throws Exception {
		st =null;
	}

	@Test
	public void oddTest() {
		
		String actual="Tom";
		String expected=st.Tomjerry("3");
		assertEquals(expected,actual);
	}
	@Test
	public void evenTest() {
		
		String actual="jerry";
		assertEquals(st.Tomjerry("6"),actual);
	}
	@Test(expected=NumberFormatException.class)
	public void errorTest()
	{
		st.Tomjerry("one");
	}

}
