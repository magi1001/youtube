package justDoIt;

import java.util.Scanner;

public class Tutorial4 {
	
	static int max(int e, int f) { // 함수 max 앞에 static을 붙여야한다.
		int result = (e > f) ? e : f; // 삼항연산
		return result;
	}
	final static int SECOND = 1000;	// 상수 SECOND 의 값을 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		int minute = SECOND / 60;
		int second = SECOND % 60;
		System.out.println(minute + "분" + second + "초");

		int a = 10;
		System.out.println("현재의 a는" + a + " 입니다");
		a++;
		System.out.println("현재의 a는" + a + " 입니다");
		System.out.println("현재의 a는" + ++a + " 입니다");
		System.out.println("현재의 a는" + a++ + " 입니다");
		System.out.println(a);

		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);

		int c = 50;
		int b = 50;
		System.out.println("c와 b가 같은가요?" + (c == b));
		System.out.println("c가 b보다 큰가요?" + (c > b));
		System.out.println("c가 b보다 작은가요?" + (c < b));
		System.out.println("c가 b같으면서 c가 30보다 큰가요?" + ((c == b) && (c > 30)));
		System.out.println("c가 50이 아닌가요?" + !(c == 50)); // 논리 부정연산자!를 사용 true를 false로
		
		int x = 50;
		int y = 60;
		System.out.println("최댓값은 ? " + max(x, y) + " 입니다."); // 삼항연산
		
		double g = Math.pow(3.0, 20.0); // pow 함수 3^20이 g라는 변수에 담기는 것. 거듭제곱 연산
		System.out.println("3의 20제곱은 " + (int) g + "입니다.");
	
	}

}
