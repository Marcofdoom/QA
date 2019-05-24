package garage;

public abstract class Vechile {

	private static int counter;

	protected int vechileId;
	protected String make;
	protected int numberOfSeats;
	protected String engine;
	protected int price;

	public Vechile() {
		this.vechileId = ++counter;
	}

	public abstract int calculateValue();

	public int getVechileId() {
		return vechileId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}