package garage;

public class Car extends Vechile {

	@Override
	public int calculateValue() {
		return price * 2;
	}
	
	public void doCarThings() {
		System.out.println("Car stuff");
	}
}