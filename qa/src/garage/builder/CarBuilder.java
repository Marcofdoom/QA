package garage.builder;

import garage.Car;
import garage.Vechile;

public class CarBuilder extends VechileBuilder {

	@Override
	public Vechile build() {
		Car car = new Car();
		car.setMake(make);
		car.setNumberOfSeats(numberOfSeats);
		car.setEngine(engine);
		car.setPrice(price);
		return car;
	}
}