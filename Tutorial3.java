package justDoIt;

public class Tutorial3 {
	public static void main(String[] args) {
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;

		System.out.println((a + b + c) / 3); // 실수의 계산 - 실수인 10.0 출력

		for (char i = 'a'; i <= 'z'; i++) { // char를 이용해 a~z까지 출력하는 for문
			System.out.print(i + " ");
		}

		int d = 200;
		System.out.println("\n10진수 : " + d);
		System.out.format("8진수 : %o\n", d); // %o는 형식지정자로 %o의 위치에 10진수 변수 d를 8진수로 출력하라는 수행문
		System.out.format("16 진수 : %x\n", d); // %x는 16진수로 출력하라는 형식지정자

		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0, 1)); // 문자열 0째부터 1번째 문자까지라는 의미. 즉 j하나 출력
		System.out.println(name.substring(3, 6)); // 문자열 3째부터 6번째 문자까지 n ~ D까지 출력
		System.out.println(name.substring(5, 8)); 
		System.out.println(name.substring(0, 4)); 
	}

}
