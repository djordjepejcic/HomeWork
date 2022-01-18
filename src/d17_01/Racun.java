package d17_01;

public class Racun {
//	Kreirati klasu Racun koja ima:
//	●	broj racuna (npr: 170-289328923-23)
//	●	ime i prezime osobe
//	●	trenutno stanje na racunu (npr: 100, 1220)
//	●	gettere i setter za sve atribute, sem settera za stanje na racunu
//	●	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	●	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.

	private String brojRacuna;
	private String ime;
	private String prezime;
	private double trenutnoStanjeNaRacunu;

	public Racun() {

	}

	public Racun(String brojRacuna, String ime, String prezime, double trenutnoStanjeNaRacunu) {
		this.brojRacuna = brojRacuna;
		this.ime = ime;
		this.prezime = prezime;
		this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getTrenutnoStanjeNaRacunu() {
		return trenutnoStanjeNaRacunu;
	}

	public double promenaStanjaNaRacunu(double iznos) {
		if (this.getTrenutnoStanjeNaRacunu() < 0) {
			return this.trenutnoStanjeNaRacunu = 0;
		} else {
			return this.trenutnoStanjeNaRacunu = this.getTrenutnoStanjeNaRacunu() - iznos;
		}
	}

	public void stampaj() {
		System.out.println(this.getIme() + " " + this.getPrezime() + " - " + this.getBrojRacuna());
		System.out.println("Stanje na racunu je " + this.getTrenutnoStanjeNaRacunu() + "rsd.");
		System.out.println();
	}
}
