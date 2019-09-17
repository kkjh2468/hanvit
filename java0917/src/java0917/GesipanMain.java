package java0917;

import java.util.LinkedList;
import java.util.List;

public class GesipanMain {
	public static void main(String[] args) {

		//Board 클래스의 객체 여러개를 저장할 수 있는 자료구조를 생성
		//배열(크기 변경 안됨),ArratList(읽기는 빠름), LinkedList(삽입삭제가 빠름)
		
		List<Gesipan> list = new LinkedList<>();
		//Gesipan 클래스의 객체를 만들어서 테이터를 설정한 후 list에 삽입하기
		//이 부분은 데이터베이스에 읽어오던가 파일에서 읽어오는 형태로 변경
		Gesipan ge = new Gesipan();
		ge.setB(1);
		ge.setJ("이벤트가 이상함");
		ge.setHo("김종훈");
		ge.setN("2019-09-17");

	}

}
