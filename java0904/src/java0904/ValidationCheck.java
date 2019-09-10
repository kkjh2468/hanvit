package java0904;

import java.util.Scanner;

public class ValidationCheck {

	public static void main(String[] args) {
		//1,2,3 이외의 문자열을 입력하면 다시 입력하도록 하고
		//1,2,3 을 입력하면 정상입력이라고 출력하고 종료
		
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.printf("메뉴를 입력하세요:");
			String menu = sc.nextLine();
			if(!menu.equals("1") && !menu.equals("2") && !menu.equals("3")) {
				System.out.printf("메뉴 1 또는 2 또는 3으로 입력하세요.\n"); 
			}else {
				System.out.printf("주문하신 %s 메뉴가 주문되었습니다.\n", menu);//주문하신 @ 메뉴가 주문되었습니다. 나오게 하는 법 여쭤보기
				break;
			}
		}
		
		//Scanner 는 닫히만 다시 사용할 수 없고 새로 만들어서 사용해야 함 
		//0-199까지의 정수를 입력할 때까지 입력받기
		
		while(true) {
			System.out.printf("숫자를 입력하세요:");
			int s = sc.nextInt();
			if(s < 0 || s>100) {
				System.out.printf("점수는 0에서 100사이로 입력하세요\n");
			}else {
				System.out.printf("올바른 점수입니다.\n", s);
				break;
			}
		}
		
		//or
		
		while(true) {
			System.out.printf("숫자를 입력하세요:");
			int s = sc.nextInt();
			if(s >= 0 && s<=100) {
				System.out.printf("올바른 점수입니다.\n", s);
				break;
			}else {
				
				System.out.printf("점수는 0에서 100사이로 입력하세요\n");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
