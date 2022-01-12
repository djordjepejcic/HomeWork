package d11_01;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;

	public void stampa() {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezina + "}}");
	}
	
	public void povecajCenu (double povecanje) {
		this.cena = this.cena + povecanje;
	}
	
	public double vratiCenuSaPopustom (int popust) {
		double cenaSaPopustom = this.cena - (this.cena * popust * 0.01);
		return cenaSaPopustom;
	}
	
	public double racunajPostarinu () {
		if (this.tezina <= 100) {
			return 200;
		} else if (this.tezina > 100 && this.tezina < 500) {
			return 400;
		} else {
			return 1000;
		}
	}
}