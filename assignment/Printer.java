package assignment;

/* Printer class with a printArray() single method (No method overloading) that accept a single argument 
 that can be String or integer array, and prints the array elements. */

public class Printer {

	public <R> void printArray(R[] o) {
		for(R e:o)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		Printer p=new Printer();
		Integer[] i= {1,2,6,4,5};
		String[] s= {"a","b","c","d","e"};
		
		p.printArray(i);
		p.printArray(s);
	}
}
