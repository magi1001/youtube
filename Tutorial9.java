package justDoIt;

public class Tutorial9 {
	// 반환형 함수(메소드명) 매개변수(사전적으로 주어지는 값)
	public static int function(int a, int b, int c) {
		int min = 0;
		if(a<b) {
			if(a<c) {
				min = a;
			} else {
				min = c;
			}
		} else if (a>b) {
			if(c>b) {
				min = b;
			} else {
				min = c;
			}
		} for (int i = min; i>0; i--) {
			if(a%i == 0 && b%i == 0 && c%i ==0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("(400, 300, 750)의 최대공약수" + function(400, 300, 750));
	}

}
