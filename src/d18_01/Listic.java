package d18_01;

import java.util.ArrayList;

public class Listic {
//	Kreirati klasu Listic koja ima: 
//●	niz kombinacija - maksimalno 7 kombinacija
//●	metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//●	metodu koja vraca da li je kombinacija dobitna. Kao parametar 
//se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente 
//niza i proverava da li u nizu postoji prosledjena kombinacija. 
//Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//○	Zaglavlje metode 
//■	public boolean dobitna(Kombinacija dobitnaKombinacija)
//●	metodu koja stampa listic u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//…… i tako za sve kombinacije

	ArrayList<Kombinacija> listaKombinacija = new ArrayList<Kombinacija>();

	public void dodajKombinaciju(Kombinacija kombinacija) {
		listaKombinacija.add(kombinacija);
	}

	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		return listaKombinacija.get(0).daLiJeIstaKombinacija(dobitnaKombinacija)
				|| listaKombinacija.get(1).daLiJeIstaKombinacija(dobitnaKombinacija)
				|| listaKombinacija.get(2).daLiJeIstaKombinacija(dobitnaKombinacija)
				|| listaKombinacija.get(3).daLiJeIstaKombinacija(dobitnaKombinacija)
				|| listaKombinacija.get(4).daLiJeIstaKombinacija(dobitnaKombinacija)
				|| listaKombinacija.get(5).daLiJeIstaKombinacija(dobitnaKombinacija)
				|| listaKombinacija.get(6).daLiJeIstaKombinacija(dobitnaKombinacija);
	}

	public void stampajListu() {
		for (int i = 0; i < listaKombinacija.size(); i++) {
			listaKombinacija.get(i).stampaj();
			System.out.println();
			System.out.println();
		}
	}
}
