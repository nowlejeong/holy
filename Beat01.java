//비트연산에 대해서

package class1015;

public class Beat01 {
	public static void main(String[] args) {
		int su1=5;
		int su2=7;
		System.out.println(su1&su2);
		System.out.println(su1|su2);
		System.out.println(~su1); // 2의 보수에 대한 설명입니다. 
		
		int su=3; 
		int result=su>>1;
		int result2=su<<3;
		System.out.println(result);
		System.out.println(result2);
		
	}
}


/* 512 256 128 64 32 16 8 4 2 1
72 = 1001000(2) 110(8) 48(16)
64 = 1000000(2) 100(8) 4(16)
17 = 10001(2) 21(8) 11(16) 
21 = 10101(2) 25(8) 15(16)
1004 = 1111101100    1754(8) 3EC(16)
8진수는 3자리씩 묶어서 72를 110(8)로 만들수 있다
16진수는 4개씩 묶어서 72를 48(16)이라고 할 수 있다. 
https://ko.wikihow.com/2진수를-16진수로-바꾸는-법
위의 링크에서 배울 수 있는부분이니, 참고하세요!

 0101
 0111 &
 0101
 
 0101
 0111|
 0111
 
 0101
 0111~
 
 0011
 1100
 
 
*/