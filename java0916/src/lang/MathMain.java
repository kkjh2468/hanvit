package lang;

public class MathMain {

	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,6/*아이템을 사서 높은 숫자가 나올 확률을 높이고 싶으면 높은 숫자를 더 추가해서 입력해준다*/};
		//0.0 -1.0 사이의 랜덤한 실수를 만들어서 저장
		double r = Math.random();
		//ar 배열의 인덱스 범위 내의 숫자로 변경하기
		int idx = (int)(r * 100) % ar.length;
		System.out.printf("%d\n", ar[idx]);
	}

}
