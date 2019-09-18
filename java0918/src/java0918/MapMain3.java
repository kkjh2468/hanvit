package java0918;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

	public static void main(String[] args) {
		//국가별 축구 선수 이름을 하나의 배열로 만들기 - 2차원
		String [] korea= {"조현우", "이강인" , "손흥민"};
		String [] spain = {"데헤아", "실바", "라모스"};
		String [] brazil = {"호나우두", "마르셀루", "네이마르"};
		String [] france = {"앙리", "비에이라", "포그바"};
		
		String [][] soccer = {korea, spain, brazil,france};
		
		//
		//
		for(int i=0; i<soccer.length; i=i+1) {
			//
			if(i==0)
				System.out.printf("한국:");
			else if(i==1)
				System.out.printf("스페인:");
			else if(i==2)
				System.out.printf("브라질:");
			else
				System.out.printf("프랑스");
				
			String [] temp = soccer[i];
			for(String imsi : temp) {
				System.out.printf("%10s", imsi);
			}
			System.out.printf("\n");
		}
		
		//배열들을 가지고 배열을 만들 때는 분류를 위해서 각 배열들의 Map을 만들고 그 Map들의 배열을 만들어야함
		HashMap<String, Object> map1 = new HashMap<>();
		//데이터들의 특징을 저장
		map1.put("국가", "한국");
		//실제 데이터를 저장
		map1.put("선수", korea);
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("국가", "스페인");
		map2.put("선수", spain);
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("국가", "브라질");
		map3.put("선수", brazil);
		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("국가", "프랑스");
		map4.put("선수", france);
		
		
		HashMap [] football = {map1, map2, map3, map4};
		
		//Map 들의 배열을 생성
		//실제 프로그램에서는 배열이 아니고 List를 만듬
		//그래야 나중에 동적으로 데이터를 추가
		
		
		for(int i=0; i<football.length; i=i+1) {
			HashMap map = football[i];
			System.out.printf("%s:", map.get("국가"));
			String [] ar = (String[])map.get("선수");
			for(String player : ar) {
				System.out.printf("%10s", player);
			}
			System.out.printf("\n");
		}
		
		
	}

}
