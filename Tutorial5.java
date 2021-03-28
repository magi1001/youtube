package justDoIt;

public class Tutorial5 {

	public static void main(String[] args) {

		String a = "I Love You.";
		if (a.contains("Love")) {
			System.out.println("Me Too");	// 포함하는 경우 실행되는 부분
		} else { 							// 포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You.");
		}
	}
}
