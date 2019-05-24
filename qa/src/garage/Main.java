package garage;

import garage.factory.VechileFactory;

public class Main {

	public static void main(String arg[]) {
		Garage garage = new Garage();

		VechileFactory vechileFactory = new VechileFactory();

		garage.addVechile(vechileFactory.getVechile(VechileType.CAR)
				.setEngine("combustion")
				.setMake("ford")
				.setNumberOfSeats(4)
				.setPrice(2000).build());
		
		garage.addVechile(vechileFactory.getVechile(VechileType.MOTORCYCLE)
				.setEngine("combustion")
				.setMake("ford")
				.setNumberOfSeats(4)
				.setPrice(2000).build());
		
		garage.addVechile(vechileFactory.getVechile(VechileType.PLANE)
				.setEngine("combustion")
				.setMake("ford")
				.setNumberOfSeats(4)
				.setPrice(2000).build());

		garage.returnGarageDetails();
		
		garage.returnVechileStuff();
	}
}