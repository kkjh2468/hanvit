package java0903;

public class ModUse {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 7;
		//byte + byte이지만 자바는 int 보다 크기가 작은 데이터를 가지고 연산을 수행하면 int 로 변경해서 연산을 수행 
		//연산의 결과를 byte에 저장하려고하 결과를 형 변환해서 저장해야 
		byte x = (byte)(a+b);

	System.out.println(10.0/0.0);
		
		int n = 0;
		while(true){
			try {
				if(n % 3 ==0)
					System.out.println("빨강");
				if(n % 3 ==1)
					System.out.println("파랑");
				if(n % 3 ==2)
					System.out.println("노랑");
				n++;
				Thread.sleep(1000);
			}catch(Exception e) {}
		}

	}

}
