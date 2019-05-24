package garage.factory;

import garage.VechileType;
import garage.builder.CarBuilder;
import garage.builder.MotorcycleBuilder;
import garage.builder.PlaneBuilder;
import garage.builder.VechileBuilder;

public class VechileFactory {

	public VechileBuilder getVechile(VechileType vechileType) {
		switch (vechileType) {
		case CAR:
			return new CarBuilder();
		case MOTORCYCLE:
			return new MotorcycleBuilder();
		case PLANE:
			return new PlaneBuilder();
		default:
			return null;
		}
	}
}