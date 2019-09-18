package java0918;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain {

	public static void main(String[] args) {
		//문자를 저장하는 stack을 생성
		Stack<String> stack = new Stack<>();
		//데이터 삽인은 push
		stack.push("색상 보정");
		stack.push("레이어 추가");
		
		//데이터를 삭제하면서 가져오기는 pop
		//pop 대신에 peek를 사용하면 2개의 결과가 동일
		String new_data = stack.pop();
		System.out.printf("%s\n", new_data);
		new_data = stack.pop();
		System.out.printf("%s\n", new_data);
		
		LinkedList<String> li = new LinkedList<>();
		li.add("170");
		li.add("98");
		li.add("105");
		//LinkeList는 순서대로 출력
		for(String temp : li) {
			System.out.printf("%s\t",temp);
		}
		System.out.printf("\n-----------------------\n");
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("170");
		pq.add("98");
		pq.add("105");
		/*
		for(String temp : pq) {
			System.out.printf("%s\t", temp);
		}
		*/
		//PriorityQueue 크기는 순서대로
		System.out.printf("%s     ", pq.poll());
		System.out.printf("%s     ", pq.poll());
		System.out.printf("%s     ", pq.poll());
		
	}

}
