package classTest;

public class Admin {
	int id;
	String name;
	int age;
	Exercise[] arExercise;
	int totalCalorie;

	Admin(int id, String name, int age, Exercise[] arExercise) {
		this.id = id;
		this.name = name;
		this.age = age;

		for (int i = 0; i < arExercise.length; i++) {
			totalCalorie += arExercise[i].calorie;
		}
	}
}
