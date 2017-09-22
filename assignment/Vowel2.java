package assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vowel2 {

	public static void main(String args[])
	{
		Vowel2 vowel=new Vowel2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
	    String s=sc.next();
	    String answer=vowel.findVowelConsonant(s);
     }
		
	
	
	public String findVowelConsonant(String input)
	{
		String output="";
		List<Character> v=new ArrayList<Character>();
		v.add('a');
		v.add('e');
		v.add('i');
		v.add('o');
		v.add('u');
		
		char ch[]=input.toCharArray();
		if(ch.length==1)
		{
				if(Character.isDigit(ch[0]))
				{
					throw new ArithmeticException("Enter a string or letter not digit");
				}
				if(v.contains(ch[0])) {
					output="vowel";
					//System.out.println("vowel");
				}
				else
				{
					output="consonant";
					//System.out.println("consonant");
				}
		
		}
		else {
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isDigit(ch[i]))
				{
					throw new ArithmeticException("Enter a string or letter not digit");
				}
				if(v.contains(ch[i])) {
					output=output+"vowel";
					//System.out.print("vowel ");
				}
				else
				{
					output=output+"consonant";
					//System.out.print("consonant ");
				}	
			}
		}
		return output;
    }
}
