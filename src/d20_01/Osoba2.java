package d20_01;

public class Osoba2 {
//	Kreirati klasu Osoba koja ima:
//	-	ime i prezime
//	-	jmbg
//	-	godinu rodjenja
//	-	default-ni konstuktor
//	-	konstuktor sa parametrima
//	-	gettere i settere 
//	-	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected int godinaRodjenja;

	public Osoba2() {

	}

	public Osoba2(String ime, String prezime, String jmbg, int godinaRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
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

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void stampaj() {
		System.out.println("IME I PREZIME: " + this.getIme() + " " + this.getPrezime() + " || JMBG: " + this.getJmbg()
				+ " || GODINA RODJENJA: " + this.getGodinaRodjenja() + ".");
	}

}
