package copyTest;

public class User1 {
	private String firstName; 
	private String lastName;
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User1(User1 user) {
		this(user.getFirstName(),user.getLastName());
	}
	public User1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
