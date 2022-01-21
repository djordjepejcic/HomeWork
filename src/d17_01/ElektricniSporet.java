package d17_01;

public class ElektricniSporet {
//	Kreirati klasu ElektricniSporet koja ima:
//	●	marku storeta (npr: Beko, Bosh)
//	●	garanciju kao broj godina
//	●	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//	●	4 ringle 
//	○	gore levo
//	○	gore desno
//	○	dole levo
//	○	dole desno
//	●	konstruktor koji postavlja sve atribute
//	●	gettere za sve atribut
//	●	ne postoje setteri
//	●	metodu pojacaj kojoj se prosledjuje pozicija ringle
//	○	pozicija 1 je ringla gore levo
//	○	pozicija 2 je ringla gore desno
//	○	pozicija 3 je ringla dole levo
//	○	pozicija 4 je ringla dole desno
//	○	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije 
//	○	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//	●	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//	○	pozicija 1 je ringla gore levo
//	○	pozicija 2 je ringla gore desno
//	○	pozicija 3 je ringla dole levo
//	○	pozicija 4 je ringla dole desno
//	●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//	●	metodu koja stampa podatke u formatu:
//	marka - garancija u godinama
//	Ringle:
//	Gore levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Gore desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW

	private String markaSporeta;
	private int garancija;
	private int maksUkljuceneRingle;
	private Ringla gore_levo = new Ringla();
	private Ringla gore_desno = new Ringla();
	private Ringla dole_levo = new Ringla();
	private Ringla dole_desno = new Ringla();

	public ElektricniSporet(String markaSporeta, int garancija, int maksUkljuceneRingle, Ringla gore_levo,
			Ringla gore_desno, Ringla dole_levo, Ringla dole_desno) {
		this.markaSporeta = markaSporeta;
		this.garancija = garancija;
		this.maksUkljuceneRingle = maksUkljuceneRingle;
		this.gore_levo = gore_levo;
		this.gore_desno = gore_desno;
		this.dole_levo = dole_levo;
		this.dole_desno = dole_desno;
	}

