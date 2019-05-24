package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vechile> vechiles = new ArrayList<Vechile>();

	public int calculateTotalValue() {
		return vechiles.stream().mapToInt(x -> x.calculateValue()).sum();
	}

	public void addVechile(Vechile vechile) {
		vechiles.add(vechile);
	}

	public void removeVechile(int vechileId) {
		vechiles.removeIf(a -> vechileId == a.getVechileId());
	}

	public void removeVechile(String vechileMake) {
		vechiles.removeIf(a -> vechileMake.equals(a.getMake()));
	}

	public int totalVechiles() {
		return vechiles.size();
	}

	public int repairVechile(int vechileId) {
		return vechiles.stream().filter(x -> x.getVechileId() == vechileId).findFirst().get().getPrice();
	}

	public void returnGarageDetails() {
		for (Vechile i : vechiles) {
			System.out.println(i.vechileId);
			System.out.println(i.make);
			System.out.println(i.price);
			System.out.println("-----");
		}
	}

	public void returnVechileStuff() {
		for (Vechile i : vechiles) {

			if (i instanceof Car) {
				((Car) i).doCarThings();
			}

			if (i instanceof Motorcycle) {
				((Motorcycle) i).doMotorcycleThings();
			}

			if (i instanceof Plane) {
				((Plane) i).doPlaneThings();
			}
		}
	}
}