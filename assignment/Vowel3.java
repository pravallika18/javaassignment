package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Vowel3 {
	
	public List<String> compareVowels(List<Vowelcount> list)
	{
		Collections.sort(list,new Sortwords());
		List<String> sorted=new ArrayList<String>();
		for(Vowelcount st:list)
		{
		sorted.add(st.getWord());
		}
		return sorted;
	}
	
	public static void main(String args[])
	{
		Vowel3 v= new Vowel3();
		
		List<String> l= new ArrayList<String>();
		
		l.add("length");
		l.add("adas");
		l.add("lost");
		l.add("lo");
		l.add("lostghggh");
		
		String[] s=l.toArray(new String[l.size()]);
		
		List<Vowelcount> vc=new ArrayList<Vowelcount>();
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
			
			vc.add(new Vowelcount(s[i], cnt));
			
		}
		
		List<String> sorted=v.compareVowels(vc);
		
		System.out.println(sorted);
		

	}
	

}
class Sortwords implements Comparator<Vowelcount>
{

	@Override
	public int compare(Vowelcount o1, Vowelcount o2) {
		
		Integer i1= (o1.getCount());
        Integer i2= (o2.getCount());
        
       
        int sComp =i1.compareTo(i2);
       
        if (sComp != 0) {
           return i2-i1;
        } else {
        	String x1 = (o1.getWord());
            String x2 = (o2.getWord());
            int l1=x1.length();
            int l2=x2.length();
           return l1-l2;
        }
	}
	
}
