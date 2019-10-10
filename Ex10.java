package star;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 10번 ===");
		System.out.print("출력 할 줄 수 : ");
		int lineNum = scan.nextInt();
		
		for(int i = 1; i<= lineNum *2 -1; i++) {
			String star = "";
			if(i == 1 || i == lineNum *2 - 1) {
				for(int j = 1; j<= lineNum *2 -1; j++) {
					star += "*";
				}
			}else if (i< lineNum) {
				for(int j=i; j<= lineNum; j++) {
					star +="*";
				}
				for (int j = 1; j<=2*(i-1)-1; j++) {
					star+= " ";
				}
				for(int j=i; j<= lineNum; j++) {
					star +="*";
				}
			}else{
				int newI = i - lineNum + 1;
				for(int j = 1; j<=newI; j++) {
					star += "*";
				}
				for(int j = 1; j<=(lineNum - newI)*2 -1 ; j++) {
					star += " ";
				}
				for(int j = 1; j<=newI; j++) {
					star += "*";
				}
			}
			System.out.println(star);
		}	
		
	}


}
