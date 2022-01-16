package d14_01;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.	(Za vezbanje) Kreirati klasu Proizvod koja ima:
//		-	sifru proizvoda
//		-	naziv proizvoda
//		-	cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//		-	konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//		-	gettere i settere za sifru i naziv
//		-	setter za cenu po kilogramu
//		-	metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//		-	metodu getCenaLb koja vraca cenu za 1lb prozvoda
//		 		konverzija: 1 kg = 2.2046 lb
//		-	metodu koja stampa proizvod u formatu:
//		(sifra) - (naziv)
//
//			Kreirati klasu Vaga koja ima:
//		-	merna jedinica (kg ili lb)
//		-	proizvod (proizvod koji se meri)
//		-	default-ni konstuktor
//		-	getteri i setteri za sve atribute
//		-	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		-	metodu stampaj koja stampa racun u formatu:
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cena) 	      

		Product product_1 = new Product(1, "banana", 1.3);
		Scale scale_1 = new Scale();

		scale_1.setProduct(product_1);
		scale_1.setUnitOfMeasurement("kg");
		scale_1.print(10);

		Product product_2 = new Product(2, "orange", 1.12);
		Scale scale_2 = new Scale();

		scale_2.setProduct(product_2);
		scale_2.setUnitOfMeasurement("lb");
		scale_2.print(12);
	}

}
