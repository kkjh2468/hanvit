package java0903;

public class OpTest {

	public static void main(String[] args) {
		//다음 2개의 변수 중에서 작음 값을 min에 저장하고 출력하기
		int n1 = 20;
		int n2 = 30;

		int min = n1 < n2 ? n1 : n2;
		System.out.printf("작은 값:%d\n", min);
	
		System.out.println("---------------------------------------");
		
		int t = 7700;
		//time에 전체 시간이 초단위로 저장되어있음
		//time은 몇 시간 몇 분 몇 초인지 계산
		//2시간 8분 20초
		
		int m = t / 60 ;
		int s = m / 60 ;
		
		System.out.println(t);
		System.out.println(m);
		System.out.println(s);
		System.out.println("---------------------------------------");
		
		int hour = t / 3600;
		
		int minute = (t - hour * 3600)/60;
		
		int second = (t % 60); //(분을 제외한 나머지 초)
		
		System.out.printf("%d시간 %d분 %d초\n" ,hour, minute, second);
		
		System.out.println("---------------------------------------");
		
		int money = 760000;
		//오만원 ,만원 몇장을 주는 것이 최소로 줄 것인가? 
		
		int om = money / 50000;
		
		int im = (money - om * 50000)/10000; 
		
		System.out.print(money+"원에서 "); System.out.printf ("오만원 개수:%d 만원개수:%d" , om, im); System.out.print("로 줘야함\n");
		
	}

}
