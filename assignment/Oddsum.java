package assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Oddsum {

	public <T> Integer sum(Collection<T> o) {
		Integer sum=0;
		for(T value:o)
		{
			Integer i=Integer.parseInt(value.toString());
			if(i%2!=0)
			{
				sum=sum+i;
			}
				
		}
		return sum;
	}

	public static void main(String args[])
	{
		Oddsum o=new Oddsum();
		
		List<Integer> i = new ArrayList<>();
		
		i.add(3);
		i.add(5);
		i.add(10);
		i.add(10);
		
		double sum =o.sum(i);
		System.out.println(sum);
		
		
		
	}

}
