package eventhandling;

import java.util.ArrayList;

public class EventMain {

	public static void main(String[] args) {
		
		//new EventFrame();
		//new EventRouting();
		//new ItemFrame();
		new TextEventFrame();
		/*
		//데이터의 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("사냥");
		list.add("퀘스트 수행 ");
		list.add("던전 사냥");
		list.add("물품 구입");
		list.add("펫 공격");
		list.add("물약 사용");
		//삭제할 항목의 인덱스 리스트
		ArrayList<Integer> deleteList = new ArrayList<>();
		deleteList.add(1);
		deleteList.add(2);
		deleteList.add(5);
		//리스트에서 데이터를 삭제하는 메소드 remove(int index)
		
		//데이터의 리스트를 가지고 인덱스 리스트에 해당하는 데이터를 삭제
		//리스트에서 여러 개를 삭제할 때는 뒤에서부터 삭제를 하던가
		//삭제할 때마다 인덱스를 변경하던가 해야함
		/*
		for(int idx : deleteList) {
			//System.out.printf("%d\n", idx);
			//list.remove(idx);
			list.remove(idx);
		}
		*/
		/*
		//deleteList 에서 뒤에서부터 가져오기
		//인덱스를 가지고 여러 개를 삭제할 때는 뒤에서부터 삭제해야함
		//앞에서부터 삭제하면 뒤의 데이터 인덱스가 변경됨
		for(int i=deleteList.size()-1; i>=0; i=i-1) {
			int idx = deleteList.get(i);
			list.remove(idx);
		}
		
		for(String temp : list) {
			System.out.printf("%s\n", temp);
		}
		*/
	}

}
