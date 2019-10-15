//비교연산자 
//boolean 타입으로 작성을 해야한다 
//

package class1015;

public class OpTest05 {
	public static void main(String[] args) {
		int su1=10;
		int su2=10;
		boolean r1=su1>=su2;
		System.out.println(r1);
		boolean r2=su1==2;
		System.out.println(r2);
		
		System.out.println(su1>=su2); //t
		System.out.println(su1>su2);  //f
		System.out.println(su1<su2);  // f
		System.out.println(su1<=su2); // t
		System.out.println(su1==su2);  // t
		System.out.println(su1!=su2);  // f
		
	}

}
