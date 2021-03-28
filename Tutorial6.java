package justDoIt;

public class Tutorial6 {

	final static int N = 30;

	public static void main(String[] args) {
		int score = 95;

		String a = "Man";
		int b = 0;

		// 자바는 String을 비교할때 equal()을 이용합니다.
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		if (a.equals("Man")) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}

		if (b == 3) {
			System.out.println("b는 3입니다.");
		} else {
			System.out.println("b는 3이 아닙니다.");
		}
		if (a.equalsIgnoreCase("man") && (b == 0)) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

		int i = 1, sum = 0;
		while (i <= 1000) {
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
		// for문 : 초기화 부분, 조건부분, 연산부분
		for (int j = N; j > 0; j--) {
			for (int p = j; p > 0; p--) { //p의 값만큼 1번 반복시에 ★을 출력하기 때문에 30, 29, ... 이런식으로 출력됨
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
