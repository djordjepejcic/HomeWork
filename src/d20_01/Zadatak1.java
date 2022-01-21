package d20_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//	1.Zadatak
//	Kreirati klasu Osoba koja ima:
//	-	ime i prezime
//	-	jmbg
//	-	godinu rodjenja
//	-	default-ni konstuktor
//	-	konstuktor sa parametrima
//	-	gettere i settere 
//	-	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
//
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	-	broj (broj koji igrac nosi)
//	-	poziciju koju igra (odbrambeni, napadac, … )
//	-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	-	default-ni konstuktor
//	-	konstuktor sa parametrima
//	-	gettere i settere za broj, kapiten i poziciju
//	-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	-	godine iskustva
//	-	tip trenera (kondicioni, za igru, pomocni, personalni)
//	-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//	U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//	(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

		Scanner s = new Scanner(System.in);

		Igrac igrac1 = new Igrac("Djordje", "Pejcic", "0510990730030", 1990, 5, "napadac", true);
		Igrac igrac2 = new Igrac("Sasa", "Markota", "2611990730012", 1999, 8, "levi bek", false);

		igrac1.stampaj();
		igrac2.stampaj();

		Trener trener1 = new Trener("Dusan", "Petrovic", "0505990730015", 1990, 10, "personalni");
		Trener trener2 = new Trener("Stefan", "Polic", "1606989730045", 1989, 5, "kondicioni");

		trener1.stampaj();
		trener2.stampaj();

		System.out.println("Unesite broj igraca sa Vase liste: ");
		int n = s.nextInt();

		ArrayList<Igrac> listaIgraca = new ArrayList<Igrac>();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime igraca: ");
			String ime = s.next();
			System.out.print("Unesite prezime igraca: ");
			String prezime = s.next();
			System.out.print("Unesite JMBG igraca: ");
			String jmbg = s.next();
			System.out.print("Unesite godinu rodjenja igraca: ");
			int godRodjenja = s.nextInt();
			System.out.print("Unesite broj dresa igraca: ");
			int brojDresa = s.nextInt();
			System.out.print("Unesite poziciju igraca: ");
			String pozicijaIgraca = s.next();
			System.out.print("Da li je igrac kapiten tima? ");
			boolean kapiten = s.nextBoolean();

			Igrac igrac_1 = new Igrac(ime, prezime, jmbg, godRodjenja, brojDresa, pozicijaIgraca, kapiten);
			listaIgraca.add(igrac_1);
		}

		for (int i = 0; i < listaIgraca.size(); i++) {
			listaIgraca.get(i).stampaj();
		}

		System.out.println("Unesite broj trenera sa Vase liste: ");
		n = s.nextInt();

		ArrayList<Trener> listaTrenera = new ArrayList<Trener>();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime trenera: ");
			String ime = s.next();
			System.out.print("Unesite prezime trenera: ");
			String prezime = s.next();
			System.out.print("Unesite JMBG trenera: ");
			String jmbg = s.next();
			System.out.print("Unesite godinu rodjenja trenera: ");
			int godRodjenja = s.nextInt();
			System.out.print("Unesite godine iskustva trenera: ");
			int godineIskustva = s.nextInt();
			System.out.print("Unesite tip trenera(kondicioni, personalni...): ");
			String tipTrenera = s.next();

			Trener trener_1 = new Trener(ime, prezime, jmbg, godRodjenja, godineIskustva, tipTrenera);
			listaTrenera.add(trener_1);
		}

		for (int i = 0; i < listaTrenera.size(); i++) {
			listaTrenera.get(i).stampaj();
		}
	}

}
