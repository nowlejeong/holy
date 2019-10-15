// 조건식 ? 식1: 식2; 
// 이 조건식이 true 이면 식1을 계산하고, 그렇지 않으면 식2를 계산한다.

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
				
				
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
