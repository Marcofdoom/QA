package geoff;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	private List<Car> cars = new ArrayList<Car>();

	public static void main(String args[]) {
		new Runner();

	}

	public Runner() {
		cars.add(new Car(1000));
		cars.add(new Car(200));
		cars.add(new Car(400));

		System.out.println(calculateTotalPrice());

	}

	public int calculateTotalPrice() {

		int total = 0;

		for (Car i : cars) {
			total += i.calculate();
		}

		return total;
	}

}
