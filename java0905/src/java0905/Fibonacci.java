package java0905;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//입력받은 숫자 번째 피보나치 수열의 값 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수를 입력: ");
		int ss=sc.nextInt();
		
		int s1 = 1;
		int s2 = 1;
		int fb = 1;
		for(int i=3; i<=ss; i=i+1) {
			fb=s1+s2;
			s1=s2;
			s2=fb;
		}
		System.out.printf("%d번째 수열의 값:%d\n",ss, fb);
		
	
		
		sc.close();
	}

}
