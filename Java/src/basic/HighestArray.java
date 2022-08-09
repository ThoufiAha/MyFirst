package basic;

import java.util.Iterator;

public class HighestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int great=0;
			int[] a= {12,32,41,23,43,21};
			for (int i = 0; i < a.length; i++) {
				if (great<a[i]) {
					great=a[i];
				}
			
			}
			System.out.println(great);
	}

}
