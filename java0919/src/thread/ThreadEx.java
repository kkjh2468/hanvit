package thread;

public class ThreadEx extends Thread {

	public void run() {
		for(int i=0; i<10; i=i+1) {
			System.out.printf("%d\n", i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.printf("%s\n", e.getMessage());
			}
			System.out.printf("%d\n", i);
		}

	}

}
