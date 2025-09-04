package lambdaTask;

public class Task {
	public static void main(String[] args) {
		
		PrintNameTest printNameTest = new PrintNameTest();
		PrintName printName = (f, l) -> f + l;

		printNameTest.printFullName(printName, "정", "충효");

		printNameTest.printFullName((f, l) -> f + l, "김", "씨");

	}
}
