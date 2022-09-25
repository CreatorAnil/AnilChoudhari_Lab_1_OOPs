
public class Customer {
	private String firstName;
	private String lastName;
	private String requirement;
	private int noOfPeople;
	
	public Customer(String firstName, String lastName, String requirement, int noOfPeople) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.requirement = requirement;
		this.noOfPeople = noOfPeople;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getRequirement() {
		return requirement;
	}
	public int getNoOfPeople() {
		return noOfPeople;
	}
		
}
