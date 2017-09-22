package Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.MapSolution1;

public class MapSolution1Test {
	
	MapSolution1 ms=null;
	@Before
	public void setUp() throws Exception {
		ms=new MapSolution1();
		
	}

	@After
	public void tearDown() throws Exception {
		ms =null;
	}


	@Test
	public void evenMapTest() {

		  Map<String, String> m=new HashMap<String, String>();
		  Map<String, String> expected=new HashMap<String, String>();
		  
		  m.put("val1", "anas");
		  m.put("val2", "ash");
		  m.put("val3", "abc");
		  m.put("val4", "abd");
		  m.put("val5", "abg");
		  m.put("val6", "abdd");
		  
		  expected.put("val1", "ash");
		  expected.put("val2", "anas");
		  expected.put("val3", "abd");
		  expected.put("val4", "abc");
		  expected.put("val5", "abdd");
		  expected.put("val6", "abg");
		 
		  
		  Map<String, String> actual=ms.mapTest(m);
		  
		  for(Map.Entry<String, String> value:expected.entrySet()){
		        String actualValue = actual.get(value.getKey());
		        assertEquals("checking",value.getValue(), actualValue);
		    }
		  
		  
		
	}
	@Test
	public void oddMapTest() {

		  Map<String, String> m1=new HashMap<String, String>();
		  Map<String, String> expected=new HashMap<String, String>();
		  
		 
		  
		  m1.put("val1", "abc");
		  m1.put("val2", "abd");
		  m1.put("val3", "abcff");
		  m1.put("val4", "abbd");
		  m1.put("val5", "abbc");
		  
		  expected.put("val1", "abd");
		  expected.put("val2", "abc");
		  expected.put("val3", "abcff");
		  expected.put("val4", "abbc");
		  expected.put("val5", "abbd");
		  
		 
		  
		  Map<String, String> actual=ms.mapTest(m1);
		  for(Map.Entry value:expected.entrySet()){
		        assertEquals(value.getValue(), actual.get(value.getKey()));
		    }
		 
		
	}
	

}
