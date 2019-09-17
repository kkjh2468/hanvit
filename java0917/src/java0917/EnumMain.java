package java0917;

enum Sports{
	Basebll, Soccer, Volleyball, Basketball
}

public class EnumMain {

	public static void main(String[] args) {
		//열거형 상수 변수에는 열거형 상수 중의 하나만 대입이 가능함
		Sports v = Sports.Basebll;
		System.out.println(v); //열거형 상수 이름이 나옴
		System.out.println(v.ordinal()); // 인덱스를 출력
		//final static 을 이용해서 옵션을 만드는 것 보다는
		//enum을 사용하는 것을 고급 프로그래밍 기법으로 취급
		
		Sports b = Sports.Volleyball;
		System.out.println(b); //열거형 상수 이름이 나옴
		System.out.println(b.ordinal());
		
		Sports s = Sports.Basketball;
		System.out.println(v); //열거형 상수 이름이 나옴
		System.out.println(v.ordinal());
		
		Sports r = Sports.Soccer;;
		System.out.println(v); //열거형 상수 이름이 나옴
		System.out.println(v.ordinal());
		
	}

}
