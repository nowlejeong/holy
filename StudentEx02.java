package day04;

public class StudentEx02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("정일진");
		s.setNum(1);
		
		Student s2 = new Student();
		s.setName("정일진");
		s.setNum(2);
		
		System.out.println(s.equals(s2));

	}

		
}
