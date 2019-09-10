package java0903;
import java.util.Scanner;
	public class ScannerInput {

		public static void main(String[] args) {
			//키보드로부터 입력 받을 수 있는 스캐너 생성 
			Scanner sc = new Scanner(System.in);
			//이름을 문자열로 입력받기
			System.out.printf("이름을 입력하세요: ");
			String name =sc.nextLine();
			System.out.printf("이름:%s\n", name);
			System.out.printf("나이를 입력하세요: ");
			int age =sc.nextInt();
			System.out.printf("나이:%s\n", age);
			System.out.printf("키를 입력하세요: ");
			int k =sc.nextInt();
			System.out.printf("키:%s\n", k);
			
			System.out.println("-------------------------------------------------");
			
			System.out.printf("점수를 입력하세요: ");
			int score = sc.nextInt();
			
			//score가 60이상이면 합격이라고 출력, 그렇지 않으면 불합격이라고 출력함
			if(score >= 60) {
				System.out.printf("합격\n");
			}
			else{
				System.out.printf("불합격\n"); //else를 쓸 때는 if의 가로를 닫고 써야됨
			}
			
			
			
			
			
			
			
			
			
	}

}
