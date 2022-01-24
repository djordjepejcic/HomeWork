package d24_01;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean reciklaza;
	private double osnovnaCena;

	public Tetrapak(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza,
			double osnovnaCena) {
		super(barKod, nazivArtikla, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.

	@Override
	public double cenaArtikla() {
		if (reciklaza) {
			return tezinaPakovanja() * 1.5 + this.getOsnovnaCena();
		} else {
			return this.getOsnovnaCena();
		}
	}

	@Override
	public void print() {
		System.out.println("TIP PAKOVANJA: TETRAPAK");
		System.out.println("BAR KOD: " + this.getBarKod());
		System.out.println("BRUTO TEZINA: " + this.getBrutoTezina() + "gr.");
		System.out.println("NETO TEZINA: " + this.getNetoTezina() + "gr.");
		System.out.println("NAZIV ARTIKLA: " + this.getNazivArtikla());
		System.out.println("OSNOVNA CENA: " + this.getOsnovnaCena() + "din.");
		System.out.println("CENA ARTIKLA: " + cenaArtikla() + "din.");
		System.out.println();
	}

}
