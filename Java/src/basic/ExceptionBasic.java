package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionBasic {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
System.out.println(3/4);
		System.out.println(4);
		
		try {
		System.out.println(3/0);
		}
		catch(ArithmeticException e) {
				System.out.println("dont divide by 0");
			}
		System.out.println(3);
	
		String s=null; 
		try {
			
		
		System.out.println(s.length());
	
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
		
	String s1 = "Java";
	try {
		System.out.println(s1.charAt(6));
	}

	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getLocalizedMessage());
	}
		
		int a[]= {1,2,3};
		try {
			System.out.println(a[5]);
	} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("array index out of bound");
			System.out.println(e.getLocalizedMessage());
		}
		
	
	List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4));
	try {
		System.out.println(li.get(7));
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		System.out.println("Finally block is executed");
	}
SetBasic.main(args);
 	
	}
}
