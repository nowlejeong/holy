/*
 * �� ������
 * boolean �����ڷ� �ۼ��� �մϴ�! 
 * &&(and : �׸��� ) : ��� ������ True�϶�
 * ||(or : �Ǵ�) : ������ 1���� �����϶� T
 * 					��� ������ F�� �� F
 * !(not: T�� �ƴϴ� -> F, F�� �ƴϴ� ->T)
 * ^(XOR : ��Ÿ�� or)
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
