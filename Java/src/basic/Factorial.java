package basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8,sum=1;
		for (int i = num; i > 0; i--) {
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
