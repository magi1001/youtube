package justDoIt;

import java.util.Scanner;

public class Tutorial15_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Tutorial15_Student student1 = new Tutorial15_Student("홍길동", 20, 189, 86, "13701", 3, 3.0);
		Tutorial15_Student student2 = new Tutorial15_Student("이순신", 24, 180, 82, "13741", 2, 4.0);
		student1.show();
		student2.show();
		Tutorial15_Student students[] = new Tutorial15_Student[1000];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Tutorial15_Student("홍길동", 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}

		Tutorial15_Teacher teacher1 = new Tutorial15_Teacher("노민현", 30, 190, 85, "asd123", 3000000, 5);
		teacher1.show();

		System.out.println("총 몇 명의 학생이 존재합니까?");
		int number = sc.nextInt();
		Tutorial15_Student[] students2 = new Tutorial15_Student[number];
		for (int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.println("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.println("학생의 나이를 입력하세요 : ");
			age = sc.nextInt();
			System.out.println("학생의 키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.println("학생의 몸무게를 입력하세요 : ");
			weight = sc.nextInt();
			System.out.println("학생의 학번을 입력하세요 : ");
			studentID = sc.next();
			System.out.println("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.println("학생의 성적을 입력하세요 : ");
			gPA = sc.nextDouble();
			students2[i] = new Tutorial15_Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0; i<number; i++) {
			students2[i].show();
		}
	}
}
