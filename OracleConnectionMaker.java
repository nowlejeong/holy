package day04;

public class OracleConnectionMaker implements ConnectionMaker {
	@Override
	public String makeConnection() {
		System.out.println("Oracle 연결");

		System.out.println("연결 성공");
		
		return "Success";

	}

}
