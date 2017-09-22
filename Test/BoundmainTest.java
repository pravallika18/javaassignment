package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.B;
import assignment.Boundmain;
import assignment.Bounds;

public class BoundmainTest {

	Boundmain boundsmain=null;
	@Before
	public void setUp() throws Exception {
		 boundsmain=new Boundmain();
	}

	@After
	public void tearDown() throws Exception {
		 boundsmain=null;
	}

	@Test
	public void testA() {
		Bounds<B> b=new Bounds<B>(new B());
		String actual=b.add();
		assertEquals("method in B class",actual);
		
	}

}
