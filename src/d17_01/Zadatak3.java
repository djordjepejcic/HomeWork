package d17_01;

public class Zadatak3 {

	public static void main(String[] args) {
//		3.Zadatak (Za vezbanje)
//		Kreirati klasu Ringla koja ima:
//		●	tip ringle (obicna ili ekspres)
//		●	jacinu 
//		○	za obicnu ringu jacina je u opsegu od 0 do 3
//		○	za ekspres ringlu jacina je u opsegu od 0 do 12
//		●	jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//		●	konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//		●	getter za jacinu
//		●	setteri ne postoje!!
//		●	privatnu metodu koja vraca maksimalan broj pojacavanja
//		○	za obicnu je 3, za ekspres je 12
//		●	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//		●	metodu iskljuci ringlu - metoda postavlja jacinu na 0
//		●	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//		●	metodu koja vraca potrosnju elektricne energije prema formuli 
//		○	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi 
//		○	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//		●	metodu koja stampa podatke u formatu:
//			Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//		Tip ringle: tip ringle
//		Jacina: jacina
//		Grejac: jacina grejaca kW
//
//
//		Kreirati klasu ElektricniSporet koja ima:
//		●	marku storeta (npr: Beko, Bosh)
//		●	garanciju kao broj godina
//		●	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//		●	4 ringle 
//		○	gore levo
//		○	gore desno
//		○	dole levo
//		○	dole desno
//		●	konstruktor koji postavlja sve atribute
//		●	gettere za sve atribut
//		●	ne postoje setteri
//		●	metodu pojacaj kojoj se prosledjuje pozicija ringle
//		○	pozicija 1 je ringla gore levo
//		○	pozicija 2 je ringla gore desno
//		○	pozicija 3 je ringla dole levo
//		○	pozicija 4 je ringla dole desno
//		○	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije 
//		○	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//		●	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//		○	pozicija 1 je ringla gore levo
//		○	pozicija 2 je ringla gore desno
//		○	pozicija 3 je ringla dole levo
//		○	pozicija 4 je ringla dole desno
//		●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//		●	metodu koja stampa podatke u formatu:
//		marka - garancija u godinama
//		Ringle:
//		Gore levo:
//		Ringla je ukljucena/iskljucena
//		Tip ringle: tip ringle
//		Jacina: jacina
//		Grejac: jacina grejaca kW
//		Gore desno:
//		Ringla je ukljucena/iskljucena
//		Tip ringle: tip ringle
//		Jacina: jacina
//		Grejac: jacina grejaca kW
//		Dole levo:
//		Ringla je ukljucena/iskljucena
//		Tip ringle: tip ringle
//		Jacina: jacina
//		Grejac: jacina grejaca kW
//		Dole desno:
//		Ringla je ukljucena/iskljucena
//		Tip ringle: tip ringle
//		Jacina: jacina
//		Grejac: jacina grejaca kW

		Ringla ringla_1 = new Ringla("obicna", 0.8);
		Ringla ringla_2 = new Ringla("obicna", 0.8);
		Ringla ringla_3 = new Ringla("ekspres", 1);
		Ringla ringla_4 = new Ringla("ekspres", 1.5);

		ElektricniSporet sporet_1 = new ElektricniSporet("Beko", 5, 3, ringla_1, ringla_2, ringla_3, ringla_4);
		sporet_1.pojacaj(1);
		sporet_1.pojacaj(1);
		sporet_1.pojacaj(2);
		sporet_1.pojacaj(2);
		sporet_1.pojacaj(3);
		sporet_1.pojacaj(3);
		sporet_1.pojacaj(3);
		sporet_1.pojacaj(4);

		sporet_1.print();
		System.out.println("Ukupna potrosnja: " + sporet_1.ukupnaPotrosnja(2) + "kW");
	}

}
