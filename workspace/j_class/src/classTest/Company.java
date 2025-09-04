package classTest;

public class Company {
	int id;
	Department[] department;
	int total;
	double avg;

	public Company(int id, Department[] department) {
		this.id = id;
		this.department = department;
		for (int i = 0; i < department.length; i++) {
			this.total += department[i].sales;
		}
		this.avg = (double) total / 3;
	}
}
