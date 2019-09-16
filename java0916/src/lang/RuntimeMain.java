package lang;

import java.io.IOException;

public class RuntimeMain {

	public static void main(String[] args) {
		//Runtime 클래스는 생성자를 이용하지 않고 getRuntime()이라는 메소드를 이용해서 객체를 생성
		//이런 경우는 대부분 싱글톤 패턴의 클래스임
		//몇 개의 객체를 만들 던 실제로는 하나를 다시 사용하는 경우임
		//동일한 객체인지 확인하는 방법은 
		//hashCode()를 호출해서 확인하던가 System.identityHasdhCode(객체)를 이용해서 해시코드를 확인해보면 됨
		
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();

		//해시 코드 출력
		System.out.printf("r1:d%d\n", r1.hashCode());
		System.out.printf("r2:d%d\n", r2.hashCode());
		System.out.printf("r1:d%d\n", System.identityHashCode(r1));
		
		try {
			//디렉토리 만들기
			r1.exec("mkdir /Users/c5/Desktop/newFolder"); //데스크탑 쪽에 newFolder 생성
		} catch (IOException e) {
			// 예외 메시지를 출력하던가 로그를 기록
			System.out.printf("예외 메시지:%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
