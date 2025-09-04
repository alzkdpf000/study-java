package classTest;

import javax.crypto.spec.DESedeKeySpec;

public class ClassTask06 {
//	부서별 매출 관리

//	부서는 여러개 이다.
//	회사 클래스
//	회사 고유 번호
//	부서 이름
//	부서 매출 

//	회사는 부서별 총 매출과 평균 매출을 구할 수 있다.
	public static void main(String[] args) {
		Department[] department = { new Department("1", 110), new Department("2", 12310), new Department("3", 11230) };
		Company company = new Company(1, department);
		System.out.println(company.total);
		System.out.println(company.avg);
	}
}
