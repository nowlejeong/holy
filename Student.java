package day04;

public class Student {
	private String name;
	//getter�� setter �޼ҵ带���ؼ� �ʵ忡 ������ �� �ִ�
	//getter�� �����ʵ忡 ����� ���� �����Ѵ�
	//setter��
	
	//public String getName() {
	//	return name;
	//}
	
	
	//setter�� �ܺηκ��� �޾Ƽ�  �ʵ忡 �����Ѵ�
	public void setName(String name) {
		if(name.length() < 4 ) {
			this.name = name;
		}else{
			System.out.println("�߸��� �̸�!!!!");
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
	//private �� ���鼭 �����Ͱ� ����ȭ �Ǿ���. 
	
	
	double calcAvg() {
		return total() / 3.0; 
		
		//���� �޼ҵ尡 ���� �ʿ��ϰ� ���� �ʿ�������� �𸣰ڳ� .
		
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
		
	//return�� ���ؾ� �Ѵ�. 
	
	//void�� � ���ΰ�?
	void showScoreCard() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		System.out.println("���� : " + total());
		System.out.println("��� : " + calcAvg());
		
		
	}
		
	//constructor�� ���� 
	//�޼ҵ�? �ʱ�ȭ �ɶ����� �޼ҵ�?
	//()�������� �޼ҵ��Դϴ�.
	//�ڹٰ� �⺻������ �������ִ� �޼ҵ�

	//this ��� ���� ����غ���! 
	
	//Student(){
		//name = "�л�";
		//age = 18;
		//kor = 90;
		//eng = 100;
		//math = 80;
		
	//}
	//������
	Student(String name, int age){
		this.name = name;
		this.age = age; 
	}
	//�����ε�?
	Student(){
		name = "�⺻�̸�";
		age = -1;
		kor = -1;
		eng = -1;
		math = -1;
		
	}
	
	//toString() �̶�� �޼Ҵ� ����? ��ü�� ������ �������شٰ�?
	public String toString() {
		return " name : " + this.name +  " age : " + this.age +  " kor : " + this.kor +  " eng : " + this.eng +  " math : " + this.math; 
	}
	//���� �����ڴ� ����? ��𼭵� ������ �� �� �־���Ѵٰ�? 
	//public�� ��𼭵� ������ �� �� �ִ�
	//protected�� ���´�
	//pakage�� �� �ȿ� �ִ� ������ �ٷ��
	//private �� �����ΰ�? 
	
	
	//class �� �ʵ� > ������ > ���ͼ��� > �׿��� �޼ҵ� ������ �ϴ� ���� �ְ��.
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

