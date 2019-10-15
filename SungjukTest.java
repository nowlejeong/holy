/*
		이름
		국어
		영어
		수학
		총점
		평균
		성취도
 */
package class1015;

import java.util.Scanner;

public class SungjukTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		System.out.println("국어 점수를 입력하세요");
		int kor=Integer.parseInt(sc.nextLine()); // int를 사용한 것은 글자를 숫자로 바꾼 것이다. 
		System.out.println("영어 점수를 입력하세요");
		int eng=Integer.parseInt(sc.nextLine()); // int를 사용한 것은 글자를 숫자로 바꾼 것이다. 
		System.out.println("수학 점수를 입력하세요");
		int math=Integer.parseInt(sc.nextLine());
		int sum = kor + eng + math;
		float average =  (kor + eng + math)/3; // float을 사용한 것은 실수를 나타낸 것입니다. 
		String ach=(average>=60)?"합격": "불합격";

		System.out.println("입렵한 내용은 다음과 같습니다.");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng );
		System.out.println("수학 : " + math );
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("성취도 : " + ach);
	}
}
