package d14_01;

public class Product {
//	    Kreirati klasu Proizvod koja ima:
//	-	sifru proizvoda
//	-	naziv proizvoda
//	-	cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//	-	konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//	-	gettere i settere za sifru i naziv
//	-	setter za cenu po kilogramu
//	-	metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//	-	metodu getCenaLb koja vraca cenu za 1lb prozvoda
//	 		konverzija: 1 kg = 2.2046 lb
//	-	metodu koja stampa proizvod u formatu:
//	(sifra) - (naziv)

	private int code;
	private String label;
	private double priceKg;

	public Product(int code, String label, double priceKg) {
		this.code = code;
		this.label = label;
		this.priceKg = priceKg;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setPriceKg(double priceKg) {
		this.priceKg = priceKg;
	}

	public double getPriceKg() {
		return this.priceKg;
	}

	public double getPriceLb() {
		double priceLb = this.priceKg * 0.453592;
		double roundPriceLb = Math.round(priceLb * 100.0) / 100.0;
		return roundPriceLb;
	}

	public void print() {
		System.out.println("Product code: " + this.getCode() + "  |||  Label: " + this.getLabel().toUpperCase());
	}
}
