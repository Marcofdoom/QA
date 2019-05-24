package library.item;

public class Book extends Item {

	private String author;

	public Book(String itemName, String author) {
		super(itemName);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
}