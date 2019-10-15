package class1015;

public class OpTest {
	public static void main(String[] args) {
		/*단항연산자 부호연산자, 증감연산자
		 * 이항연산자
		 * 		산술연산자 
		 * 		비교연산자 >(크다), >=(크거나 같다), <(작다). <=(작거나 같다) , ==(같다), !=(같지 않다)
		 * 		논리연산자 &&(and 그리고) ||(or 또는) !(not ~가아님!) ^(배타적 or)
		 * 		복합대입연산자 a+=2 -> a=a+2 / a-=2 -> a=a-2 a&&=b -> a=a&&b
		 * 삼항연산자 
		 * 연결 연산자 숫자 + 문자, 문자 + 문자, 문자 + 숫자
		 */
		
		
		System.out.println(10+20);   // 더하기(산술연산)
		System.out.println("aaa"+"bbb");    //연결연산자
		System.out.println(10+20+"입니다");   // 더하기(산술연산)이 먼저 이루어진다 
		System.out.println("aaa"+"bbb"+1+2);    //연결연산자로 이루어진다
		System.out.println("aaa"+"bbb"+(1+2));    //괄호()를 사용해서 해결이 가능하다
		/* 연결연산자
		 *  숫자 + 문자
		 * 	문자 + 문자
		 * 	문자 + 숫자
		 */
	}//메인 메소드
} // Op Test class
