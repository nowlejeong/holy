package day04;

public class Ex03 {
	public static void main(String[] args) {
		//����Ŭ�� �����ͺ��̽��� ����
		//ConnectionMaker m = new OracleConnectionMaker();
		//m.makeConnection();
		
		//�Ʒ��� SQL�� �����ͺ��̽��� ����		
		ConnectionMaker m = new MySqlConnectionMaker();
		m.makeConnection();
	}

}
