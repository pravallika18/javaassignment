
package assignment;
import java.io.*;
import java.util.*;

public class Stmt {

	public static void main(String[] args) {
		String response="";
		Stmt st=new Stmt();
		Scanner sc=new Scanner(System.in);
		do {
		
		System.out.println("enter value");
		
        String n=sc.next(); 
        String answer=st.Tomjerry(n);
        System.out.println(answer);
	
		System.out.println(" Do u want to continue..");
		sc=new Scanner(System.in);
	  response=sc.next();
		
	}while(response.equals("yes"));

}
	/*  method accepts integer number,and  it performs the following conditional actions:
         Print Tom if number is odd
         Print Jerry, if  number is even and > 2 but < 9
         Print Tom, if  number >=  6 but <= 20,
         print Jerry, if number is even and  > 25 */
	
	public String Tomjerry(String input)
	{
		String ans="";
		try {
		int n=Integer.parseInt(input);
		
        if(n%2!=0 ||(n>=6&&n<=20)) {
        	ans="Tom";
        	
        	
        }
        if(n%2==0 &&(n>2 && n<9)||n%2==0 &&n>25) {
        	ans="jerry";
        	
        }
		}
		catch(Exception e)
		{
			throw new NumberFormatException();
		}
		return ans;
        
	}
}
