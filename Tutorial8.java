package justDoIt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tutorial8 {

	public static void main(String[] args) {

		int count = 0;
		for (;;) { // 무한 반복
			System.out.println("출력");
			count++;
			if (count == 10) {
				break; // count가 10이 되면 for문 탈출
			}
		}
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close();

		File file = new File("input.txt"); // file객체 생성
		try {
			Scanner scanner = new Scanner(file); // file에서 값을 받아옴
			while (scanner.hasNextInt()) { // input.txt에 정수가 있다면
				System.out.println(scanner.nextInt() * 100);// input에 정수가 있으면 그 값에 100을 곱하고 출력하라
			}
			scanner.close();
		} catch (FileNotFoundException e) { // filenotfoundException 에러가 발생하면 아래의 문구를 출력하라.
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}

	}

}
