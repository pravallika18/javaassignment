package assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* StudentSorter class with a sortStudent() method that accepts Student object. 
Sort the list based on their age in decreasing order. For student having same age, sort based on their name.
For students having same name and age, sort them according to their iD. */

public class StudentSorter {


	public List<Student> sortStudent(List<Student> st)
	{
		Collections.sort(st,new SortStudent());
		
		return st;
	}
	public static void main(String[] args) {
		StudentSorter ss=new StudentSorter();
		
		Student s1=new Student(1,"venu",25);
		Student s2=new Student(3,"prathyu",23);
		Student s3=new Student(2,"prathyu",23);
		Student s4=new Student(4,"pravallika",24);
		Student s5=new Student(5,"praneeth",28);
		Student s6=new Student(6,"chandrika",30);
		Student s7=new Student(6,"asdjjakj",30);
		List<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		
		List<Student> a=ss.sortStudent(al);
		for(Student s:a) {
			System.out.println("	 Id:"+s.id+"	name:"+s.name+" 	age: "+s.age);
			}
      
	}
	

}
