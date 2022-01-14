package d13_01;

public class FacebookPost {

	String nameSurname;
	String nameSurnameOfPost;
	String text;
	int numberLikes;
	int numberShares;

	public FacebookPost(String nameSurname, String nameSurnameOfPost, String text) {
		this.nameSurname = nameSurname;
		this.nameSurnameOfPost = nameSurnameOfPost;
		this.text = text;
	}

	public void print() {
		System.out.println(getNameSurname() + " >>> " + getNameSurnameOfPost());
		System.out.println(getText());
		System.out.println("LIKES: " + getNumberLikes() + " | SHARES: " + getNumberShares());
		System.out.println();
	}

	public String getNameSurname() {
		return this.nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getNameSurnameOfPost() {
		return this.nameSurnameOfPost;
	}

	public void setNameSurnameOfPost(String nameSurnameOfPost) {
		this.nameSurnameOfPost = nameSurnameOfPost;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumberLikes() {
		return this.numberLikes;
	}

	public int getNumberShares() {
		return this.numberShares;
	}

	public void likes() {
		this.numberLikes++;
	}

	public void dislike() {
		this.numberLikes--;
	}

	public void shares() {
		this.numberShares++;
	}
}
