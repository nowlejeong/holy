package star;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 7번 ===");
		System.out.print("출력 할 줄 수 : ");
		int lineNum = scan.nextInt();
		for(int i = 1; i <= 2*lineNum -1; i++) {
			String star = "";
			if(i < lineNum) {
				//위에서 증가하는 부분
				for(int j = 1; j<= i; j++) {
					star += "*";
					
				}
				
				
			} else {
				//아래에 감소하는 부분
				int newI = i - lineNum + 1;
				
				for(int j = 0; j<= lineNum - newI; j++) {
					star += "*";
				}
					
			}
			System.out.println(star);

			
		}
	}
}
