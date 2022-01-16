package d14_01;

public class Book {
//	Kreirati klasu Knjiga koji ima:
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 

	private String isbn;
	private String nameOfTheBook;
	private int yearOfRelease;
	private Author author;

	public Book(String nameOfTheBook, int yearOfRelease, String isbn) {
		this.isbn = isbn;
		this.nameOfTheBook = nameOfTheBook;
		this.yearOfRelease = yearOfRelease;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNameOfTheBook() {
		return this.nameOfTheBook;
	}

	public void setNameOfTheBook(String nameOfTheBook) {
		this.nameOfTheBook = nameOfTheBook;
	}

	public int getYearOfRelease() {
		return this.yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void print() {
		System.out.println("ISBN: " + this.getIsbn());
		System.out.println(
				"Name: " + this.getNameOfTheBook() + " - " + "Year of release: " + this.getYearOfRelease() + ".");
		this.getAuthor().print();
		System.out.println();
	}
}
