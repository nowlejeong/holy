/*
 * ���׿�����
 *  ��ȣ������(+,-)
 *  ��������� : ++(����������), --(���� ������)
 *  ���������� ++su1, --su1
 *  ���������� su1++, su1--
 *  ���� ������ �ͼ�������!!! 
 */


package class1015;

public class OpTest2 {
	public static void main(String[] args) {
		int su=10;
		int su2=-su;
		System.out.println(su + "," + su2);  //��ȣ�� �ٲ�� �� ��������� �ƴմϴ�~ 
		
		int x;
		int y;
		int z;
		int a;
		
		x = 10;
		y = x++;
		z = x++;
		a = x++;
		
		
		/* y=++x;
		 *   x=x+1    // x = 11
		 *   y=x / y=11
		 * 
		 * 
		 * y=x++;
		 * 	y=x;   //y=10
		 *  x=x+1;   // x=11
		 *  
		 */
		
		
		System.out.println(x+ "," + y + "," + z);		
	}
}
