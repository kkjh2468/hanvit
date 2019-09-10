package java0904;

public class WhileTest {

	public static void main(String[] args) {
		//Hello Java 라는 문장을 3번 출력 
		//동일한 문장을 연속해서 작성하는 경우 유지보수가 어려워짐 
		//5번을 출력하는 것으로 변경 - 2번 더 작성 
		//Hello 601 으로 변경 - 3번 변경 
		System.out.printf("Hello Java\n");System.out.printf("Hello Java\n");System.out.printf("Hello Java\n");
		
		System.out.println("=================================");
		
		//반복문을 사용하면 수정을 할 때 이전보다 적은 수정을 하는 경우가 많음 
		
		//반복 횟수를 파악하기 위한 변수 
		int i = 0;
		//i 가 3보다 작으면 반복 수행 
		while(i < 3) {
			System.out.printf("Hello Java\n");
			i = i + 1; //i++, i += 1 로 작성해도 됨 
			
		}
		
		System.out.println("=================================");
		// 0,1,2 를 출력  
		int o = 0;
		while(o < 3) {
			System.out.printf("o:%d\n", o);
			o = o + 1;
		}
		
		System.out.println("=================================");
		// 0,2,4 를 출력  
		int p = 0;
		while(p < 5) {
			System.out.printf("p:%d\n", p);
			p = p + 2;
		}
		System.out.println("=================================");
		int q = 0;
		while(q < 3) {
			System.out.printf("q:%d\n", q*2);
			q = q + 1;
		}
		//이것이 고치는 횟수도 적고 반복 횟수가 어떻게 되는지 더 정확함으로 실제로 이것을 더 많이 씀 
		
	}

}
