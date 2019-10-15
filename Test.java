package class1015;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		boolean b = false;
		if ((b == true)|| (a++ ==10)) {
			System.out.println("Equal "+ a);
		}else{
			System.out.println("Not equal "+ a);
		} 
		
		/*int total = 0;
		for (int i=1; i<=3; i++) {
			for(int j=1; j<i; j++) {
				System.out.println(i +", " + j);
				
				String str1="abc";
				StringBuilder str2=new StringBuilder("abc");
				str1.concat("123");
				str2.append("123");
				
				System.out.println("str1:" + str1);
				System.out.println("str2:" + str2);
			}
		}*/
	}
}
