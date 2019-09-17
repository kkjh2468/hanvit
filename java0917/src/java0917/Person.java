package java0917;

public class Person {
	//각각의 속성을 private 변수로 생성
	private String name;
	private String phone;
	private String guoso;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGuoso() {
		return guoso;
	}
	public void setGuoso(String guoso) {
		this.guoso = guoso;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//디버싱을 위한 메소드
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", guoso=" + guoso + ", age=" + age + "]";
	}
	
}
