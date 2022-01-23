package d21_01;

public class Sektor {
//	Kreirati klasu Sektor koja ima:
//	naziv sektora
//	platu koja je za taj sektor

	private String nazivSektora;
	private double plata;

	public Sektor() {

	}

	public Sektor(String nazivSektora, double plata) {

		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}

	public String getNazivSektora() {
		return nazivSektora;
	}

	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

}
