package d10_01;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Proizvod konditorski = new Proizvod();
		
		konditorski.naziv = "Secer";
		konditorski.cena = 87.5;
		konditorski.tezina = 1000;
		
		konditorski.stampa();
		
		konditorski.naziv = "Rum kasato";
		konditorski.cena = 100;
		konditorski.tezina = 450;
		
		konditorski.stampa();

	}

}
