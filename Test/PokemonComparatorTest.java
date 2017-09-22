package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Pokemon;
import assignment.PokemonComparator;

public class PokemonComparatorTest {
	PokemonComparator pokemon=null;
	@Before
	public void setUp() throws Exception {
		pokemon=new PokemonComparator();
	}

	@After
	public void tearDown() throws Exception {
		pokemon=null;
	}

	@Test
	public void test() {
		
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
		
		List<Pokemon> expected=new ArrayList<Pokemon>();
		expected.add(p2);
		expected.add(p3);
		expected.add(p5);
		expected.add(p1);
		expected.add(p6);
		expected.add(p4);
		
		List<Pokemon> actual=pokemon.comparePokemon(pm);
		assertEquals(expected, actual);
		
	}

}
