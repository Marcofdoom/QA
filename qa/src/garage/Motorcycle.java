package garage;

public class Motorcycle extends Vechile {

	@Override
	public int calculateValue() {
		return price * 1;
	}

	public void doMotorcycleThings() {
		System.out.println("Motorcycle stuff");
	}
}