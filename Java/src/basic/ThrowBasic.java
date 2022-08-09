package basic;

public class ThrowBasic {
		 static int abc=12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		abc= 13;
		System.out.println(abc);
		syso();
		System.out.println(10/2);
	}
	private static void syso() {
		// TODO Auto-generated method stub
	System.out.println(abc);
	}
}
