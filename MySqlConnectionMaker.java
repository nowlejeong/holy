package day04;
//interface�� ����� implements��� ������ �մϴ�. 
//ins
public class MySqlConnectionMaker implements ConnectionMaker { //�����Ǹ� �����༭ �������� ����//
	
	@Override
	public String makeConnection() {
		System.out.println("mySQl ����");

		System.out.println("���� ����");
		
		return "Success";

	}

}
