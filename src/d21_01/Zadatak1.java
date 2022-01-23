package d21_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak  
//		Kreirati klasu Sektor koja ima:
//		naziv sektora
//		platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		ime i prezime
//		niz sektora u kojima radi
//		abstraktnu metodu koja vraca platu radnika
//		metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		suma plata svih sektor / broj sektora * 0.5
//		override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

		Radnik radnik_1 = new Magacioner("Djordje Pejcic");
		Radnik radnik_2 = new Menadzer("Djordje Djordjevic");
		Sektor sektor_1 = new Sektor("Sektor 1", 35000);
		Sektor sektor_2 = new Sektor("Sektor 2", 50000);
		Sektor sektor_3 = new Sektor("Sektor 3", 80000);

		radnik_1.zaposliUSektor(sektor_1);
		radnik_1.zaposliUSektor(sektor_3);
		radnik_2.zaposliUSektor(sektor_1);
		radnik_2.zaposliUSektor(sektor_2);

		printRadnik(radnik_1);
		printRadnik(radnik_2);

	}

	public static void printRadnik(Radnik radnik) {
		System.out.println("Radnik " + radnik.getImeIPrezime() + " je zaposljen u sektorima: ");
		for (int i = 0; i < radnik.getListaSektora().size(); i++) {
			System.out.println(radnik.listaSektora.get(i).getNazivSektora());
		}
		System.out.println("Sa mesecnom platom od: " + radnik.kolikaJePlata() + "din.");
		System.out.println();
	}

}
