
public class sample {
	public static void main(String[] args) {
		//System.out.println("자바 명령어 실습 ");

		//나이와 몸무게를 저장해서 출력
		//어떤 데이터를 저장해두고 사용할 대는 변수를 생성해서 저장
		//변수를 만들 때는 어떤 종류의 데이터를 저장할 것인지 자료형을 결정해야 함
		
		//나이는 정수, 몸무게는 실수
		
		int age = 25;
		double weight = 75;
		int height = 193;
		
		//데이터를 출력 
		System.out.println("나이: " + age + "입니다.");
		System.out.println("몸무게: " + weight + "입니다.");
		System.out.println("키: " + height + "입니다.");
		
		System.out.print("\n");
		
		System.out.println("나이: " + age + "입니다." + "몸무게: " + weight + "입니다." + "키: " + height + "입니다.");
		
		System.out.print("\n");
		
		System.out.println("나이: " + age + "입니다." + "\n몸무게: " + weight + "입니다." + "\n키: " + height + "입니다.");
		
		
		System.out.print("\n");
		//char는 저장은 정수를 하고 있다가 출력할 때 문자로 변환해서 출력
		//48이 숫자 0, 65가 대문자A, 97이 소문자 a
		char ch = 65;
		System.out.println("ch:" + ch);
		
	}

}
