package d11_01;

public class SmartAirConditioning {

	String marka;
	int potrosnjaHladjenje = 1;
	int potrosnjaGrejanje = 2;
	int temperatura;
	String mod;
	
	public void stampa () {
		System.out.println(this.marka + " - " + this.temperatura + " - " + this.mod);
	}
	
	public double mesecnaPotrosnja () {
		if (this.mod.equalsIgnoreCase("greje")) {
			return 30 * 15 * potrosnjaGrejanje;
		} else {
			return 30 * 15 * potrosnjaHladjenje;
		}
	}
	
	public double racunZaStruju () {
		return (350 * 6) + ((mesecnaPotrosnja() - 350) * 9);
	}
}
