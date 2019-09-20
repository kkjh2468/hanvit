package java0920.awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {
		//배경색이 될 배열
		Color [] colors = {Color.pink, Color.DARK_GRAY, Color.MAGENTA, Color.YELLOW};
		String [] titles = {"1", "2", "3", "4"};
		//인덱스 변수
		int i =0;
		
		//색상을 변경하는 스레드
		Thread th = new Thread() {
			public void run() {
				while (true) {
					i = i + 1;
					try {
						Thread.sleep(2000);
						//setBackground(colors[i%colors.lenght]);
						setTitle(titles[i % titles.length]);
					}catch(Exception e) {
						System.out.printf("%s\n", e.getMessage());
					}
				}
			}
		};
		
	}

