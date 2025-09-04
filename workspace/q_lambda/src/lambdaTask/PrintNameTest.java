package lambdaTask;

public class PrintNameTest {
	void printFullName(PrintName printName, String firstName, String lastName) {
		
		String fullName = printName.getFullName(firstName, lastName);

		System.out.println(fullName);
	}
}
