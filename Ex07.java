package star;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 7�� ===");
		System.out.print("��� �� �� �� : ");
		int lineNum = scan.nextInt();
		for(int i = 1; i <= 2*lineNum -1; i++) {
			String star = "";
			if(i < lineNum) {
				//������ �����ϴ� �κ�
				for(int j = 1; j<= i; j++) {
					star += "*";
					
				}
				
				
			} else {
				//�Ʒ��� �����ϴ� �κ�
				int newI = i - lineNum + 1;
				
				for(int j = 0; j<= lineNum - newI; j++) {
					star += "*";
				}
					
			}
			System.out.println(star);

			
		}
	}
}
