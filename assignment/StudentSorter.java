package assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class StudentSorter {

//	public List<Student> Sortstudent(List<Student> st) {
//		int n=st.size();
//		List<Student> al=new ArrayList<Student>();
//		List<Integer> age=new ArrayList<Integer>();
//		List<Integer> duplicates=new ArrayList<Integer>();
//		List<Integer> duplicates1=new ArrayList<Integer>();
//		Set<Integer> set = new TreeSet<Integer>();
//			for(Student s:st) {				
//				age.add(s.age);
//			}
//		     Collections.sort(age);
//		     Collections.reverse(age);
//	     
//			for(int c:age) {
//				if(!set.add(c))
//			    {
//			        duplicates.add(c);
//			        duplicates1.add(c);
//			    }
//			}
//			
//		for(int s:age)
//		{
//			if(duplicates.contains(s))
//			{
//				for(Student stu:st)
//				{
//					if(stu.age==s)
//					{
//						al.add(stu);
//					}
//				}
//				System.out.println("---------------------------"+s);
//				int i=duplicates.indexOf(s);
//				System.out.println("---------------------------"+i);
//				duplicates.remove(i);
//			}
//			if(!duplicates1.contains(s))
//			{
//				for(Student stu:st)
//				{
//					if(stu.age==s)
//					{
//						al.add(stu);
//					}
//				}
//			}
//			
//		}
//		for(int s:duplicates1) {
//			System.out.println(s);
//			}
//		
//		
//		return al;
//	}

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
		//ss.sortStudent(al);
		List<Student> a=ss.sortStudent(al);
		for(Student s:a) {
			System.out.println("	 Id:"+s.id+"	name:"+s.name+" 	age: "+s.age);
			}
      
	}
	

}
