package it.polito.tdp.parole.model;

public class Parole_Test {

	public static void main(String[] args) {
		
		Parole p =new Parole();
		
		p.addParola("prova1");
		p.addParola("buon giorno");
		p.addParola("juventus");
		
		System.out.println(p.getElenco().toString());
		
		p.reset();
		System.out.println(p.getElenco().toString());
		
		p.addParola("prova2");
		p.addParola("buona notte");
		p.addParola("milan");
		
		System.out.println(p.getElenco().toString());

	}

}
