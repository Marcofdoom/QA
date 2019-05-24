package hospital;

public class Patient {

	private static int counter;
	private int id;

	private String firstName;
	private String[] middleNames;
	private String surName;
	private int age;
	private Gender gender;

	public Patient(String firstName, String[] middleNames, String surName, int age, Gender gender) {
		this.id = ++counter;
		this.firstName = firstName;
		this.middleNames = middleNames;
		this.surName = surName;
		this.age = age;
		this.gender = gender;
	}
}