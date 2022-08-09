package basic;

import java.util.*;
import java.util.Map.Entry;

public class MapBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(10, "HI");
		m.put(20, "bye");
		m.put(30, "hello");
		System.out.println(m.get(10));
		Set<Integer> s=  m.keySet();
		System.out.println("ENhanced for");
		for (Integer integer : s) {
			System.out.println(integer);
		}
		System.out.println("iterator");
		Iterator<Integer> k = s.iterator();
		while(k.hasNext())
			System.out.println(k.next());
	
		
		Collection<String> v = m.values();
		System.out.println("value for each iterator");
		for (String string : v) {
			System.out.println(string);
		}
		
		Set<Entry<Integer,String>> e= m.entrySet();
		System.out.println("enhanced for");
		for (Entry<Integer, String> entry : e) {
			System.out.println(entry);
		}
		System.out.println("for each");
		e.forEach(System.out::println);
		
		System.out.println("iterator");
		Iterator<Entry<Integer,String>> in= e.iterator();
		
		while(in.hasNext())
		System.out.println( in.next());

		
		System.out.println("using entryset to get only value");
		System.out.println("enhanced for");
		for (Entry<Integer, String> entry : e) {
			System.out.println(entry.getValue());
		}
		System.out.println("using entryset to get only key");
		System.out.println("enhanced for");
		for (Entry<Integer, String> entry : e) {
			System.out.println(entry.getKey());
		}
		
		System.out.println("enhanced for");
		for (Entry<Integer, String> entry : e) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
	}

	}
} 
