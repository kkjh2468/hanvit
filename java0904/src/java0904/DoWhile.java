package java0904;

public class DoWhile {

	public static void main(String[] args) {
		// 601 을 3번 출력 - do~while 이용 
		int i = 0;
		do {
			System.out.printf("601\n");
			i = i + 1;
		}while(i < 3);
		
System.out.println("=================================");
		
		//1~10 까지의 합계 
		//1 + 2 + 3 + 4 + ... +10
		
		int x = 1;
		//합계를 저장할 변수
		int sum = 0;
		do { 
			//합을 구할 내용을 기존의 합계에 추가 
			sum = sum + 1;
			
			x = x + 1;			
		}while(x <= 10);
		System.out.printf("합계:%d\n", sum);
		
System.out.println("=================================");
		
		//image1.png, image2.png, image3.png 을 반복문을 이용해서 출력 
		
		int idx = 1;
		
		while(idx < 4) {
			System.out.printf("image%d.png\n" , idx);
			idx = idx + 1;
		}
		
System.out.println("=================================");
		
		
		
		
		
			
			
			
			
			
		
		
		
		
		
		
		
	}

}
