package d11_01;

import d11_01.Proizvod;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Proizvod konditorski = new Proizvod();
		double povecanje = 50;
		int popust = 20;
		
		konditorski.naziv = "Cimet rolnice";
		konditorski.cena = 250;
		konditorski.tezina = 450;
		
		konditorski.stampa();
		konditorski.povecajCenu(povecanje);
		System.out.println("Cena je sada povecana i iznosi: " + konditorski.cena + " dinara.");
		
		System.out.println("Cena sa popustom od " + popust + "% je: " + konditorski.vratiCenuSaPopustom(popust) + " dinara.");
		
		System.out.println("Cena postarine za " + konditorski.naziv + " sa tezinom od " + konditorski.tezina + " grama je " + konditorski.racunajPostarinu() + " dinara.");
		
		System.out.println();
		System.out.println();
		
		Proizvod ribolovackaOprema = new Proizvod();
		ribolovackaOprema.naziv = "Stap za pecanje";
		ribolovackaOprema.cena = 15000;
		ribolovackaOprema.tezina = 1450;
		
		ribolovackaOprema.stampa();
		ribolovackaOprema.povecajCenu(povecanje);
		System.out.println("Cena je sada povecana i iznosi: " + ribolovackaOprema.cena + " dinara.");
		
		System.out.println("Cena sa popustom od " + popust + "% je: " + ribolovackaOprema.vratiCenuSaPopustom(popust) + " dinara.");
		
		System.out.println("Cena postarine za " + ribolovackaOprema.naziv + " sa tezinom od " + ribolovackaOprema.tezina + " grama je " + ribolovackaOprema.racunajPostarinu() + " dinara.");
		
	}

}
