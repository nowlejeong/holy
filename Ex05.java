package star;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 5�� ===");
		System.out.print("��� �� �� �� : ");
		int lineNum = scan.nextInt();
		for (int i = 1; i < lineNum; i++) {
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

