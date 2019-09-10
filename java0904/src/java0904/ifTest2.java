package java0904;

import java.util.Scanner;

public class ifTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.printf("아이디 입력: ");
		String id = sc.nextLine();
		System.out.printf("비밀번호 입력: ");
		String pw = sc.nextLine();
		//아이디가 root, pw-1234 이면 로그인 성공이라고 출력 그렇지 않으면 로그인 실패라고 출력 
		if (id.equals("root") && pw.equals("1234")) {
			System.out.printf("로그인 성공\n");
		}
		else {
			System.out.printf("로그인 실패\n");
		}
		
		
		
		
		
	}

}
