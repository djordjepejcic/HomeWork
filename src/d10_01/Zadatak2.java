package d10_01;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning klimaUredjaj = new SmartAirConditioning();
		
		klimaUredjaj.marka = "Samsung";
		klimaUredjaj.temperatura = 16;
		klimaUredjaj.mod = "HLADI";
		
		klimaUredjaj.stampa();
		
		klimaUredjaj.marka = "Fox";
		klimaUredjaj.temperatura = 32;
		klimaUredjaj.mod = "GREJE";
		
		klimaUredjaj.stampa();
		
	}

}
