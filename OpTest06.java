/*
 * 논리 연산자
 * boolean 연산자로 작성을 합니다! 
 * &&(and : 그리고 ) : 모든 조건이 True일때
 * ||(or : 또는) : 조건중 1개라도 만족일때 T
 * 					모든 조건이 F일 때 F
 * !(not: T가 아니다 -> F, F가 아니다 ->T)
 * ^(XOR : 베타적 or)
 *	x	y	F(x^y)
 *	t	t	F 
 *  t	f	T    
 * 	f	t	T
 * 	f	f	F
 */

package class1015;

public class OpTest06 {
	public static void main(String[] args) {
		boolean r1 = true;
		boolean r2 = false;
		
		boolean result1=r1&&r2;
		boolean result2=r1||r2;
		boolean result3=!r1;
		boolean result4=r1^r2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("--------");
		int su1=60;
		int su2=80;
		
		boolean re1=su1>=70&& su2>=70; //fasle
		boolean re2=su1!=70|| su2>=70; //true
		boolean re3=!(su1>=90);   		//true
		boolean re4=su1!=70 ^ su2==70;	//true
		System.out.println(re1);
		System.out.println(re2);
		System.out.println(re3);
		System.out.println(re4);
		
	
	}
}
