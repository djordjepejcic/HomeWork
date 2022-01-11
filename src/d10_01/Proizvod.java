package d10_01;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;

	public void stampa() {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezina + "}}");
	}
}