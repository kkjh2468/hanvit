package java0909;

// Superclass 에서 Super클래스를 선택해서 만든 것
//Super 크래스로부터 상속 받은 Sub  클래스
public class Sub extends Super {
	
	public int y = 150;
	/*
	public Sub() {
		super(); //Super로 부터 상속받있기 때문에
		//new Super()를 호출하는 구문임 
	}
	*/
	
	//상위 클래스에 매개변수가 없는 생성자가 없을 때는
	//하위 클래스에서 생성자를 만들고 상위 클래스의 생성자를 호출해주어야함
	public Sub() {
		//상위 클래스의 생성자 호출
		super("Super Class");
		System.out.printf("Sub Class\n");
		
	}
	
	public void print() {
		//메소드 안에 만든 변수를 지역 변수
		int y = 3000;
		//가까운 곳에서 생성한 것을 먼저 찾음
		System.out.printf("local y:%d\n", y );
		//자신의 클래스에서 만든 것을 먼저 찾기
		System.out.printf("this.y:%d\n", this.y );
		//상위 클래스에 만든 것을 먼저 찾기
		System.out.printf("super.y:%d\n", super.y );
		//실제로 이렇게 만들면 혼남(중복 가능성 때문에) ㅋㅋ
		
		
		
		//n = 10 //private 멤버는 사용할 수 없음
		//x = 300; // protected 멤버는 사용 가능
		//y = 200; // public 멤버는 사용 가능
		
		System.out.printf("하위 클래스의 메소드\n");
	}
	
	
}
