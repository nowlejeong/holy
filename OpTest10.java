/*복합 여산에 대해서 
 * 아래와 같은 연산 순서를 가지게됩니다. 
 */

package class1015;

public class OpTest10 {
	public static void main(String[] args) {
/*		int a = 10;
		int b = 3;
		int c = 5;
		int al;
		al=a*=b+c;
				System.out.println(al);
*/	
	int su1=10, su2=3, su3=5;
	su1*=su2+su3;
	System.out.println(su1);
	
	/*여기서 상기 기록처럼 복합 연산 시에 오른쪽의 연산을 맞치고 넘어가게 된다.
	 * */
	
	}
}
