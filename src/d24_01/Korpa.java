package d24_01;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
	private ArrayList<Ambalaza> listaAmbalaza = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		listaAmbalaza.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			if (listaAmbalaza.get(i).getBarKod().equals(barkod)) {
				listaAmbalaza.remove(i);
			}
		}
	}
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//

	private double cenaSaPopustom(int popust) {
		double cenaSaPopustom = 0;
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			cenaSaPopustom = cenaSaPopustom + listaAmbalaza.get(i).cenaArtikla();
		}
		return cenaSaPopustom - (cenaSaPopustom * (popust / 100));
	}

	public double cenaSaPopustomSuperKartica(SuperKartica superKartica) {
		return cenaSaPopustom(superKartica.getPopust());
	}

	public void printAll() {
		System.out.println("KORPA: ");
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			listaAmbalaza.get(i).print();
		}

	}

}
