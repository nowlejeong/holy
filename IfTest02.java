/*
������ �Է¹޾Ƽ� 60���̻��̸� �հ� �׷��� ������ ���հ�


*/

package class1015;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
int score = Integer.parseInt(sc.nextLine());
String result = "";

	if(score>=60) 
		result = "�հ�";
	
	else
	{
		result = "���հ�";
		
	}
	System.out.println("���� : " + score);
	System.out.println("��� : " + result);
	
	
	}
}