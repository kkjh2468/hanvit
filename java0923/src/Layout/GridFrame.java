package Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridFrame extends Frame {
	
	//버튼 모임
	Button [] btn;
		
	public GridFrame() {
		//버튼 배열 객체 만들기
		btn = new Button[6];
		
		//현재 프레임의 레이아웃을 설정
		//행 수와 열 수를 설정해서 배치하는 레이아웃을 선택
		this.setLayout(new GridLayout(3,2));
		
		//좌석 번호의 앞 부분을 출력할 변수 
		char ch = 'A';
		//좌석 번호의 뒷 부분을 출력할 변수
		int idx = 1;
		
		//하나 하나 버튼 생성
		for(int i=0; i<6; i=i+1) {
			//줄은 몫
			ch = (char)('A'+ (i/2));
			//칸은 나머지
			idx = 1 + (i % 2);
			//ch + i를 하면 실제 더하기를 수행함
			//ch + "" 를 하면 문자열이 되고 문자열 + i를 하면 문자열
			//String.format을 이용해서 문자열을 생성하는 것이 좋음
			String btnName = String.format("%c%d", ch, idx);
			btn[i] = new Button(btnName);
			//현재 프레임에 버튼 추가
			this.add(btn[i]);
		}
		//이 버튼은 누르지 못하도록 설정
		//2번째, 3번째 버튼이 누르지 못하도록 출력됨
		btn[2].setEnabled(false);
		btn[3].setEnabled(false);
		
		//{0,1,0,0,1,1,0,1,0}
		//A1 A2 A3 A4
		//B1 B2 B3 B4
		//를 만들 때 정사각 형으로 만드는 것이 더 좋음
		//ex) 카카오 택시를 부를 때 반대 쪽으로 가는 가까운 택시를 부르는 것보다 같은 쪽으로 가는 길에 있는 택시를 부르는 것이 더 좋음
		
		//크기와 보여주기 설정은 필수
		this.setTitle("그리드 레이아웃 ");		
		this.setLocation(300, 300);
		this.setSize(300, 300);
		this.setVisible(true);
		
	}
}
