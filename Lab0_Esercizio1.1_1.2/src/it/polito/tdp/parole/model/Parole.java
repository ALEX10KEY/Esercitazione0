package it.polito.tdp.parole.model;
import java.util.*;


public class Parole {
	
	private List<String> lista =new ArrayList<String>();
	
	public void addParola(String p){
		lista.add(p);
		/*
		System.out.println("Parola aggiunta: "+p);
		String elenco=new String();
		boolean altro=false;
		Collections.sort(lista);
		for( String s:lista){
			elenco+=s;
			if (altro==true)
				elenco+=" ";
			altro=true;
		}
		System.out.println(elenco);
		*/
	}
	
	public List<String> getElenco(){
		Collections.sort(lista);
		return lista;
	}
	
	public void reset(){
		lista.removeAll(lista);
	}
}
