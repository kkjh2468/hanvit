package java0917;

import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
		
		String [] names = {"ㄱ","ㄴ","ㄷ","ㄹ"};
		//배열의 데이터를 정렬해주는 메소드
		//Arrays.sort
		Arrays.sort(names);
		//정렬이 되었는지 확인
		for(String name : names) {
			System.out.printf("%s\n", name);
		}
		
		//정수 배열도 정렬이 가능
		//정수는 int 이지만 Arrays가 볼 때는 Integer 임
		int [] ar = {120, 80, 25, 58, 65, 10}; 
		//정렬하지 않는 상태에서 binary search 수행
		//binary search는 정렬이 안된 상태에서 하면 올바른 결과를 가져오지 못함
		int result = Arrays.binarySearch(ar, 25);
		System.out.printf("result:%d\n", result);
		//먼저 정렬을 수행하고 binary search 수행
		//12, 20, 25, 43, 62,100
		Arrays.sort(ar);
		result = Arrays.binarySearch(ar, 25);
		System.out.printf("result:%d\n", result);
		
	}

}
