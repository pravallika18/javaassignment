package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Vowel;

public class VowelTest {
	Vowel vowel=null;
	@Before
	public void setUp() throws Exception {
		vowel=new Vowel();
	}

	@After
	public void tearDown() throws Exception {
		vowel=null;
	}

	@Test
	public void test() {
        List<String> input= new ArrayList<String>();
		
		input.add("length");
		input.add("adas");
		input.add("lost");
		input.add("lo");
		
		String[] s=input.toArray(new String[input.size()]);
		int[] count=new int[input.size()];
		
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
		
		 List<String> expected= new ArrayList<String>();
			
			expected.add("adas");
			expected.add("lo");
			expected.add("lost");
			expected.add("length");
		
		List<String> actual=vowel.sortByComparator(m);
		System.out.println(actual);
		System.out.println(expected);
		assertEquals(expected,actual);
		
		
	}

}
