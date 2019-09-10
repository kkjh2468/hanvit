package java0903;

public class Ralation {

	public static void main(String[] args) {
		// >, >=, <, <=, ! 은 결과가 boolean
		System.out.println("10>3:" + (10>3));
		//싱수 연산의 결과 비교는 주의 
		System.out.println("(1-0.8)==0.2:" + ((1-0.8)==0.2));
		
		int x = 10;
		//x가 4의 배수인지 5의 배수인지 확인
		boolean result = x % 4 ==0 || x % 5 ==0;
		System.out.println("result: " + result);
		
		//year에는 년도가 저장
		int year = 2020;
		//4의 배수이고 100의 배수가 아닌 경우 또는 400의 배수인 경우는 윤년
		result = year % 4 ==0 && year % 100 != 0 || year % 400 ==0 ;
		System.out.println("result: " + result);
		
		//1부터 100까지 3의 배수이고 4의 배수인 데이터의 개수를 파악
		//&& 나 || 는 좌우식의 위치를 변경하도 결과는 동일 
		//두번째 것이 계산을 덜 함으로 두번째 것이 더 좋
		
		int cnt = 0;
		for(int i = 1; i<=100; i++) {
			if(i % 3 ==0 && i % 4 ==0) {
				cnt = cnt + 1;
			}
		}
		
		
		
		cnt = 0;
		for(int i = 1; i<=100; i++) {
			if(i % 3 ==0 && i % 4 ==0) {
				cnt = cnt + 1;
			}
		}
		
		//앞의 경과가 false이어서 뒤의 데이터를 확인하지 않음
		//k의 값은 그대로 10
		int k = 10;
		result = k > 5 &&(k++ > 6);
		System.out.printf("k:%d\n", k);
		
		int j = 10;
		result = j < 5 &&(j++ > 6);
		System.out.printf("j:%d\n", j);
		
		
		
		
	}

}
