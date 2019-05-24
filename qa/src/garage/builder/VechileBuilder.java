package garage.builder;

import garage.Vechile;

public abstract class VechileBuilder {

	protected String make;
	protected int numberOfSeats;
	protected String engine;
	protected int price;

	public VechileBuilder setMake(final String make) {
		this.make = make;
		return this;
	}

	public VechileBuilder setNumberOfSeats(final int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
		return this;
	}

	public VechileBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}

	public VechileBuilder setPrice(int price) {
		this.price = price;
		return this;
	}

	public abstract Vechile build();
}