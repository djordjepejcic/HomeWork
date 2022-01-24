package d24_01;

public class StaklenaAmbalaza extends Ambalaza {
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza(String barKod, String nazivArtikla, double kaucija, boolean daLiSePlacaKaucija,
			double osnovnaCena) {
		this.barKod = barKod;
		this.nazivArtikla = nazivArtikla;
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	@Override
	public double cenaArtikla() {
		if (daLiSePlacaKaucija) {
			return this.getOsnovnaCena() * 1.2 + this.getKaucija();
		} else {
			return this.getOsnovnaCena() * 1.2;
		}
	}

	@Override
	public void print() {
		System.out.println("TIP PAKOVANJA: STAKLENA AMBALAZA");
		System.out.println("BAR KOD: " + this.getBarKod());
		System.out.println("NAZIV ARTIKLA: " + this.getNazivArtikla());
		System.out.println("OSNOVNA CENA: " + this.getOsnovnaCena() + "din.");
		System.out.println("CENA ARTIKLA: " + cenaArtikla() + "din.");
		System.out.println();
	}

}
