package assignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Write a method that accepts a Map object having key-value pairs of any size.
 The first value and the second value gets swapped. Similarly the next two should get interchange.  */

public class MapSolution1 {

	  public Map<String, String> mapTest(Map<String, String> map)   
	  {
		  Set<String> s=map.keySet();
		  int n=s.size();
		  String[] st=s.toArray(new String[s.size()]);
		  if(n%2==0)
		  {
			  
			  for(int i=0;i<n-1;i=i+2)
			  {
				 
				  String k1=st[i];
				  String k2=st[i+1];
				 
				  String v1=map.get(k1);
				  String v2=map.get(k2);
				  
				  map.put(k1, v2);
				  map.put(k2,v1);  
			  }
		  } else if((n-((n/2)+1))%2!=0)
		  {
			  for(int i=0;i<(n/2)-1;i++)
			  {
				  System.out.println("iiiiiiiiiiiiiiiiiiiiiii"+i);
				  String k1=st[i];
				  String k2=st[i+1];
				  System.out.println(k1+"       "+k2);
				  
				  String v1=map.get(k1);
				  String v2=map.get(k2);
				  
				  System.out.println(v1+"       "+v2);
				  
				  map.put(k1, v2);
				  map.put(k2,v1);  
			  }
			  for(int i=(n/2)+1;i<n-1;i++)
			  {
				  System.out.println("iiiiiiiiiiiiiiiiiiiiiii"+i);
				  String k1=st[i];
				  String k2=st[i+1];
				System.out.println(k1+"       "+k2);
				  String v1=map.get(k1);
				  String v2=map.get(k2);
				  
				  map.put(k1, v2);
				  map.put(k2,v1);  
			  } 
		  }
		  else {
			  for(int i=0;i<(n/2)-1;i=i+2)
			  {
				  String k1=st[i];
				  String k2=st[i+1];
				
				  String v1=map.get(k1);
				  String v2=map.get(k2);
				  
				  map.put(k1, v2);
				  map.put(k2,v1);  
			  }
			  for(int i=(n/2)+1;i<n-1;i=i+2)
			  {
				
				  String k1=st[i];
				  String k2=st[i+1];
				
				  String v1=map.get(k1);
				  String v2=map.get(k2);
				  
				  map.put(k1, v2);
				  map.put(k2,v1);  
			  }
			  
		  }
	    return map;
	  }
	  public static void main(String[] args) {
		  MapSolution1 ms=new MapSolution1();
		  

		  Map<String, String> m=new HashMap<String, String>();
		  Map<String, String> m1=new HashMap<String, String>();
		  
		  m.put("val1", "anas");
		  m.put("val2", "ash");
		  m.put("val3", "abc");
		  m.put("val4", "abd");
		  m.put("val5", "abg");
		  m.put("val6", "abdd");
		  
		  m1.put("val1", "abc");
		  m1.put("val2", "abd");
		  m1.put("val3", "abcff");
		  m1.put("val4", "abbd");
		  m1.put("val5", "abbc");
		 
		  
		  Map<String, String> mc=ms.mapTest(m);
		  Map<String, String> mc1=ms.mapTest(m1);
		  
		  for(Map.Entry op:mc.entrySet()){  
			   System.out.println(op.getKey()+" "+op.getValue());  
			  }
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		  for(Map.Entry op:mc1.entrySet()){  
			   System.out.println(op.getKey()+" "+op.getValue());  
			  }
		  
		  
	  }
	}

