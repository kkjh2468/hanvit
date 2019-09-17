package java0917;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysMain3 {

	public static void main(String[] args) {
		FileName f1 = new FileName();
		f1.setName("자바");
		f1.setSize(80);
		f1.setType("파워포인트");
		
		FileName f2 = new FileName();
		f2.setName("스윞");
		f2.setSize(120);
		f2.setType("ㅇㄴ");
		
		FileName f3 = new FileName();
		f3.setName("dsds");
		f3.setSize(130);
		f3.setType("dsds2");
		
		//위에서 만든 FileName 객체 3개를 가지고 배열을 생성 
		FileName [] ar = {f1, f2 ,f3};
		
		//키보드로부터 입력 받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정렬 기준을 선택하세요(1.이름 2.크기:");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			Arrays.sort(ar, new Comparator<FileName>() {
				@Override
				public int compare(FileName o1, FileName o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
		}else if(menu == 2){
			Arrays.sort(ar, new Comparator<FileName>() {

				@Override
				public int compare(FileName o1, FileName o2) {
					// TODO Auto-generated method stub
					return 0;
				}
				
			});
		}else if (menu == 3){
		
		}else {
		
			System.out.printf("메뉴는 1번과 2번만 선택\n");
			System.exit(0);
		}
		
		for(FileName temp : ar) {
			System.out.printf("%s\n", temp);
		}
		
		//입력 받는 객체 닫기
		sc.close();
		
		

	}

}
