package assignment;

/* A is a super class of B and C.We can access the method inside the A,B,C classes using Bounds class. */

public class Boundmain {
	
	
public static void main(String args[])
{
	/* we are creating object for B class and passing it to Bounds class from there we are calling add method in B class */
	
	Bounds<A> b1=new Bounds<A>(new B());
	b1.add();
	Bounds<B> b=new Bounds<B>(new B());
	b.add();
	
	/* we are creating object for C class and passing it to Bounds class from there we are calling add method in C class */
	
	Bounds<C> c=new Bounds<C>(new C());
	c.add();
	
}

}
