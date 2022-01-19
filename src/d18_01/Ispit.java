package d18_01;

public class Ispit {
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	private String nazivPredmeta;
	private double ocena;
	private String imePrezimeProfesora;

	public Ispit() {

	}

	public Ispit(String nazivPredmeta, String imePrezimeProfesora, int ocena) {
		this.nazivPredmeta = nazivPredmeta;
		this.imePrezimeProfesora = imePrezimeProfesora;
		this.ocena = ocena;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImePrezimeProfesora() {
		return imePrezimeProfesora;
	}

	public void setImePrezimeProfesora(String imePrezimeProfesora) {
		this.imePrezimeProfesora = imePrezimeProfesora;
	}

	public boolean daLiJePolozenIspit() {
		return this.getOcena() > 5 ? true : false;
	}

	public void stampaj() {
		System.out.println(this.getNazivPredmeta() + " - " + this.getImePrezimeProfesora() + " - " + this.getOcena());
	}
}
