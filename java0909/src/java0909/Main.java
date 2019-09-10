package java0909;

public class Main {

	public static void main(String[] args) {
		//Student 클래스의 instance 생성 
		Student student1= new Student();
		//속성에 set 메소드를 이용해서 값을 설정
		student1.setHakbun("2310");
		student1.setName("김종훈");
		student1.setGender(true);
		student1.setMobile("01051387525");
		
		//get 메소드를 이용해서 값을 가져와서 출력
		System.out.printf("학번:%s\n", student1.getHakbun());
		System.out.printf("이름:%s\n", student1.getName());
		System.out.printf("이름:%s\n", student1.getMobile());
		System.out.printf("성별:%s\n", student1.isGender());
		
		//student1 no 값 출력 
		System.out.printf("번호:%d\n",student1. getNo());
		//student2 no 값 출력 
		Student student2 = new Student();
		System.out.printf("번호:%d\n", student2. getNo());
		
		//매개변수가 있는 생성자를 호출해서 초기화
		Student student4 = new Student("901010","제시카",true, "010513551351");
		//set 메소드를 호출하지 않고 속성을 초기화
		System.out.printf("학번:%s\n", student4. getHakbun());
		
	
		
		
		
	}

}
