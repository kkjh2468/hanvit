package eventhandling;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ItemFrame extends Frame {
	//List(아이템 목록) 와 버튼을 배치해서 List 에서 선택을 변경했을 때 
	//이벤트 처리를 해보고 버튼을 눌렀을 때 List에서 어떤 항목들을 선택했는지 확인
	//Checkbox에서도 선택된 항목을 가져오기
	
	List list;
	Checkbox [] checkbox;
	Button btn;
	
	//List 나 Choice 처럼 여러 개의 항목을 출력하고 
	//그 중에서 선택된 항목을 가져오는 경우에 항목을 배열이나 java.util.List로 만들어 놓는 것이 좋음 
	//List에 출력할 항목의 리스트
	ArrayList<String> items;
	
	public ItemFrame() {
		setLayout(new FlowLayout());
		
		//목록 만들기
		items = new ArrayList<String>();
		items.add("칼");
		items.add("활");
		items.add("지팡이");
		items.add("창");
		items.add("쌍검");
		items.add("글러브");
		
		//항목을 출력하는 List 생성하고 데이터에 추가하기
		//6개의 항목을 보여주고 여러 개를 선택할 수 있도록 만들어 줌
		list = new List(6, true);
		for(String item : items) {
			list.add(item);
		}
		add(list);
		
		//체크박스 배열을 생성하고 각각의 데이터를 생성한 후 프레임에 추가
		Checkbox[] checkBoxs = new Checkbox[6];
		checkBoxs[0] = new Checkbox("칼");
		checkBoxs[1] = new Checkbox("활");
		checkBoxs[2] = new Checkbox("지팡이");
		checkBoxs[3] = new Checkbox("창");
		checkBoxs[4] = new Checkbox("쌍검");
		checkBoxs[5] = new Checkbox("글러브");
		for(Checkbox box : checkBoxs) {
			add(box);
		}
		
		//버튼을 생성하고 추가
		btn = new Button("확인");
		add(btn);
		
		//List 에서 항목을 선택했을 때 처리
		list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//선택한 항목 출력 - 선택이 해제된 아이템과 선택된 아이템의 인텍스가 리턴됨
				//System.out.printf("%s\n", e.getItem());
				//선택이 변경된 내용 - 선택이 된 아이템은 1 선택에 해제된 아이템은 2가 리턴
				//System.out.printf("%s\n", e.getStateChange());
				
				//어떤 메소드의 리턴타입이 Object 일 때
				//출력하는 경우를 제외하고는 강제 형 변환해서 사용해야함
				if(e.getStateChange() == 1) {
					System.out.printf("%s가 리턴 됨");
						items.get((Integer)e.getItem());
				}else {
					System.out.printf("%s가 선택해제 됨");
						items.get((Integer)e.getItem());
				}
			}
		});
			
		//버튼을 클릭했을 때 List 에서 선택된 항목들을 출력
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//List 처럼 여러 개의 항목을 출력하는 컴포넌트들은 
				//자신의 항목 중에서 몇 번째 항목이 선택되었는지 리턴하는 메소드가 존재함
				//getSelectedIndex, getSelectedIndexes
				int [] selectedIndexes = list.getSelectedIndexes();
				//생선한 인덱스를 가지고 items에서 항목을 찾아와서 출력
				for(int i : selectedIndexes) {
					System.out.printf("%s가 선택됨", items.get(i));
				}
			}
			
		});
		
		setBounds(100,100, 300,300);
		setTitle("Item Event 처리");
		setVisible(true);
	}
	
	
}
