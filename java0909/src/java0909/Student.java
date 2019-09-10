package java0909;

public class Student {
	
	//인스턴스의 일련번호를 저장할 속성
	private int no;
	
	public int getNo() {
		return no;
	}
	
	//속성 선언
	private	String hakbun;
	private String name;
	private boolean gender;
	private String mobile;
	
	//일련번호를 만들기 위한 static 변수
	// static 변수는 1개만 만들어지고 초기값은 0
	private static int autoinc;
	
	//특정 속성의 값을 상수로 설정하는 생성자
	//특정 속정이 일정한 값을 형태인 경우 생성자에서 하는 것이
	//setter 를 호출하지 않아도 되므로 유리함
	public Student() {
		//static 변수의 값을 1증가
		autoinc = autoinc + 1;
		//no에 대입
		no = autoinc;
		hakbun = "1";
	}
	//매개변수가 있는 생성자
	//기존에 생성자가 존재하는 데 매개변수의 개수를 다르게 해서
	//생성자를 생성 - Overloading
	public Student(String hakbun, String name, boolean gender, String mobile) {
		//autoinc = autoinc + 1;
		this();//자신의 매개변수가 없는 생성자를 생성자에서 호출, 맨 처음에 나와야 함
		//this를 붙이면 메소드에서 찾지 않고 메소드 외부에서 찾음
		//this가 안 붙으면 메소드 내에서 찾고 없으면 메소드 외부에서 찾음
		this.hakbun = hakbun;
		this.name = name;
		this.gender = gender;
		this .mobile = mobile;
	}
	
	
	public String getHakbun(){
//		this(); (맨 처음에 붙여야 함 나중에 붙이면 에러남)
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
