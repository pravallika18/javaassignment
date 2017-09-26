package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Create a PokemonComparator class with a comparePokemon() method that accepts an array of Pokemon objects. 
 The comparator should sorts the pokemons in order of decreasing score. If two pokemons have the same score, 
 sort them alphabetically by name.  */

public class PokemonComparator {

	public List<Pokemon> comparePokemon(List<Pokemon> p)
	{
		Collections.sort(p,new Sortpokemen());
		return p;
	}

	public static void main(String[] args) {
		PokemonComparator p=new PokemonComparator();
		Pokemon p1=new Pokemon("prathyu",2);
		Pokemon p2=new Pokemon("prasanth",4);
		Pokemon p3=new Pokemon("pravalli",3);
		Pokemon p4=new Pokemon("pranith",1);
		Pokemon p5=new Pokemon("chandrika",2);
		Pokemon p6=new Pokemon("venu",2);
		
		List<Pokemon> pm=new ArrayList<Pokemon>();
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);
		pm.add(p4);
		pm.add(p5);
		pm.add(p6);
		
		p.comparePokemon(pm);
		
		for(Pokemon pc:pm)
		{
			System.out.println("name:"+pc.name+"--------power:"+pc.power);
		}
	
	}

}
