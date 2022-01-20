package d18_01;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private int brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;;
	private ArrayList<Ispit> listaIspita = new ArrayList<Ispit>();

	public Student() {

	}

	public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getListaIspita() {
		return listaIspita;
	}

	public void dodajIspit(Ispit ispit) {
		this.listaIspita.add(ispit);
	}

	private double prosekOcena() {
		double prosekOcena = 0;
		double zbirOcena = 0;
		int brojacPolozenihIspita = 0;
		for (int i = 0; i < listaIspita.size(); i++) {
			if (this.listaIspita.get(i).daLiJePolozenIspit()) {
				zbirOcena = zbirOcena + this.listaIspita.get(i).getOcena();
				brojacPolozenihIspita++;
			}
		}
		prosekOcena = zbirOcena / brojacPolozenihIspita;
		double roundProsecnaOcena = Math.round(prosekOcena * 100.0) / 100.0;
		return roundProsecnaOcena;
	}

	public void stampajListuIspita() {
		System.out.println(this.getBrojIndeksa() + " - " + this.getImeIPrezime() + " - " + this.getTipStudija());
		System.out.println();
		System.out.println("Predmeti: ");
		for (int i = 0; i < listaIspita.size(); i++) {
			this.listaIspita.get(i).stampaj();
		}
		System.out.println();
		System.out.println("Prosecna ocena: " + prosekOcena());
	}

}
