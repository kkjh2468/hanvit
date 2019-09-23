package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	Button blueBtn, greenBtn;
	
	public EventRouting() {
		setLayout(new FlowLayout());
		
		
		 //버튼 2개의 이벤트 처리를 2개의 객체를 생성해서 처리
		blueBtn = new Button("파랑");
		greenBtn = new Button("녹색");
		
		blueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
			}
		});
		
		greenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.GREEN);
			}
		});
		
		this.add(blueBtn);
		this.add(greenBtn);
		
		

		//이벤트 처리 객체를 생성
		ActionListener listner = new ActionListener() {
			@Override
			//이벤트가 발생한 객체 - e.getSource()
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == blueBtn) {
					setBackground(Color.blue);
				}else if(e.getSource() == greenBtn) {
					setBackground(Color.green);
				}
			}
		};
		//2개의 버튼의 액션 이벤트 처리를 동일한 객체에게 위임 - 이벤트 라우팅
		blueBtn.addActionListener(listner);
		greenBtn.addActionListener(listner);
		
		
		setBounds(100,100, 300,300);
		setTitle("이벤트 라우팅");
		setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
