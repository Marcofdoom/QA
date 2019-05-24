package library.item;

public class Newspaper extends Item {

	private boolean containAdverts;

	public Newspaper(String itemName, boolean containAdverts) {
		super(itemName);
		this.containAdverts = containAdverts;
	}

	public boolean isContainAdverts() {
		return containAdverts;
	}
}