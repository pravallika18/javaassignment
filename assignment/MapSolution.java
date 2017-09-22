package assignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSolution {
	
	/* method that accepts a Map object having two key-value pairs If the key "val1" has a value, set the key "val2" to have that value, and
	Set the key "val1" to have the value "" (empty string). */
	  public Map<String, String> mapTest(Map<String, String> map)   
	  {
		  /* Retrieving all key values into one set */
		  Set<String> s=map.keySet();
		  String[] st=s.toArray(new String[s.size()]);
		  
		  String k1=st[0];
		  String k2=st[1];
		  
		  String v=map.get(k2);
		  
		 /* changing values in map */
		  map.put(k1, v);
		  map.put(k2,"");
	    return map;
	  }
	  public static void main(String[] args) {
		  MapSolution ms=new MapSolution();
		  

		  Map<String, String> m=new HashMap<String, String>();
		  Map<String, String> m1=new HashMap<String, String>();
		  
		  m.put("val1", "anas");
		  m.put("val2", "ash");
		  
		  
		  m1.put("val1", "abc");
		  m1.put("val2", "abd");
		  
		  /* passing maps to mapTest method as a parameter and it returns modified map */
		  
		  Map<String, String> mc=ms.mapTest(m);
		  Map<String, String> mc1=ms.mapTest(m1);
		  
		  for(Map.Entry op:mc.entrySet()){  
			   System.out.println(op.getKey()+" "+op.getValue());  
			  } 
		  for(Map.Entry op1:mc1.entrySet()){  
			   System.out.println(op1.getKey()+" "+op1.getValue());  
			  }
	  }
	}

