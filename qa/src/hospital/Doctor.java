package hospital;

public class Doctor {

	private static int counter;
	private int id;

	private String firstName;
	private String[] middleNames;
	private String lastName;
	private int age;
	private Grade grade;
	private Rank rank;

	public Doctor(String firstName, String[] middleNames, String lastName, int age, Grade grade, Rank rank) {
		this.id = ++counter;
		this.firstName = firstName;
		this.middleNames = middleNames;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		this.rank = rank;
	}
}