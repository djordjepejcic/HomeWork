package d14_01;

public class Author {
//	1.	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)

	private String name;
	private String surname;

	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void print() {
		System.out.println("Author: " + this.getName() + " " + this.getSurname());
	}
}
