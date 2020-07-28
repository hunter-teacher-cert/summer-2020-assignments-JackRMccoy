

public class Person {
	private String lastName;
	private String firstName;
	private String phoneNumber;

	// Constructor - must set all values to create Person object
	public Person(String last, String first, String number) {
		lastName = last;
		firstName = first;
		phoneNumber = number;
	}

	// Getter methods to access fields
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String toString() {
		return lastName + ", " + firstName + " " + phoneNumber;
	}

} // end class
