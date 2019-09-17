package java0917;

public class Gerneric<T> {
	//미지정 자료형의 배열을 생성
	private T [] data;
	
	//데이터를 대입 받아서 인스턴스 속성에 대입하는 생성자
	//매개 변수에 ... 이 있으면 varargs 라고 하는데 매개 변수를 개수에 상관 없이 대입할 수 있음
	//메소드 내에서는 배열로 간주함
	public Gerneric(T...n) {
		data = n;
	}
	
	//data의 내용을 출력하는 메소드
	public void display() {
		//빠른 열거를 이용한 배열의 데이터 접근
		for(T temp : data) {
			System.out.println(temp);
		}
	}
	
}
