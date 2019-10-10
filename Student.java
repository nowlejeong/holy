package day04;

public class Student {
	private String name;
	//getter와 setter 메소드를통해서 필드에 접근할 수 있다
	//getter는 현재필드에 저장된 값을 리턴한다
	//setter는
	
	//public String getName() {
	//	return name;
	//}
	
	
	//setter는 외부로부터 받아서  필드에 저장한다
	public void setName(String name) {
		if(name.length() < 4 ) {
			this.name = name;
		}else{
			System.out.println("잘못된 이름!!!!");
		}
	}

	private int age;
	
	 	//public int getAge() {
	 	//	return age;
	 	//}
	
	public void setAge(int name) {
		this.age = age;
	}
	private int kor;
	private int eng;
	private int math;
	//private 을 쓰면서 데이터가 은닉화 되었다. 
	
	
	double calcAvg() {
		return total() / 3.0; 
		
		//메인 메소드가 언제 필요하고 언제 필요없는지를 모르겠네 .
		
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	int total() {
		return kor + eng + math; 
	}
		
	//return을 안해야 한다. 
	
	//void는 어떤 값인가?
	void showScoreCard() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + total());
		System.out.println("평균 : " + calcAvg());
		
		
	}
		
	//constructor는 뭐여 
	//메소드? 초기화 될때쓰는 메소드?
	//()가나오면 메소드입니다.
	//자바가 기본적으로 제공해주는 메소드

	//this 라는 예약어를 사용해보자! 
	
	//Student(){
		//name = "학생";
		//age = 18;
		//kor = 90;
		//eng = 100;
		//math = 80;
		
	//}
	//생성자
	Student(String name, int age){
		this.name = name;
		this.age = age; 
	}
	//오버로딩?
	Student(){
		name = "기본이름";
		age = -1;
		kor = -1;
		eng = -1;
		math = -1;
		
	}
	
	//toString() 이라는 메소는 뭐지? 객체의 정보를 리턴해준다고?
	public String toString() {
		return " name : " + this.name +  " age : " + this.age +  " kor : " + this.kor +  " eng : " + this.eng +  " math : " + this.math; 
	}
	//접근 제한자는 뭐여? 어디서든 접근을 할 수 있어야한다고? 
	//public은 어디서도 데려다 쓸 수 있다
	//protected는 못온다
	//pakage는 그 안에 있는 정보를 다룬다
	//private 는 무엇인가? 
	
	
	//class 는 필드 > 생성자 > 겟터셋터 > 그외의 메소드 순으로 하는 것이 최고다.
	private int num;
	public int getNum() {
		return num;
		
	}
	
	public void setNum(int num) {
		this.num = num;
		
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			if(this.name.equals(s.name) && this.num == s.num) { 
				return true;
			}
		}
		
		return false;
	}
	
	
	}

