package day04;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx03 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();
	while(true) {
		System.out.println("===���� ����===");
		System.out.println("1. �Է�   2. ���  3.���� ");
		System.out.println(">");
		int choice = scan.nextInt();
		if(choice == 3) {
			System.out.println("������ּż� �����մϴ�!");
			break;
		}else if(choice == 1) {
			scan.nextLine();
			System.out.println("�л��� �̸���? ");
			String name = scan.nextLine();
			
			System.out.println("�л��� ���̴�? ");
			int age = scan.nextInt();
			
			System.out.println("�л��� �й���? ");
			int num = scan.nextInt();
			
			System.out.println("�л��� ����������? ");
			int kor = scan.nextInt();
			
			System.out.println("�л��� ����������? ");
			int math = scan.nextInt();
			
			System.out.println("�л��� ����������? ");
			int eng = scan.nextInt();
			
			Student s = new Student();
			s.setName(name);
			s.setAge(age);
			s.setNum(num);
			s.setKor(kor);
			s.setMath(math);
			s.setEng(eng);
			
			list.add(s);
			//�� list�� �̷�����
			
		
		}else if(choice == 2) {
			for(Student s : list) {
				System.out.println(s);
			}
		}
		
		

	}
		
		
		
	}

}
