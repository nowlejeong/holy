package day04;
//interface의 상속은 implements라는 예약어로 합니다. 
//ins
public class MySqlConnectionMaker implements ConnectionMaker { //재정의를 안해줘서 빨간줄이 간다//
	
	@Override
	public String makeConnection() {
		System.out.println("mySQl 연결");

		System.out.println("연결 성공");
		
		return "Success";

	}

}
