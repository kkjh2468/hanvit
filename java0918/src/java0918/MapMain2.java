package java0918;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {

	public static void main(String[] args) {
		//Person 클래스의 객체를 만들어서 데이터를 저장
		Person person = new Person();
		person.setName("김종훈");
		person.setAge(25);
		person.setJob("학생and무직");
		
		//Person 객체의 내용을 하나씩 출력
		System.out.printf("이름:%s\n", person.getName());
		System.out.printf("나이:%s\n", person.getAge());
		System.out.printf("직업:%s\n", person.getJob());
		
		System.out.printf("\n");
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		map.put("이름", "김희수");
		map.put("나이", 22);
		map.put("직업", "유아교육과 학생");
		map.put("성격", "이상함");
		
		//모든 key를 전부 가져오기
		Set<String> keyset = map.keySet();
		//데이터 출력 - map에 변화가 생겨도 이 부분은 수정할 필요가 없음
		//Apple은 데이터를 Map 구조로 넘기는 것을 많이함
		for(String key : keyset) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}


	}

}
