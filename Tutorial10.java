package justDoIt;

public class Tutorial10 {
	public static int factorial(int number) {
		int sum = 1;
		for (int i = 2; i <= number; i++) {
			sum *= i;
		}
		return sum;

	}

	public static int factorial2(int number2) {
		if (number2 == 1) 
			return 1;
		else 
			return number2*factorial(number2-1);
	}

	public static void main(String[] args) {

		System.out.println("10 팩토리얼은 " + factorial(10));
	}
}
