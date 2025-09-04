package classTest;

public class Teacher {
	int[] arAnswer = { 1, 2, 5, 4, 2, 3, 1, 2, 4, 1 };

	int check(Child child) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(this.arAnswer[i] + " " + child.arQuestion[i]);
			if (this.arAnswer[i] == child.arQuestion[i]) {
				cnt++;
//				System.out.println(i);
			}

		}
		return cnt*10;
	}
}
