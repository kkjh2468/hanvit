package multithread;

public class Main {

	public static void main(String[] args) {
		//연산작업을 스레드를 여러 개 실행시키고자 하면 최적의 개수는 코어의 개수임
		//자기 CPU의 코어 개수 확인
		System.out.printf("코어 개수:%d\n", Runtime.getRuntime().availableProcessors());
		
		System.out.printf("---------\n");
		
		//공유 데이터
		Product product = new Product();
		
		//생산자 스레드 실행
		Producer producer = new Producer(product);
		producer.start();
		
		//소비자 스레드 실행
		//삭제하는 스레드는 데이터가 존재할 때만 동작해야함
		Consumer consumer = new Consumer(product);
		consumer.start();
		

	}

}
