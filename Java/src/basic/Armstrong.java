package basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153, sumofnum=0,temp,a;
		temp=num;
		while(num>0) {
			a= num%10;
			num=num/10;
			sumofnum=sumofnum+(a*a*a);
		}
		if(sumofnum==temp) {
			System.out.println("armstrong numer");
		}
		else {
			System.out.println("not ");
		}
	}

}
