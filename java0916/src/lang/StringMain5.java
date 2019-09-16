package lang;

public class StringMain5 {

	public static void main(String[] args) {
		//좌표를 저장할 변수
		int x = 200;
		int y = 300;
		//x=200,y=300의 형태로 출력
		//String msg = "x=" + x + ",y=" + y;
		
		//System.out.printf 대신에 String.format을 사용 
		//문자열이 출력되지 않고 문자열을 만들어서 리턴을 해줌
		String msg = String.format("x=%d,y=%d", x, y);
		System.out.printf("%s\n", msg);
		
		msg = "연대기";
		byte [] bytes = msg.getBytes();
		//각 바이트 코드 값을 출력
		for(byte imsi : bytes) {
			System.out.println(imsi);
		}
		
		//byte 배열을 가지고 문자열로 복원
		//받는 쪽이나 파일의 내용을 읽을 때 수행
		String result = new String(bytes);
		System.out.println(result);
	}
}
