package basic;

import java.util.*;

public class CollectionBasic {
	public static void main(String[] args) {
			
			
		Collection<Comparable> o = new ArrayList();
		o.add(123);
		
		o.add(12.3);
		o.add("the");
		o.add(true);
		o.add('#');
		 System.out.println("Enhanced For ----------");
		for (Object object : o) {
			System.out.println(object);
		}
	
		System.out.println("for each----------"); 
		o.forEach(System.out::println);
		
		
		System.out.println("Iterator--------");
		Iterator it = o.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(o.size());
		 
		
	}

}
