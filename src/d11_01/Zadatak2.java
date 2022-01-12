package d11_01;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning klimaUredjaj = new SmartAirConditioning();
		
		klimaUredjaj.marka = "Samsung";
		klimaUredjaj.temperatura = 16;
		klimaUredjaj.mod = "HLADI";
		
		klimaUredjaj.stampa();
		System.out.println("Mesecna potrosnja za " + klimaUredjaj.marka + " klima uredjaj je: " + klimaUredjaj.mesecnaPotrosnja() + " kW/h.");
		System.out.println("Udeo u racunu za struju koji " + klimaUredjaj.marka + " klima uredjaj napravi za mesec dana je: " + klimaUredjaj.racunZaStruju() + " dinara.");
		
		System.out.println();
		System.out.println();
		
		klimaUredjaj.marka = "Fox";
		klimaUredjaj.temperatura = 32;
		klimaUredjaj.mod = "GREJE";
		
		klimaUredjaj.stampa();
		System.out.println("Mesecna potrosnja za " + klimaUredjaj.marka + " klima uredjaj je: " + klimaUredjaj.mesecnaPotrosnja() + " kW/h.");
		System.out.println("Udeo u racunu za struju koji " + klimaUredjaj.marka + " klima uredjaj napravi za mesec dana je: " + klimaUredjaj.racunZaStruju() + " dinara.");
		
	}

}
