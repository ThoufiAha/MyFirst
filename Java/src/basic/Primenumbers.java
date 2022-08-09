package basic;

public class Primenumbers {
	public static void main(String[] args) {
		
		int num=4,count=0;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				count++;
			}			
		}
		if(count>0)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}
}
