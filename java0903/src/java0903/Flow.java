package java0903;
public class Flow {
	public static void main(String[] args) {

		//Overflow: 자신이 저장할 수 있는 범위를 넘어선 테이터를 저장해서 잘못된 데이터 저장하는 상황 
		int n = (int)(2100000000 + 2100000000);
		System.out.println(n);
		
		n = (int)(-2100000000 - 2100000000);
		System.out.println(n);
		
		//실수 저장하는 원
		double d = 0.1;
		double sum = 0.0;
		for(int i=0; i<100; i=i+1) {
			sum = sum + d;
		}
		System.out.println(sum);
		
		//자바에서는 동일한 자료형의 데이터끼리 연산하면 그 결과도 연산을 수행한 데이터의 자료형으로 리턴
		System.out.println(5/3); //정수 나누기 정수: 1 
		//소수까지 나오도록 하고자 하면 2개중 하나를 실수로 만들어 주어야 함 (강제 형 변환)
		System.out.println((double)5/3); //실수 나누기 정수는 실수 : 1.66666...
		System.out.println(5.0/3);
		System.out.println("-------------------------------------------------");
		String ir = "김종훈";
		String gu ="일산";
		String nu = "010-5138-7525"; // 처음이 0이기 때문에 String으로 사용하고 번호 문자열로 만들어줌
		int na = 25;
		
		System.out.println("이름: " + ir);
		System.out.println("주소: " + gu);
		System.out.println("전화번호: " + nu);
		System.out.println("나이: " + na);
		
		System.out.printf("이름:%s 주소:%s 전화번호:%s 나이:%d\n", ir, gu, nu, na);
		
		System.out.printf("이름:%10s 주소:%s 전화번호:%s 나이:%d\n", ir, gu, nu, na);
		
		// 소수를 6째 자리까지 출
		System.out.printf("%f\n", 8.9876543212);
		 // 소수가 3째 자리까지만 출력이 된다, 그리고 4째 자리는 반올림
		System.out.printf("%.3f\n", 8.9876543212);
		
		
		
		
		
	}

}
