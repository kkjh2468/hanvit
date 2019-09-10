package java0909;

//Base 클래스를 상속받은 Derived 클래스
public class Derived extends Base {
	
	//이 메소드는 내용은 다르지만 동일한 모양으로 Base에 존재
	//이런 경우를 method overriding 이라고 함
	//메소드의 재정의 라고 함
	@Override
	public void display() {
		System.out.printf("하위 클래스의 메소드\n");
	}
	
	//일반 메소드
	public void print() {
		System.out.printf("일반 메소드\n");
	}
	
	
	
}
