package class1015;

public class Optest03 {
	public static void main(String[] args) {
		int data1=10;
		System.out.println("���� ������");
		System.out.println(data1++);  // 10
		System.out.println(++data1);  // 12
		System.out.println(data1++);  // 12
		//data1=13
		System.out.println("���� ������");  
		System.out.println(--data1);  // 12
		System.out.println(data1--);  // 12
		System.out.println(data1);   // 11
		
		/*
		 *�Ʒ��� ���� ���� ���� ���� �����Ѵ�.
		 *�ִ��� �����ϰ� �ۼ��� �ؾ��Ѵ�. Ư�� ���������� �Ʒ��� ���� ����ϸ� �ȵſ�. 
		 int su = 3;
		 
		int total = ++su + ++su;
		System.out.println(total);
		*/
		
		int su = 3;
		su++; //su=su+1; ++su;
		System.out.println(su);
		
	}
}


