package day04;

public class StudentEx {
	public static void main(String[] args) {
		Student s = new Student();
		//s.showScoreCard();
		//s.name = "������";
		//s.age = 30;
		//s.kor = 100;
		//s.eng = 80;
		//s.math = 95;
		//System.out.println(s);
		//s.showScoreCard();
		
		//System.out.println(s.name + "���� ����: "+ s.total());
		//System.out.println(s.name + "���� ���: "+ s.calcAvg());
		
		//���� �̰Ŵ� ���� �Լ��� ����� ��θ� �̾߱��ϴ� ���̴�. 
		//������ �ٷ�� ����� ���� �ִ°��̴�. 
		// 
		
		Student s2 = new Student("�趯", 28);
		s2.setName("�̸���");
		s2.setAge(24);
		//s2.name = "�趯����������������";
		//s2.age = 28;
		//s2.kor = 90;
		//s2.eng = 98;
		//s2.math = 70;
		System.out.println(s2);
		//System.out.println(s2.name + "���� ����: "+ s2.total());
		//System.out.println(s2.name + "���� ���: "+ s2.calcAvg());
		
		//System.out.println(name); 
		//� ���� ����� �� �ִ°ž�?
		
		//�Ķ���ʹ� ����
	}


	
	
}
