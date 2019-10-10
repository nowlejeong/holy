package day04;
//상속은 코드의 재사용성과 유지보수를 위해서 사용한다
//부모클래스의 메소드를 자식 클래스가 이어받아서 사용할 수 있게한다. 

public class Human {
	String name;
	String birthDay;
	//위 필드 아래 메소드를 생성해봅시다.
	
	void think() {
		System.out.println("나는 생각한다.");
	}
}
