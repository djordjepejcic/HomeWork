package vezbanje16_01;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	Ime i prezime
//	godinu rodjenja
//	pol
//	oca- koji je takodje Osoba
//	majku - takodje je Osoba
//	Gettere i settere
//	difoltni konstruktor
//	konstruktor koji postavlja ime i prezime i godinu rodjenja i pol

	private String ime;
	private String prezime;
	private int godinaRodjenja;
	private String pol;
	private Osoba otac;
	private Osoba majka;

	public Osoba() {

	}

	public Osoba(String ime, String prezime, int godinaRodjenja, String pol) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodinaRodjenja() {
		return this.godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getPol() {
		return this.pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Osoba getOtac() {
		return otac;
	}

	public void setOtac(Osoba otac) {
		this.otac = otac;
	}

	public Osoba getMajka() {
		return majka;
	}

	public void setMajka(Osoba majka) {
		this.majka = majka;
	}

//	metodu za stampu koja stampa ovako:
//	Ime i prezime, godina rodjenja [pol]
//	(ako je cale setovan)
//	OTAC: 
//	Stampamo caleta preko njegove metode za stampu
//	(Ako je majka setovana)
//	MAJKA:
//	Stampamo majku preko njene metode za stampu

	public void print() {
		System.out.println(
				this.getIme() + " " + this.getPrezime() + ", " + this.getGodinaRodjenja() + " [" + this.getPol() + "]");
		System.out.println();
		if (this.otac != null && this.majka != null) {
			System.out.println("OTAC: ");
			this.getOtac().print();
			System.out.println("MAJKA: ");
			this.getMajka().print();
		}

	}

}
