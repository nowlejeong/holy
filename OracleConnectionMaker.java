package day04;

public class OracleConnectionMaker implements ConnectionMaker {
	@Override
	public String makeConnection() {
		System.out.println("Oracle ����");

		System.out.println("���� ����");
		
		return "Success";

	}

}
