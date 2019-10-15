package class1015;

public class Optest03 {
	public static void main(String[] args) {
		int data1=10;
		System.out.println("증가 연산자");
		System.out.println(data1++);  // 10
		System.out.println(++data1);  // 12
		System.out.println(data1++);  // 12
		//data1=13
		System.out.println("감소 연산자");  
		System.out.println(--data1);  // 12
		System.out.println(data1--);  // 12
		System.out.println(data1);   // 11
		
		/*
		 *아래와 같은 언어는 쓰는 것을 지양한다.
		 *최대한 간결하게 작성을 해야한다. 특히 연속적으로 아래와 같이 사용하면 안돼요. 
		 int su = 3;
		 
		int total = ++su + ++su;
		System.out.println(total);
		*/
		
		int su = 3;
		su++; //su=su+1; ++su;
		System.out.println(su);
		
	}
}


