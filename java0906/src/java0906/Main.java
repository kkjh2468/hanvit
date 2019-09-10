package java0906;

public class Main {
	public static void main(String[] args) {
		//MethodClass의 인스턴스 생성 
		MethodClass instance = new MethodClass();
		//동일한 이름이지만 매개변수의 모양이다른 메소드 호출
	//	instance.add(10, 20);
	//	instance.add(20.8, 29.5);
		
		instance.sum(100, 300);
		instance.sum(100, 500, 300);
		instance.sum(100, 300, 500, 700);
		
		int result = instance.returnadd(300, -100);
		result = instance.returnadd(result, 800);
		System.out.printf("결과:%d\n", result);
		//결과를 리턴하는 메소드는 다른 메소드의 매개변수가 될 수 있음
		System.out.printf("결과:%d\n", instance.returnadd(instance.returnadd(300,200),400));
		
		MethodClass obj = new MethodClass();
		System.out.printf("%d\n", obj.fibo1(10));
		System.out.printf("%d\n", obj.fibo1(8));
		System.out.printf("%d\n", obj.fibo2(10));
		System.out.printf("%d\n", obj.fibo2(8));
		obj.thisMetod();
		
		
		/*
		//Student 클래스 객체 만들기
		Student student = new Student();
		//메소드 호출 
		student.func();
		
		//매개변수가 없는 메소드 호출
		student.noArg();
		//매개변수가 있는 메소드 호출 
		student.oneArg(10);
		
		int k = 0;
		//메소드의 매개변수로 기본형 데이터를 넘겨주는 경우 
		//메소드를 호출해도 데이터는 변경되지 않음
		student.value(k);
		System.out.printf("k:%d\n", k);
		
		int [] br = {30,40};
		//메소드의 매개변수로 기본형이 아닌 데이터를 넘겨주면
		//메소드를 호출하고 나 후 데이터가 변경될 수 있음 
		student.reference(br);
		System.out.printf("br[0]:%d\n", br[0]);
		
		/*
		//Student 클래스 객체 만들기
		//Student 클래스의 객체를 생성하고 그 주소를 st1 이라는 변수에 대입
		Student st1 = new Student();
		Student st2 = new Student();
		
		//studentName이라는 인슽너스 변수에 값을 대입 
		st1.studentName = "김종훈";
		st2.studentName = "김종현";
		
		st1.schoolName = "성저초등학교";
		st2.schoolName = "한뫼초등학교";
		
		//st1.num = "10";
		//st1.phone = "010~";
		
		int a = 10;
		a = 7;
		final int B = 20;
		B = 40;
		
		System.out.printf("%s\n", st1.studentName);
		System.out.printf("%s\n", st2.studentName);
		System.out.printf("%s\n", st1.schoolName); 
		System.out.printf("%s\n", st2.schoolName); 
		// Student.java 파일(실행할 때 도와주는 클래스 파일)에서 static을 붙혀 놓아서 전부 한뫼초등학교로 출력되는 것임
		//여기 클래스에서 쓴대로 출력하려면 Student.java 파일(실행할 때 도와주는 클래스 파일)에서 static을 뻬면 됨
		*/
		
		
			
		
		
		
		
		
		
		
		
		
	}
}
