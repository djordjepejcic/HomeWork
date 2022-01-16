package vezbanje16_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//		Ime i prezime
//		godinu rodjenja
//		pol
//		oca- koji je takodje Osoba
//		majku - takodje je Osoba
//		Gettere i settere
//		difoltni konstruktor
//		konstruktor koji postavlja ime i prezime i godinu rodjenja i pol
//		metodu za stampu koja stampa ovako:
//		Ime i prezime, godina rodjenja [pol]
//		(ako je cale setovan)
//		OTAC: 
//		Stampamo caleta preko njegove metode za stampu
//		(Ako je majka setovana)
//		MAJKA:
//		Stampamo majku preko njene metode za stampu
//		U glavom programu kreirajte svoje porodicno stablo bar do babe i dede :grin:
//		Da vas odmah usmerim, IMAMO SAAAAAMO JEDNU KLASU OSOBA  i imamo main program 
//		nista vise od klasa vam ne treba!

		Osoba dj = new Osoba("Djordje", "Pejcic", 1990, "m");
		Osoba otac_dj = new Osoba("Slobodan", "Pejcic", 1949, "m");
		Osoba majka_dj = new Osoba("Snezana", "Pejcic", 1952, "z");
		Osoba deda_dj_sl = new Osoba("Randjel", "Pejcic", 1919, "m");
		Osoba baba_dj_sl = new Osoba("Vida", "Pejcic", 1926, "z");
		Osoba deda_dj_sn = new Osoba("Petronije", "Radic", 1928, "m");
		Osoba baba_dj_sn = new Osoba("Nadezda", "Radic", 1930, "z");

		dj.setOtac(otac_dj);
		otac_dj.setOtac(deda_dj_sl);
		otac_dj.setMajka(baba_dj_sl);

		dj.setMajka(majka_dj);
		majka_dj.setOtac(deda_dj_sn);
		majka_dj.setMajka(baba_dj_sn);

		dj.print();
	}

}
