package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Vowel {

	 public List<String> sortByComparator(Map unsortMap) {

	        List list = new LinkedList(unsortMap.entrySet());

	        //sort list based on comparator
	        Collections.sort(list, new Comparator() {
	             public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o2)).getValue())
	               .compareTo(((Map.Entry) (o1)).getValue());
	             }
	    });
	        Map sortedMap = new LinkedHashMap();
	        List list1=new LinkedList();
	        for (Iterator it = list.iterator(); it.hasNext();) {
	             Map.Entry entry = (Map.Entry)it.next();
	             list1.add(entry.getKey());
	             sortedMap.put(entry.getKey(), entry.getValue());
	        }
	        return list1;
	        
	       }    
	    


	
	public static void main(String args[])
	{
		Vowel v= new Vowel();
		
		List<String> l= new ArrayList<String>();
		
		l.add("length");
		l.add("adas");
		l.add("lost");
		l.add("lo");
		l.add("lostgfjg");
		
		String[] s=l.toArray(new String[l.size()]);
		int[] count=new int[l.size()];
		Map<String,Integer> m=new HashMap<String,Integer>();
	
		
		for(int i=0;i<s.length;i++)
		{
			int cnt=0;
			char[] ch=s[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
				{
					cnt++;
				}
			}
			count[i]=cnt;
			m.put(s[i],cnt);
			
		}
			
		for(Entry k:m.entrySet())
		{
			
		System.out.println("key:"+k.getKey()+"        value:"+k.getValue());
		}
		List sortedMap=v.sortByComparator(m);
		System.out.println(sortedMap);
		
//		for(Entry k:sortedMap.entrySet())
//		{
//			
//		System.out.println("key:"+k.getKey()+"        value:"+k.getValue());
//		}
	}

}
