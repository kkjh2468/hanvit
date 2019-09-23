package Layout;

import java.awt.Button;
import java.awt.Frame;
import java.util.Random;

public class NullLayoutFrame extends Frame {
	Button btn;
	int x = 30;
	int y = 30;
	int z = 40;
	int zz = 40;
	public NullLayoutFrame() {
		//레이아웃을 null로 설정
		setLayout(null);
		
		btn = new Button("버튼");
		//Layout이 null 일 때는 위치와 크기를 직접 설정
		btn.setBounds(x, y, z, zz);
		add(btn);
		
		setBounds(500,500, 500,500);
		setTitle("NullLayout");
		setVisible(true);
		
		//스레드를 만들고 실행
		Thread th = new Thread() {
			boolean flag = true;
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
						Random r = new Random();
						x = r.nextInt(400);
						y = r.nextInt(400);
						btn.setLocation(x, y);
						btn.setVisible(flag);
						flag = !flag;
						
					}catch(Exception e) {
						
					}
				}
			}
		};
		th.start();
		
	}
}
