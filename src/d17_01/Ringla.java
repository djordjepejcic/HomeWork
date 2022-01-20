package d17_01;

public class Ringla {
//	Kreirati klasu Ringla koja ima:
//	●	tip ringle (obicna ili ekspres)
//	●	jacinu 
//	○	za obicnu ringu jacina je u opsegu od 0 do 3
//	○	za ekspres ringlu jacina je u opsegu od 0 do 12
//	●	jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//	●	konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//	●	getter za jacinu
//	●	setteri ne postoje!!
//	●	privatnu metodu koja vraca maksimalan broj pojacavanja
//	○	za obicnu je 3, za ekspres je 12
//	●	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//	●	metodu iskljuci ringlu - metoda postavlja jacinu na 0
//	●	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//	●	metodu koja vraca potrosnju elektricne energije prema formuli 
//	○	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi 
//	○	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//	●	metodu koja stampa podatke u formatu:
//		Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW

	private String tipRingle;
	private int jacinaRingle;
	private double jacinaGrejaca;

	public Ringla() {
		this.jacinaRingle = 0;
	}

	public Ringla(String tipRingle, double jacinaGrejaca) {
		this.tipRingle = tipRingle;
		this.jacinaRingle = 0;
		this.jacinaGrejaca = jacinaGrejaca;
	}

	public int getJacinaRingle() {
		return jacinaRingle;
	}

//	●	privatnu metodu koja vraca maksimalan broj pojacavanja
//	○	za obicnu je 3, za ekspres je 12

	private int maksimalnoPojacanje() {
		if (this.tipRingle.equalsIgnoreCase("obicna")) {
			return 3;
		} else {
			return 12;
		}
	}
//	●	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)

	public void pojacajRinglu() {
		if (this.getJacinaRingle() <= maksimalnoPojacanje()) {
			this.jacinaRingle = this.getJacinaRingle() + 1;
		}
	}

//	●	metodu iskljuci ringlu - metoda postavlja jacinu na 0

	public void iskljuciRinglu() {
		this.jacinaRingle = 0;
	}

//	●	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena

	public boolean daLiJeRinglaIskljucena() {
		return this.getJacinaRingle() == 0;
	}

//	●	metodu koja vraca potrosnju elektricne energije prema formuli 
//	○	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi 
//	○	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi

	public double potrosnjaElEnergije(double vremePotrosnje) {
		return 100 / maksimalnoPojacanje() * this.getJacinaRingle() * this.jacinaGrejaca * vremePotrosnje;
	}

//	●	metodu koja stampa podatke u formatu:
//		Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW

	public void stampaj() {
		if (!daLiJeRinglaIskljucena()) {
			System.out.println("Ringla je ukljucena.");
		} else {
			System.out.println("Ringla je iskljucena.");
		}
		System.out.println("Tip ringle: " + this.tipRingle);
		System.out.println("Jacina ringle: " + this.getJacinaRingle());
		System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
	}
}
