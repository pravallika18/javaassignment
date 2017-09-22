package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Vowel3;
import assignment.Vowelcount;

public class Vowel3Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
         Vowel3 v= new Vowel3();
		
		List<String> l= new ArrayList<String>();
		
		l.add("length");
		l.add("adas");
		l.add("lost");
		l.add("lo");
		l.add("lostghggh");
		l.add("aeio");
		
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
		
		List<String> actual=v.compareVowels(vc);
		List<String> expected=new ArrayList<String>();
		
		expected.add("aeio");
		expected.add("adas");
		expected.add("lo");
		expected.add("lost");
		expected.add("length");
		expected.add("lostghggh");
		
		assertEquals(expected, actual);
		
	}

}
