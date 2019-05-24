package garage;

public class Plane extends Vechile {

	@Override
	public int calculateValue() {
		return price * 4;
	}
	
	public void doPlaneThings() {
		System.out.println("Plane stuff");
	}
}