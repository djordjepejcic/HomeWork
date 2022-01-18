package d17_01;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.	Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		●	ime i prezime studenta 
//		●	broj indeksa 
//		●	naziv predmeta
//		●	ime i prezime profesora
//		●	ocenu - od 5 do 10
//		●	gettere i settere
//		●	konstruktore
//		●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		●	metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		●	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		●	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		○	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		String[] spisakPredmeta = { "Uvod u ekonomiju", "Osnove turizma", "Geografija turističkih naselja",
				"Engleski jezik II", "Ekonomika i organizacija preduzeca", "Ekonomika turizma",
				"Turisticko uredjenje prostora", "Banjski turizam", "Hotelijerstvo",
				"Kulturno istorijske osnove Srbije" };

		ArrayList<ZeleniKarton> ZeleniKarton = new ArrayList<ZeleniKarton>();

		ZeleniKarton ispit_1 = new ZeleniKarton("Djordje", "Pejcic", 420, "Uvod u ekonomiju", "Jelena", "Petrovic", 5);
		ZeleniKarton ispit_2 = new ZeleniKarton("Djordje", "Pejcic", 420, "Osnove turizma", "Selim", "Sacirovic", 8);
		ZeleniKarton ispit_3 = new ZeleniKarton("Djordje", "Pejcic", 420, "Geografija turističkih naselja", "Ninoslav",
				"Golubovic", 9);
		ZeleniKarton ispit_4 = new ZeleniKarton("Djordje", "Pejcic", 420, "Engleski jezik II", "Sonja", "Miletic", 10);
		ZeleniKarton ispit_5 = new ZeleniKarton("Djordje", "Pejcic", 420, "Ekonomika i organizacija preduzeca",
				"Jelena", "Petrovic", 8);
		ZeleniKarton ispit_6 = new ZeleniKarton("Djordje", "Pejcic", 420, "Ekonomika turizma", "Jelena", "Petrovic", 8);
		ZeleniKarton ispit_7 = new ZeleniKarton("Djordje", "Pejcic", 420, "Turisticko uredjenje prostora", "Marija",
				"Bratic", 9);
		ZeleniKarton ispit_8 = new ZeleniKarton("Djordje", "Pejcic", 420, "Banjski turizam", "Aleksandar",
				"Radivojevic", 7);
		ZeleniKarton ispit_9 = new ZeleniKarton("Djordje", "Pejcic", 420, "Hotelijerstvo", "Marija", "Bratic", 8);
		ZeleniKarton ispit_10 = new ZeleniKarton("Djordje", "Pejcic", 420, "Kulturno istorijske osnove Srbije",
				"Danica", "Dobrosavljevic", 10);

		ZeleniKarton.add(ispit_1);
		ZeleniKarton.add(ispit_2);
		ZeleniKarton.add(ispit_3);
		ZeleniKarton.add(ispit_4);
		ZeleniKarton.add(ispit_5);
		ZeleniKarton.add(ispit_6);
		ZeleniKarton.add(ispit_7);
		ZeleniKarton.add(ispit_8);
		ZeleniKarton.add(ispit_9);
		ZeleniKarton.add(ispit_10);

		for (int i = 0; i < ZeleniKarton.size(); i++) {
			ZeleniKarton.get(i).stampaj();
		}

		double prosecnaOcena = 0;
		for (int i = 0; i < ZeleniKarton.size(); i++) {
			prosecnaOcena = prosecnaOcena + ZeleniKarton.get(i).getOcena();
		}
		prosecnaOcena = prosecnaOcena / ZeleniKarton.size();
		System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);

		System.out.println();

		int counterDaLiJeIspitPolozen = 0;
		for (int i = 0; i < ZeleniKarton.size(); i++) {
			if (ZeleniKarton.get(i).daLiJeIspitPolozen()) {
				prosecnaOcena = prosecnaOcena + ZeleniKarton.get(i).getOcena();
				counterDaLiJeIspitPolozen++;
			}
		}
		prosecnaOcena = prosecnaOcena / counterDaLiJeIspitPolozen;
		double roundProsecnaOcena = Math.round(prosecnaOcena * 100.0) / 100.0;
		System.out.println("Prosecna ocena polozenih ispita je: " + roundProsecnaOcena);

		int zbirPolozenihIspita = 0;
		for (int i = 0; i < ZeleniKarton.size(); i++) {
			if (ZeleniKarton.get(i).getNazivPredmeta().equalsIgnoreCase(spisakPredmeta[i])
					&& ZeleniKarton.get(i).daLiJeIspitPolozen()) {
				zbirPolozenihIspita++;
			}
		}
		System.out.println();
		if (zbirPolozenihIspita > (ZeleniKarton.size() / 2)) {
			System.out.println("Student ima pravo na upis u narednu godinu studija.");
		} else {
			System.out.println("Student nema prava na upis u narednu godinu studija.");
		}
	}

}
