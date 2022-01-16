package d14_01;

public class Scale {
//	Kreirati klasu Vaga koja ima:
//-	merna jedinica (kg ili lb)
//-	proizvod (proizvod koji se meri)
//-	default-ni konstuktor
//-	getteri i setteri za sve atribute
//-	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//-	metodu stampaj koja stampa racun u formatu:
//               (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//   Ukupno: (ukupna cena) 	    

	private String unitOfMeasurement;
	private Product product;

	public Scale() {

	}

	public String getUnitOfMeasurement() {
		return this.unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double countPrice(double weight) {
		if (this.getUnitOfMeasurement().equalsIgnoreCase("kg")) {
			return this.product.getPriceKg() * weight;
		} else {
			return this.product.getPriceLb() * weight;
		}
	}

	public void print(double weight) {
		this.product.print();
		if (this.getUnitOfMeasurement().equalsIgnoreCase("kg")) {
			System.out.println("(" + this.product.getPriceKg() + " dollars per " + this.getUnitOfMeasurement() + ") x ("
					+ weight + " " + this.getUnitOfMeasurement() + ")");
			System.out.println("Total price: " + this.countPrice(weight) + " dollars");
		} else {
			System.out.println("(" + this.product.getPriceLb() + " dollars per " + this.getUnitOfMeasurement() + ") x ("
					+ weight + " " + this.getUnitOfMeasurement() + ")");
			System.out.println("Total price: " + this.countPrice(weight) + " dollars");
		}
		System.out.println();
	}
}
