// ���ǽ� ? ��1: ��2; 
// �� ���ǽ��� true �̸� ��1�� ����ϰ�, �׷��� ������ ��2�� ����Ѵ�.

package class1015;

public class OpTest09 {
	public static void main(String[] args) {
/*		int su = 10;
		String result=(su>5);
			System.out.println(result);*/
		
		int a = 7, b=5, c=8;
		int min, max;
		
		max=(a>=b)? a: b;
		max=(max>=c)? max: c;
		
		
		min=(a<=b)? a: b;
		min=(min<=c)? min: c;
		
//		String result = (a>b)?
//				System.out.println(result);
//		
				
				
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
	}
}
