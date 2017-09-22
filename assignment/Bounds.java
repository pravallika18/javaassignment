package assignment;

/* Bounds is a generic class in which we want to access the group of objects from same family. */

public class Bounds<x extends A> {
private x ob;
 public Bounds(x obj)
 {
	 this.ob=obj;
 }
 public String add() {
	 String s=this.ob.add();
	 return s;
 }

}
