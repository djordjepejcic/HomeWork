package d18_01;

public class Zadatak2 {

	public static void main(String[] args) {
//		2. Zadatak (Za vezbanje)
//		Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se 
//		brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//
//		Za potrebe Lotto igre na srecu potrebno je 
//		Kreirati klasu Kombinacija koja ima:
//		●	id kombinacije (String)
//		●	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//		●	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//		●	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//		●	metodu koja proverava da li this kombinacija ima iste brojeve kao 
//		prosledjena kombinacija. 
//		○	Zaglavlje metode je:
//		■	public boolean daLiJeIstaKombinacija( Kombinacija k)
//		○	metoda vraca true ako su svi elementi na istim pozicija isti
//		■	npr: this [0] == k [0], this [1] == k [1] …. 
//		●	metodu za stampu koja stampa podatke u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//			Kreirati klasu Listic koja ima: 
//		●	niz kombinacija - maksimalno 7 kombinacija
//		●	metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//		●	metodu koja vraca da li je kombinacija dobitna. Kao parametar 
//		se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente 
//		niza i proverava da li u nizu postoji prosledjena kombinacija. 
//		Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//		○	Zaglavlje metode 
//		■	public boolean dobitna(Kombinacija dobitnaKombinacija)
//		●	metodu koja stampa listic u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		…… i tako za sve kombinacije

		Kombinacija kombinacija1 = new Kombinacija("1", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija kombinacija2 = new Kombinacija("2", 8, 9, 10, 11, 12, 13, 14);
		Kombinacija kombinacija3 = new Kombinacija("3", 15, 16, 17, 18, 19, 20, 21);
		Kombinacija kombinacija4 = new Kombinacija("4", 22, 23, 24, 25, 26, 27, 28);
		Kombinacija kombinacija5 = new Kombinacija("5", 29, 30, 31, 32, 33, 34, 35);
		Kombinacija kombinacija6 = new Kombinacija("6", 36, 37, 38, 39, 1, 2, 3);
		Kombinacija kombinacija7 = new Kombinacija("7", 4, 5, 6, 7, 8, 9, 10);
		Kombinacija dobitnaKombinacija = new Kombinacija("8", 4, 5, 6, 7, 8, 9, 10);

		Listic listic1 = new Listic();

		listic1.dodajKombinaciju(kombinacija1);
		listic1.dodajKombinaciju(kombinacija2);
		listic1.dodajKombinaciju(kombinacija3);
		listic1.dodajKombinaciju(kombinacija4);
		listic1.dodajKombinaciju(kombinacija5);
		listic1.dodajKombinaciju(kombinacija6);
		listic1.dodajKombinaciju(kombinacija7);

		listic1.stampajListu();

		if (listic1.dobitna(dobitnaKombinacija)) {
			System.out.println("Cestitamo. Imate pogodak!!!");
		} else {
			System.out.println("Na zalost, nema pogotka na vasem listicu. :(");
		}

	}

}
