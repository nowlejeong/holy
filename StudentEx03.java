package day04;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx03 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();
	while(true) {
		System.out.println("===성적 관리===");
		System.out.println("1. 입력   2. 출력  3.종료 ");
		System.out.println(">");
		int choice = scan.nextInt();
		if(choice == 3) {
			System.out.println("사용해주셔서 감사합니다!");
			break;
		}else if(choice == 1) {
			scan.nextLine();
			System.out.println("학생의 이름은? ");
			String name = scan.nextLine();
			
			System.out.println("학생의 나이는? ");
			int age = scan.nextInt();
			
			System.out.println("학생의 학번은? ");
			int num = scan.nextInt();
			
			System.out.println("학생의 국어점수는? ");
			int kor = scan.nextInt();
			
			System.out.println("학생의 수학점수는? ");
			int math = scan.nextInt();
			
			System.out.println("학생의 영어점수는? ");
			int eng = scan.nextInt();
			
			Student s = new Student();
			s.setName(name);
			s.setAge(age);
			s.setNum(num);
			s.setKor(kor);
			s.setMath(math);
			s.setEng(eng);
			
			list.add(s);
			//왜 list가 이런거지
			
		
		}else if(choice == 2) {
			for(Student s : list) {
				System.out.println(s);
			}
		}
		
		

	}
		
		
		
	}

}
