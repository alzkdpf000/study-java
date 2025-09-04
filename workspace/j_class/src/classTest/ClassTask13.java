package classTest;

//	선생님이 아이의 문제를 채점한다.
//	1 문제당 10점이고, 아이의 점수를 리턴한다.

//	선생님(Teacher)
//	정답

//	아이(Child)
//	답안 

public class ClassTask13 {
	public static void main(String[] args) {
		int[] arChildAnswer = { 1, 2, 3, 4, 2, 1, 3, 1, 2, 4 };
		Child child = new Child(arChildAnswer);
		Teacher teacher = new Teacher();

		int result = teacher.check(child);

		System.out.println(result);
	}
}
