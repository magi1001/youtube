package justDoIt;

import java.util.Scanner;

public class Tutorial12 {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = sc.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			System.out.println("배열에 입력할 정수를 하나씩 입력해주세요(양수) : ");
			array[i] = sc.nextInt();
		}
		int result = -1;
		for(int i = 0; i<number; i++) {
			result = max(result, array[i]);
		}
		System.out.println("입력한 모든 정수 중 가장 큰 값은 " + result + "입니다.");
		
		int [] array2 = new int[100];
		for (int i = 0; i<array2.length; i++) {
			array2[i] = (int)(Math.random()*100+1);
		}
		int sum = 0;
		for (int i =0; i<array2.length;i++) {
			sum+=array2[i];
		}
		System.out.println("100개의 랜덤 정수의 평균값은 " + sum/array2.length + "입니다.");
	}
}
