package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Oddsum;

public class OddsumTest {

	Oddsum oddsum=null;
	
	@Before
	public void setUp() throws Exception {
		oddsum=new Oddsum();
		
	}

	@After
	public void tearDown() throws Exception {
		oddsum =null;
	}
	
	@Test
	public void test() {
    List<Integer> i = new ArrayList<>();
		
		i.add(3);
		i.add(5);
		i.add(1);
		i.add(10);
	
		Integer actual =oddsum.sum(i);
		 assertTrue(9 == actual);
	}

}
