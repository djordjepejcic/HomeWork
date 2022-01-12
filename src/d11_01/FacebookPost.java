package d11_01;

public class FacebookPost {

	String imeIPrezimeKoPostavljaPost;
	String imeIPrezimeGdeJeObjavljenPost;
	String tekst;
	int brojLajkova;
	int brojSerova;

	public void like() {
		this.brojLajkova++;
	}

	public void dislike() {
		this.brojLajkova--;
		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojSerova++;
	}

	public void print() {
		System.out.println(this.imeIPrezimeKoPostavljaPost + " >>> " + this.imeIPrezimeGdeJeObjavljenPost);
		System.out.println(this.tekst);
		System.out.println("LIKES " + this.brojLajkova + " | SHARES " + this.brojSerova);
	}
}
