package it.unical.ingsw2020.it.unical.provaIngSw;


public class MyListUtil {
	
	private int l[] = new int[10];
	
	public void ordinaLista( boolean crescente) {
		int tmp=0;
		for(int i=0; i<10; i++) {
			l[i] = i;
		}
		if(crescente) {
		  for(int i=0; i<l.length; i++) {
			if(l[i] > l[i+1]) {
				tmp = l[i];
				l[i] = l[i+1];
				l[i+1] = tmp;
			}
		  }
		}
		else {
		  for(int i=0; i<l.length; i++) {
			if(l[i] < l[i+1]) {
			    tmp = l[i];
				l[i] = l[i+1];
				l[i+1] = tmp;
			}
		  }
		}
		stampaLista();
	}
	public void stampaLista() {
		for(int i=0; i<l.length; i++)
			System.out.println(l[i]);
	}
	

}
