package basic;

class Demo	 
{
 public static void main(String[] args) {
	
//	String S1 = "Java,SQL,Selenium";
//	String[] s2= S1.split(",");
//	for (int i = 0; i < s2.length; i++) {
//		System.out.println(s2[i]);
//	}
	 
	String str= "Hello", r="";
	for (int i = str.length()-1; i >=0 ; i--) {
		r=r+str.charAt(i);
		System.out.println("Hi");
	}
	System.out.println(r);
 }
}