package star;

import java.util.Scanner;
//����� 6�� ����
public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 6�� ===");
		System.out.print("��� �� �� �� : ");
		int lineNum = scan.nextInt();
		for (int i = lineNum; i >= 1; i--) {
			String star = "";
			for(int j = 1; j<= lineNum - i; j++) {
				star +=" ";
				
			}
			for(int j = 1; j<=2 *i-1; j++) {
				star += "*";
			}
			System.out.println(star);
		}
	}
}

