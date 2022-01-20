package d18_01;

import java.util.ArrayList;

public class Kombinacija {
//	Kreirati klasu Kombinacija koja ima:
//	id kombinacije (String)
//	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//	metodu koja proverava da li this kombinacija ima iste brojeve kao 
//	prosledjena kombinacija. 
//	Zaglavlje metode je:
//	public boolean daLiJeIstaKombinacija( Kombinacija k)
//	metoda vraca true ako su svi elementi na istim pozicija isti
//	npr: this [0] == k [0], this [1] == k [1] …. 
//	metodu za stampu koja stampa podatke u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23

	private String idKombinacije;
	private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
	private int jedan;
	private int dva;
	private int tri;
	private int cetiri;
	private int pet;
	private int sest;
	private int sedam;

	public Kombinacija(String idKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
		this.idKombinacije = idKombinacije;
		this.jedan = jedan;
		this.dva = dva;
		this.tri = tri;
		this.cetiri = cetiri;
		this.pet = pet;
		this.sest = sest;
		this.sedam = sedam;
		this.nizBrojeva.add(jedan);
		this.nizBrojeva.add(dva);
		this.nizBrojeva.add(tri);
		this.nizBrojeva.add(cetiri);
		this.nizBrojeva.add(pet);
		this.nizBrojeva.add(sest);
		this.nizBrojeva.add(sedam);
	}

	public String getIdKombinacije() {
		return idKombinacije;
	}

	public int getJedan() {
		return jedan;
	}

	public int getDva() {
		return dva;
	}

	public int getTri() {
		return tri;
	}

	public int getCetiri() {
		return cetiri;
	}

	public int getPet() {
		return pet;
	}

	public int getSest() {
		return sest;
	}

	public int getSedam() {
		return sedam;
	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		return this.nizBrojeva.get(0) == k.getJedan() && this.nizBrojeva.get(1) == k.getDva()
				&& this.nizBrojeva.get(2) == k.getTri() && this.nizBrojeva.get(3) == k.getCetiri()
				&& this.nizBrojeva.get(4) == k.getPet() && this.nizBrojeva.get(5) == k.getSest()
				&& this.nizBrojeva.get(6) == k.getSedam();
	}

	public void stampaj() {
		System.out.println("ID kombinacije: " + this.getIdKombinacije());
		System.out.print("Brojevi: ");
		for (int i = 0; i < nizBrojeva.size(); i++) {
			System.out.print(nizBrojeva.get(i) + ", ");
		}
	}
}
