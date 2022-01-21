package d20_01;

import java.util.ArrayList;

public class Igrac2 extends Osoba2 {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	-	broj (broj koji igrac nosi)
//	-	poziciju koju igra (odbrambeni, napadac, … )
//	-	niz kartona
//	-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	-	default-ni konstuktor
//	-	konstuktor sa parametrima
//	-	gettere i settere za broj, kapiten i poziciju
//	-	metodu dodaj karton, gde se dodaje karton u niz
//	-	metodu koja vraca broj zutih kartona
//	-	metodu koja vraca broj crvenih kartona
//	-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int brojDresa;
	private String pozicija;
	private ArrayList<Karton> listaKartona = new ArrayList<Karton>();
	private boolean kapiten;

	public Igrac2() {
		super();
	}

	public Igrac2(String ime, String prezime, String jmbg, int godinaRodjenja, int brojDresa, String pozicija,
			boolean kapiten) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void dodajKarton(Karton karton) {
		listaKartona.add(karton);
	}

	public int brojZutihKartona() {
		int brojZutihKartona = 0;
		for (int i = 0; i < listaKartona.size(); i++) {
			if (listaKartona.get(i).getTipKartona().equalsIgnoreCase("zuti")) {
				brojZutihKartona++;
			}
		}
		return brojZutihKartona;
	}
	
	public int brojCrvenihKartona() {
		int brojCrvenihKartona = 0;
		for (int i = 0; i < listaKartona.size(); i++) {
			if (listaKartona.get(i).getTipKartona().equalsIgnoreCase("crveni")) {
				brojCrvenihKartona++;
			}
		}
		return brojCrvenihKartona;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print("BROJ DRESA: " + this.getBrojDresa() + " || POZICIJA: " + this.getPozicija());
		if (isKapiten()) {
			System.out.print(" || IGRAC JE KAPITEN TIMA");
		} else {
			System.out.print(" || IGRAC NIJE KAPITEN TIMA");
		}
		System.out.println();
		System.out.println("BROJ ZUTIH KARTONA: " + brojZutihKartona() + " || BROJ CRVENIH KARTONA: " + brojCrvenihKartona());
	}

}
