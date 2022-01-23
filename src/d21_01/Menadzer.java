package d21_01;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer() {
		super();
	}

	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
	}

	@Override
	public double kolikaJePlata() {
		double plata = 0;
		for (int i = 0; i < listaSektora.size(); i++) {
			plata = plata + listaSektora.get(i).getPlata();
		}
		return plata;
	}

}
