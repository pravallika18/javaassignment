package Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.MapSolution;

public class MapSolutionTest {
	MapSolution ms=null;
	@Before
	public void setUp() throws Exception {
		ms=new MapSolution();
		
	}

	@After
	public void tearDown() throws Exception {
		ms =null;
	}

	@Test
	public void mapsEqualsTest() {
		  Map<String, String> m=new HashMap<String, String>();
		  
		  m.put("val1", "anas");
		  m.put("val2", "ash");
		  Map<String, String> actual=ms.mapTest(m);
		  
		  Map<String, String> expected=new HashMap<String, String>();
		  expected.put("val1", "");
		  expected.put("val2", "anas");
		  
		  for(Map.Entry<String, String> value:expected.entrySet()){
		        assertEquals(value.getValue(), actual.get(value.getKey()));
		    }
		  
	}

}
