package java0917;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		//테이블 구조 만들기
		List<Person> list = new ArrayList<>();
		Person person = new Person();
		person.setName("김종훈");
		person.setPhone("010-5138-7525");
		person.setGuoso("일로36번길 운진빌라");
		person.setAge(25);
		
		//테이블에 데이터를 삽입하기
		list.add(person);
		
		
		
		person = new Person();
		person.setName("김희수");
		person.setPhone("010-2039-7525");
		person.setGuoso("일로36번길 운진빌라");
		person.setAge(22);
		
		list.add(person);
		
		
		//데이터 정렬(sort)
		list.sort(new Comparator<Person>() {
			
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
			
		});
		
		//타이틀을 출력
		System.out.printf("%-6s%-15s%-20s%-3s\n", "이름", "전화번호", "주소", "나이");
		//Fast Enumeration을 이용한 List 접근
		for(Person p : list) {
			System.out.printf("%-6s%-15s%-20s%-3s\n",
					p.getName(), p.getPhone(), p.getGuoso(), p.getAge());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
