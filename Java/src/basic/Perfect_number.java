package basic;

public class Perfect_number {
	public static void main(String[] args) {
		
	
	int num=28,sumofnum=0;
	
	for(int i = 1 ; i < num ; i++) {
		if(num % i == 0)  {
			System.out.println(i);
			sumofnum = sumofnum + i;
		}
		
	}
	System.out.println(sumofnum+"="+num);
	}
}
