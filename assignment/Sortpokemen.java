package assignment;

import java.util.Comparator;

public class Sortpokemen implements Comparator<Pokemon> {

	public int compare(Pokemon a, Pokemon b) {
		
		Integer i1= (a.getPower());
        Integer i2= (b.getPower());
        
       
        int sComp =i1.compareTo(i2);
       
        if (sComp != 0) {
           return i2-i1;
        } else {
        	String x1 = (a.getName());
            String x2 = (b.getName());
           return x1.compareTo(x2);
        }
       
		}
}
