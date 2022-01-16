package d14_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.	Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//		U glavnom programu napraviti vise autora sa vise knjiga.

		Author author_1 = new Author("John Ronald Reuel", "Tolkien");
		Book book_1 = new Book("The Fellowship of the Ring", 1954, "9780007136599");

		book_1.setAuthor(author_1);
		book_1.print();

		Author author_2 = new Author("Joanne", "Rowling");
		Book book_2 = new Book("Harry Potter and the Philosopher's Stone", 1997, "9780747532743");

		book_2.setAuthor(author_2);
		book_2.print();

		Author author_3 = new Author("Božidar", "Damjanoviæ Benedikt");
		Book book_3 = new Book("Prièa o karmi", 1989, "86-367-0318-2");

		book_3.setAuthor(author_3);
		book_3.print();
	}

}
