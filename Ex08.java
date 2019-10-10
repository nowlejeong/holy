package star;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 7번 ===");
		System.out.print("출력 할 줄 수 : ");
		int lineNum = scan.nextInt();
		for(int i = 1; i <= 2*lineNum -1; i++) {
			String star = "";
			if(i < lineNum) {
				
			
				//별 윗부분(공백
				for(int j = 1; j<=lineNum - i; j++) {
					star += " ";
					
				}
				for(int j = 1; j<= i; j++) {
					star +="*";
				}
			}else{ 
				int newI = i - lineNum +1;
				for(int j = 1; j< newI; j++) {
					star += " ";
				}
				for (int j = 0; j <= lineNum - newI; j++) {
					star += "*";
				}
				}
				System.out.println(star);
			}
		}
}
