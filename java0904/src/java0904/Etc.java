package java0904;

public class Etc {

	public static void main(String[] args) {
		// 1부터 10까지 출력
		/*for(int idx = 1; idx<=10; idx=idx+1) {
			//idx가 3의 배수라면
			if(idx % 3 ==0) {
				break; //결과가 1,2,3...,10 이 나와야 하는데 3이 나왔을 때 3이 3의 배수임으로 break되어 반복문을 중단함으로 2까지 출력
			}System.out.printf("idx:%d\n",idx);
		}
*/
		for(int idx = 1; idx<=10; idx=idx+1) {
			//idx가 3의 배수라면
			if(idx % 3 ==0) {
				continue; //continue는 진행하지 않고 끝나는 것이 아닌 다음 반복으로 넘어감으로 3,6,9를 제외하고 나머지 모두 출력
			}
			System.out.printf("idx:%d\n",idx);
		}
		
		
		
		
		
	}

}
