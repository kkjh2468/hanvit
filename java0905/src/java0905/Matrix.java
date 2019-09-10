package java0905;

public class Matrix {

	public static void main(String[] args) {
		//2행 3열 짜리 배열을 데이터에 대입한 상태에서 생성
		String [] [] korean = {
				{"제이어스 ", "마커스 ", "한빛밴드 "},
				{"종훈 ", "종현 ", "희수"}};
		//2차원 배열의 모든 데이터를 접근
		//2개의 반복문을 이용
		for(int row = 0; row < 2; row = row + 1) {			
			for(int col = 0; col < 3; col=col+1) {
				System.out.printf(korean[row][col]/*  +"\n" // 1개가 출력 될 때마다 줄 바꿈*/);
			}
			System.out.printf("\n"); // 반복문을 출력하고 줄 바
		}
		System.out.printf("\n");
		//위의 반복문 하나의 반복문으로 처리 
		//행인덱스는 열의 개수일 때마다 변경 : 특정한 개수만큼 진행하는 작업은 몫을 이용해서 가능
		
		//열인덱스는 0부터 열인덱스-1 까지를 순서대로 반복
		//일정한 범위 내의 데이터를 순서대로 하도록 할 때는 나머지를 이용
		System.out.printf("=================================\n");
		for(int i =0; i < 6; i = i +1) {
			System.out.printf(korean[i/3][i%3]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
