package class1015;

public class IfTest03 {
	public static void main(String[] args) {
		int kor=10, eng=5;
		if(kor>=10) {
			if(eng>=10)
				System.out.println("kor, eng 10점 이상!");
			else
				System.out.println("kor 10이상, eng 10 미만!");

		}
		else
		{
			if(eng>=10)
				System.out.println("kor 10미만, eng 10점 이상!");
			else
				System.out.println("kor, eng 10 미만!");

		}
	}
}

/*
 * 이렇게 복잡한데, 
 * 그것을 해결할 수 있는 방법에 대해서 조금 뒤에 알아보자. 
 * 
 * */
 */