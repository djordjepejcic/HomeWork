package d18_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1. Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Ispit ispit_1 = new Ispit("Uvod u ekonomiju", "Jelena Petrovic", 5);
		Ispit ispit_2 = new Ispit("Osnove turizma", "Selim Sacirovic", 8);
		Ispit ispit_3 = new Ispit("Geografija turistièkih naselja", "Ninoslav Golubovic", 9);
		Ispit ispit_4 = new Ispit("Engleski jezik II", "Sonja Miletic", 10);
		Ispit ispit_5 = new Ispit("Ekonomika i organizacija preduzeca", "Jelena Petrovic", 8);
		Ispit ispit_6 = new Ispit("Ekonomika turizma", "Jelena Petrovic", 8);
		Ispit ispit_7 = new Ispit("Turisticko uredjenje prostora", "Marija Bratic", 9);
		Ispit ispit_8 = new Ispit("Banjski turizam", "Aleksandar Radivojevic", 7);
		Ispit ispit_9 = new Ispit("Hotelijerstvo", "Marija Bratic", 8);
		Ispit ispit_10 = new Ispit("Kulturno istorijske osnove Srbije", "Danica Dobrosavljevic", 10);

		Student student_1 = new Student(420, "Djordje Pejcic", "master");

		student_1.dodajIspit(ispit_1);
		student_1.dodajIspit(ispit_2);
		student_1.dodajIspit(ispit_3);
		student_1.dodajIspit(ispit_4);
		student_1.dodajIspit(ispit_5);
		student_1.dodajIspit(ispit_6);
		student_1.dodajIspit(ispit_7);
		student_1.dodajIspit(ispit_8);
		student_1.dodajIspit(ispit_9);
		student_1.dodajIspit(ispit_10);

		student_1.stampajListuIspita();

	}

}
