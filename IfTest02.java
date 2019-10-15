/*
점수를 입력받아서 60점이상이면 합격 그렇지 않으면 불합격


*/

package class1015;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
int score = Integer.parseInt(sc.nextLine());
String result = "";

	if(score>=60) 
		result = "합격";
	
	else
	{
		result = "불합격";
		
	}
	System.out.println("점수 : " + score);
	System.out.println("결과 : " + result);
	
	
	}
}