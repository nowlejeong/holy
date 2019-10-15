/*
 * 단항연산자
 *  부호연산자(+,-)
 *  증감연산사 : ++(증가연산자), --(감소 연산자)
 *  전위연산자 ++su1, --su1
 *  후위연산자 su1++, su1--
 *  증감 연산자 익숙해지기!!! 
 */


package class1015;

public class OpTest2 {
	public static void main(String[] args) {
		int su=10;
		int su2=-su;
		System.out.println(su + "," + su2);  //부호가 바뀌는 것 산술연산이 아닙니다~ 
		
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
