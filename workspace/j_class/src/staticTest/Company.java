package staticTest;

public class Company {
	int id; // 사원 아이디
	static int seq;

	String name; // 사원 이름
	int income; // 사원 수입
	static int totalIncome; // 회사수입

//	static 블룩
//	최초 1번만 실행  
	static {
		seq = 0;
	}
//	초기화 블록
//	생성자가 호출될 때마다 실행
	{
		id = ++seq;
	}

	public Company(int id, String name, int income) {
		this.id = id;
		this.name = name;
		this.income = income;
	}
}
