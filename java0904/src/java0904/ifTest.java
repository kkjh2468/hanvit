package java0904;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력: ");
		int score = sc.nextInt();
		
		
		if(score >= 90 && score <= 100) {
			System.out.printf("A\n");
		}else if (score >= 80 && score <= 89) {
			System.out.printf("B\n");
		
		}else if (score >= 70 && score <= 79) {
			System.out.printf("C\n");
			
		}else if (score >= 60 && score <= 69) {
			System.out.printf("D\n");
			
		}else {
			System.out.printf("점수 잘못 입력했음 ");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
