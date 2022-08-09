package basic;

public class SingleReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str="infosys";
		char[] chr = str.toCharArray();
		for (int i = chr.length-1; i>=0; i--) {
			System.out.print(chr[i]);
		}System.out.println();
		StringBuilder str1= new StringBuilder("Welcome to java");
		System.out.println(str1.reverse());
	String rev="";
	System.out.println(str.length());
		for (int i = str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
