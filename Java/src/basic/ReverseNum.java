package basic;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=124,rem=0,a=0;
			while (num>0) {
				rem=num%10;
				num=num/10;
				a=a*10+rem;
				
			}System.out.println(a);
	}

}
