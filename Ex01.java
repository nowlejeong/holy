package star;

import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 4�� ===");
		System.out.print("��� �� �� ��");
		int lineNum = scan.nextInt();
		for (int i = 1; i < lineNum; i++) {
			String star = "";
			for (int j = 1; j<=i -1; j++) {
				star += " ";
				
			}
			
			
			for(int j = 0; j <= lineNum -i; j++)
				star += "*";
		}
		System.out.println(star);
		
		
		//			int num = scan.nextInt();

//		System.out.println("===���� ����===");

	}

}
