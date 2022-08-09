package basic;

import java.util.Iterator;

public class VowelPresnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "welcome";
		int a=0,e=0,I=0,o=0,u=0;
		int count=0;
//		char[] chr= str.toCharArray();
//		for (int i = 0; i < chr.length; i++) {
//		System.out.println(chr[i]);}
//		for (int i = 0; i < str.length()-1; i++) {
//			if (chr[i]=='a' || chr[i]=='e' || chr[i]=='i' || chr[i]=='o' || chr[i]=='u') {
//				count++;
//				System.out.println(count);
//			} 
//		}
//		if(count==0)
//		System.out.println("no vowel is present");
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
//				count++;
//			}
//		}
//		if (count==0) {
//		System.out.println("no vowel");
//		}
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='A') {
				a++;
			} else if (str.charAt(i)=='e' || str.charAt(i)=='E') {
				e++;
			}else if (str.charAt(i)=='i' || str.charAt(i)=='I') {
				I++;
		}else if (str.charAt(i)=='o' || str.charAt(i)=='O') {
			o++;
		}else if (str.charAt(i)=='u' || str.charAt(i)=='U') {
			u++;
		}
		}
		System.out.println("A = "+a+" E = "+e+" I = " +I+" O ="+o+" U "+u );
	}

}
