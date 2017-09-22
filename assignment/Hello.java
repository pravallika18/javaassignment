package assignment;
import java.util.*;
abstract class Hai
{
	abstract void say();
}
public class Hello extends Hai{
	
	static String st="static";
	
	static
	{
		System.out.println("static hello");
	}
	public static void main(String args[]) {
		Hello h=new Hello();
		h.say();
	String a="harsha";
	String d="harsha";
	String b=new String("5.9");
	if(a==d)
	{
		System.out.println("ok");
	}
		
		System.out.println(st);
		
	}
	void say() {
		System.out.println("say");
	}
	
public static void main(int args) {
		
		System.out.println("hello");
		
	}
}
