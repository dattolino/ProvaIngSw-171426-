package it.unical.ingsw2020.it.unical.provaIngSw;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil x;
	
	@Before
	public void prepareOrdinaListaWorks() {
		System.out.println("before");
		int tmp[] = new int[10];
		for(int i=0; i<10; i ++) {
			tmp[i] = i;
		}
		x = new MyListUtil(tmp);
	}
	
	@Test
	public void ordinaListaWorks1() {
		boolean crescente;
		x.ordinaLista(x.getL(),true);
		int y[] = x.getL();
		if(y[0] < y[1])
			crescente=true;
		else
			crescente=false;
		assertTrue(crescente);
	}
	
	@Test(timeout=5500)
	public void ordinaListaWorks2() {
		boolean maggiore = true;
		System.out.println("stampa seconda");
		x.ordinaLista(x.getL(), false);
		for(int i=1; i<x.getL().length; i++) {
			if(x.getL()[i] > x.getL()[0])
				maggiore=false;
		}
		assertTrue(maggiore);
	}

}
