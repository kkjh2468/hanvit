package java0910;

public class Main {

	public static void main(String[] args) {
		//현쟈는 Star 클래스가 abstract 클래스가 아님
		//abstract class 가 아니어서 객체 생성이 가능
		//Star 클래스의 class 앞에 abstract를 추가하면 에러
		//Star star = new Star();
		
		
		Star s = new Protoss();
		s.attack();
		
		s = new Terran();
		s.attack();
		
		s = new Zerg();
		s.attack();

	}

}
