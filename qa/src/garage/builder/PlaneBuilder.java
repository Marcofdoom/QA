package garage.builder;

import garage.Plane;
import garage.Vechile;

public class PlaneBuilder extends VechileBuilder {

	@Override
	public Vechile build() {
		Plane plane = new Plane();
		plane.setMake(make);
		plane.setNumberOfSeats(numberOfSeats);
		plane.setEngine(engine);
		plane.setPrice(price);
		return plane;
	}
}