package exceptionhanhing;

public class Sleep {
	//이렇게 main에서 throws를 만들면 예외가 발생한 경우 운영체제가 처리
	//main은 운영체제가 호출하기 때문
	public static void main(String[] args)/*이 방법과*/ throws InterruptedException {
		
		//1-10까지 1초씩 대기하면서 출력하기
		for(int i=0; i<=10; i=i+1) {
			System.out.printf("i:%s\n", i);
//			try {
				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.printf("인터럽트 예외 발생\n");				// 처리를 한 부분의 방법으로 실행
//				System.out.printf("예:%s\n",e.getMessage());
//				e.printStackTrace();
//			}
		}
		
	}
}

