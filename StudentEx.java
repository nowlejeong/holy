package day04;

public class StudentEx {
	public static void main(String[] args) {
		Student s = new Student();
		//s.showScoreCard();
		//s.name = "정일진";
		//s.age = 30;
		//s.kor = 100;
		//s.eng = 80;
		//s.math = 95;
		//System.out.println(s);
		//s.showScoreCard();
		
		//System.out.println(s.name + "님의 총점: "+ s.total());
		//System.out.println(s.name + "님의 평균: "+ s.calcAvg());
		
		//아하 이거는 내가 함수를 만드는 경로를 이야기하는 것이다. 
		//정보를 다루는 기술을 배우고 있는것이다. 
		// 
		
		Student s2 = new Student("김땡", 28);
		s2.setName("이름름");
		s2.setAge(24);
		//s2.name = "김땡ㄴㅁㅇㄻㄴㅇㄹ땡";
		//s2.age = 28;
		//s2.kor = 90;
		//s2.eng = 98;
		//s2.math = 70;
		System.out.println(s2);
		//System.out.println(s2.name + "님의 총점: "+ s2.total());
		//System.out.println(s2.name + "님의 평균: "+ s2.calcAvg());
		
		//System.out.println(name); 
		//어떤 값을 출력할 수 있는거야?
		
		//파라미터는 뭐여
	}


	
	
}
