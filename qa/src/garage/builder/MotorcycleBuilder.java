package garage.builder;

import garage.Motorcycle;
import garage.Vechile;

public class MotorcycleBuilder extends VechileBuilder {

	@Override
	public Vechile build() {
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.setMake(make);
		motorcycle.setNumberOfSeats(numberOfSeats);
		motorcycle.setEngine(engine);
		motorcycle.setPrice(price);
		return motorcycle;
	}
}