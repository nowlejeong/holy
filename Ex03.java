package day04;

public class Ex03 {
	public static void main(String[] args) {
		//오라클의 데이터베이스로 연결
		//ConnectionMaker m = new OracleConnectionMaker();
		//m.makeConnection();
		
		//아래는 SQL의 데이터베이스로 연결		
		ConnectionMaker m = new MySqlConnectionMaker();
		m.makeConnection();
	}

}
