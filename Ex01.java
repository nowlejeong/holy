package day04;
//int vs Integer
//�迭���� ���� Arraylist�� ������ô�
import java.util.ArrayList;
public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		Integer b = new Integer(6);
	//	System.out.println(b.toBinaryString(a));
//���� ���۰� �־��. Java���� ���ø��̶�� ���� �ִµ�, ���� �׷� ���̴�. Integer();��� �ϴ� �޼ҵ�� ������������ ���� ���̴�
		ArrayList<Integer> myList = new ArrayList<>(); // ���ø� ���¸� �����ϰԵȴٱ�??\
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5); // ���� ���ؼ� ���������Դϴ�? �ּҰ� �ִ� ������ �����̱⶧���� ������ ��
		Integer delete = 5;
		
		myList.remove(0);
		myList.remove(delete);
		
		
	//	System.out.println(myList.get(1));
		
	//	for(int i = 0; i < myList.size();i++) {
	//		System.out.println(myList.get(i));
	//	}

		for(Integer i  : myList) {
		//	i = i + 1;
			System.out.println(i);
		//	System.out.println(myList.get(i));
		}
		
	}
}
