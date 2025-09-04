package staticTest;

public class GangNam {
	public static void main(String[] args) {
		Company a = new Company(1,"한동석", 1000);
		Company b = new Company(2,"김태민", 1000);
		Company c = new Company(3,"구민경", 1000);
		
		Company.totalIncome += a.income + b.income + c.income;
		System.out.println(Company.totalIncome);
	}
}
