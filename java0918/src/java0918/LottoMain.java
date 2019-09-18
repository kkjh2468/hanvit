package java0918;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		//1-45까지의 숫자 6개를 중복 없이 저장
		//어떤 자료구조를 이용해서 저장하는 것이 가장 코드를 줄일 수 있는지 생각
		//동일한 자료형의 데이터를 여러개 저장하는 자료구조
		
		//최근에는 배열도 List로 취급
		//배열
		//ArrayList, LinkedList, Stack
		//PriorityQueue, ArrayDeque
		//HashSet, LinkedHashSet, TreeSet
		
		//배열을 사용하는 경우
		//정수 6개를 저장하는 배열
		//int [] lot = new int [6];
		
		PriorityQueue <Integer> lottoQueue = new PriorityQueue<>();
		
		//중복된 데이터를 저장하지 않고 데이터의 크기 순서대로 저장하는 자료구조 객체 만들기
		TreeSet<Integer> lotto = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		//결과가 변하지 않는 자주 접근하는 속성이나 메소드의 결과는 지역변수에 저장하고 사용
		//int len =lot.length;
		
		for(; lotto.size()<6; ) {
			//input에 정수 입력받기
			System.out.printf("숫자입력(1-45):");
			int input = sc.nextInt();
			
			//1부터 45사이가 아니라면 다시 입력
			if(input <1 || input >45) {
				System.out.printf("1-45!!\n");
				continue;
			}
			
			//데이터 삽입 여부를 r에 저장하면서 삽입
			boolean r = lotto.add(input);
			//삽입에 실패했다면 - 데이터 중복
			if(r == false) {
				System.out.printf("중복된 데이터는 안됨!\n");
				
				
			}
			
			
				
				
			}
		
		//우선순위 큐는 poll을 출력하면 순서대로 출력
		for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		
		//중복 검사를 해서 통과하지 못하면 다시 입력
		//처음에는 할 필요가 없어서 i>0 보다 클 때
		/*
		int j = 0;
		for(Integer temp : lottoQueue) {
			if(input == temp) {
				j = 1;
				break;
			}
		*/
			
		/*if(i > 0) {
			for(j=0; j<=i; j=j+1) {
				if(input == lotQ.[j]) {
					break;
				}
			}
			*/
			//if(j != i+1) {
				//System.out.printf("중복된 숫자 놉!!\n");
				//i= i-1;
				//continue;
			}
			
			//유효성 검사를 통과하면 데이터를 배열에 저장
			//lot[i] = input;
		//	lottoQueue.add(input);
	//	}
		
		//데이터를 정렬 - 전에는 직접 정렬했는데
		//API 메소드를 정렬
		//Arrays.sort(lottoQueue);
		
		
		/*for(int temp : lottoQueue) {
			System.out.printf("%1d\t", temp);
		}
		 */
		
		//우선순위 큐는 poll을 출력하면 순서대로 출력
		//for(int i=0; i<6; i=i+1) {
		//	System.out.printf("%d\t", lottoQueue.poll());
		//}
		
		
	}
	}


