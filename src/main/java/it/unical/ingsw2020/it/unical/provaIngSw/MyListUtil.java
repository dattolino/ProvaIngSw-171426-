package it.unical.ingsw2020.it.unical.provaIngSw;


public class MyListUtil {
	
	
	private int l[];
	
	public MyListUtil(int[] l) {
		super();
		this.l = l;
	}
	public int[] getL() {
		return l;
	}
	public void setL(int[] l) {
		this.l = l;
	}
	public void ordinaLista(int lista[], boolean crescente) {
		int tmp=0;
		
		if(crescente) {
		 for(int j=0; j<lista.length-1; j++) {	
		  for(int i=0; i<lista.length-1; i++) {
			if(l[i] > l[i+1]) {
				tmp = l[i];
				l[i] = l[i+1];
				l[i+1] = tmp;
			}
		  }
		 }
		} 
		else {
		 for(int j=0; j<lista.length-1; j++) {		
		  for(int i=0; i<lista.length-1; i++) {
			if(l[i] < l[i+1]) {
			    tmp = l[i];
				l[i] = l[i+1];
				l[i+1] = tmp;
			}
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