	public String getMarkaSporeta() {
		return markaSporeta;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaksUkljuceneRingle() {
		return maksUkljuceneRingle;
	}

	public Ringla getGore_levo() {
		return gore_levo;
	}

	public Ringla getGore_desno() {
		return gore_desno;
	}

	public Ringla getDole_levo() {
		return dole_levo;
	}

	public Ringla getDole_desno() {
		return dole_desno;
	}

//	●	metodu pojacaj kojoj se prosledjuje pozicija ringle
//	○	pozicija 1 je ringla gore levo
//	○	pozicija 2 je ringla gore desno
//	○	pozicija 3 je ringla dole levo
//	○	pozicija 4 je ringla dole desno

	public void pojacaj(int pozicija) {
		int brojacUpaljenihRingli = 0;

		if (pozicija == 1) {
			this.getGore_levo().pojacajRinglu();
			brojacUpaljenihRingli++;
		} else if (pozicija == 2) {
			this.getGore_desno().pojacajRinglu();
			brojacUpaljenihRingli++;
		} else if (pozicija == 3) {
			this.getDole_levo().pojacajRinglu();
			brojacUpaljenihRingli++;
		} else {
			this.getDole_desno().pojacajRinglu();
			brojacUpaljenihRingli++;
		}

		if (pozicija == 1 && brojacUpaljenihRingli > maksUkljuceneRingle && !this.getGore_desno().daLiJeRinglaIskljucena()
				&& !this.getDole_levo().daLiJeRinglaIskljucena() && !this.getDole_desno().daLiJeRinglaIskljucena()) {
			this.getGore_levo().pojacajRinglu();
			this.getGore_desno().iskljuciRinglu();
			this.getDole_levo().iskljuciRinglu();
			this.getDole_desno().iskljuciRinglu();
		} else if (pozicija == 2 && brojacUpaljenihRingli > maksUkljuceneRingle && !this.getGore_levo().daLiJeRinglaIskljucena()
				&& !this.getDole_desno().daLiJeRinglaIskljucena() && !this.getDole_levo().daLiJeRinglaIskljucena()) {
			this.getGore_desno().pojacajRinglu();
			this.getGore_levo().iskljuciRinglu();
			this.getDole_levo().iskljuciRinglu();
			this.getDole_desno().iskljuciRinglu();
		} else if (pozicija == 3 && brojacUpaljenihRingli > maksUkljuceneRingle && !this.getGore_desno().daLiJeRinglaIskljucena()
				&& !this.getGore_levo().daLiJeRinglaIskljucena() && !this.getDole_desno().daLiJeRinglaIskljucena()) {
			this.getDole_levo().pojacajRinglu();
			this.getGore_desno().iskljuciRinglu();
			this.getGore_levo().iskljuciRinglu();
			this.getDole_desno().iskljuciRinglu();
		} else if (pozicija == 4 && brojacUpaljenihRingli > maksUkljuceneRingle && !this.getGore_desno().daLiJeRinglaIskljucena()
				&& !this.getGore_levo().daLiJeRinglaIskljucena() && !this.getDole_levo().daLiJeRinglaIskljucena()) {
			this.getDole_desno().pojacajRinglu();
			this.getGore_desno().iskljuciRinglu();
			this.getGore_levo().iskljuciRinglu();
			this.getDole_levo().iskljuciRinglu();
		}
	}

//	○	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, 
//	pogasite sve ringle sem one koja se pojacava u tom pozivu funkije 
//	○	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//	●	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//	○	pozicija 1 je ringla gore levo
//	○	pozicija 2 je ringla gore desno
//	○	pozicija 3 je ringla dole levo
//	○	pozicija 4 je ringla dole desno

	public void iskljuci(int pozicija) {
		if (pozicija == 1) {
			this.getGore_levo().iskljuciRinglu();
			;
		} else if (pozicija == 2) {
			this.getGore_desno().iskljuciRinglu();
		} else if (pozicija == 3) {
			this.getDole_levo().iskljuciRinglu();
		} else if (pozicija == 4) {
			this.getDole_desno().iskljuciRinglu();
		}
	}

//	●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, 
//		tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//	●	metodu koja stampa podatke u formatu:
//	marka - garancija u godinama
//	Ringle:
//	Gore levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Gore desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW

//	●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, 
//	tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)

	public double ukupnaPotrosnja(double vremePotrosnje) {
		double ukupnaPotrosnja = 0;
		if (!this.getGore_levo().daLiJeRinglaIskljucena()) {
			ukupnaPotrosnja = ukupnaPotrosnja + this.getGore_levo().potrosnjaElEnergije(vremePotrosnje);
		} else if (!this.getGore_desno().daLiJeRinglaIskljucena()) {
			ukupnaPotrosnja = ukupnaPotrosnja + this.getGore_desno().potrosnjaElEnergije(vremePotrosnje);
		} else if (!this.getDole_levo().daLiJeRinglaIskljucena()) {
			ukupnaPotrosnja = ukupnaPotrosnja + this.getDole_levo().potrosnjaElEnergije(vremePotrosnje);
		} else {
			ukupnaPotrosnja = ukupnaPotrosnja + this.getDole_desno().potrosnjaElEnergije(vremePotrosnje);
		}
		return ukupnaPotrosnja;
	}

//	●	metodu koja stampa podatke u formatu:
//	marka - garancija u godinama
//	Ringle:
//	Gore levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Gore desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW

	public void print() {
		System.out.println("Ringle: ");
		System.out.println("Gore levo: ");
		this.getGore_levo().stampaj();
		System.out.println("Gore desno: ");
		this.getGore_desno().stampaj();
		System.out.println("Dole levo: ");
		this.getDole_levo().stampaj();
		System.out.println("Dole desno: ");
		this.getDole_desno().stampaj();
	}
}
