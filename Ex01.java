package day04;
//int vs Integer
//배열보다 좋은 Arraylist를 배워봅시다
import java.util.ArrayList;
public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		Integer b = new Integer(6);
	//	System.out.println(b.toBinaryString(a));
//오버 레퍼가 있어요. Java에도 템플릿이라는 것이 있는데, 위에 그런 것이다. Integer();라고 하는 메소드와 같은형식으로 만든 것이다
		ArrayList<Integer> myList = new ArrayList<>(); // 템플릿 형태를 지정하게된다구??\
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5); // 쉽게 말해서 기차놀이입니다? 주소가 있는 참조형 변수이기때문에 가능한 일
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
