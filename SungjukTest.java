/*
		�̸�
		����
		����
		����
		����
		���
		���뵵
 */
package class1015;

import java.util.Scanner;

public class SungjukTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name=sc.nextLine();
		System.out.println("���� ������ �Է��ϼ���");
		int kor=Integer.parseInt(sc.nextLine()); // int�� ����� ���� ���ڸ� ���ڷ� �ٲ� ���̴�. 
		System.out.println("���� ������ �Է��ϼ���");
		int eng=Integer.parseInt(sc.nextLine()); // int�� ����� ���� ���ڸ� ���ڷ� �ٲ� ���̴�. 
		System.out.println("���� ������ �Է��ϼ���");
		int math=Integer.parseInt(sc.nextLine());
		int sum = kor + eng + math;
		float average =  (kor + eng + math)/3; // float�� ����� ���� �Ǽ��� ��Ÿ�� ���Դϴ�. 
		String ach=(average>=60)?"�հ�": "���հ�";

		System.out.println("�Է��� ������ ������ �����ϴ�.");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng );
		System.out.println("���� : " + math );
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		System.out.println("���뵵 : " + ach);
	}
}
