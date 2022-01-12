package d11_01;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost post12_01 = new FacebookPost();

		post12_01.imeIPrezimeKoPostavljaPost = "Djordje Pejcic";
		post12_01.imeIPrezimeGdeJeObjavljenPost = "Aleksandar Tosic";
		post12_01.tekst = "Srecan rodjendan, Toso!!! :-)";
		post12_01.brojLajkova = 2;
		post12_01.brojSerova = 3;

		post12_01.like();
		post12_01.like();

		post12_01.dislike();

		post12_01.share();

		post12_01.print();

		post12_01.imeIPrezimeKoPostavljaPost = "Milica Todorovic";
		post12_01.imeIPrezimeGdeJeObjavljenPost = "Kosta Lukic";
		post12_01.tekst = "Super su ti slike. :-)";
		post12_01.brojLajkova = 42;
		post12_01.brojSerova = 2;

		post12_01.like();
		post12_01.like();

		post12_01.dislike();

		post12_01.share();

		post12_01.print();
	}

}
