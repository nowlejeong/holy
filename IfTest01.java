/*조건문
	if문
		(조건)
			처리문1;  곧 true일때 하나의 처리문을 해결한다
	if(조건문)
	{
		처리문1;      곧 중괄호안에 묶인 처리문을 모두 처리한다 
		처리문2;	
	}
	
	if(조건문)
	{
		처리문// true일때
	}
	else
	{
	나머지 들은... false일때 문장들..
	}
*/
package class1015;

public class IfTest01 {
	public static void main(String[] args) {
		int kor;
		kor=40;
		if(kor>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
			System.out.println("좀더 열심히");
		}
	}
}
