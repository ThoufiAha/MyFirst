package basic;

public class Second_high {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int great=0,two_great=0;
		int[] a= {12,32,100,41,23,43,21,52,74};
		for (int i = 0; i < a.length; i++) {
			if (great<a[i]) {
				two_great=great;
				great=a[i];
			}else if (two_great<a[i]) {
				two_great=a[i];
				
			}
		}
		System.out.println(great);
		System.out.println(two_great);

	}

}
