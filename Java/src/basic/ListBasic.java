package basic;

import java.util.*;

public class ListBasic {

	public static void main(String[] args) {
	

	List<Integer> li = new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(10);
	System.out.println(li.size());
	
	for (Integer integer : li) {
		System.out.println(integer);
	}
	System.out.println(li.get(0));
	
	li.forEach(System.out::println);
	System.out.println("Iterator");
	 Iterator<Integer> i = li.iterator();
	 while (i.hasNext()) {
		 System.out.println(i.next());
	 }
		 System.out.println(" list Iterator");
		 ListIterator<Integer> j = li.listIterator();
		 while (j.hasNext()) {
			 System.out.println(j.next());
		 
		
	 
	}	
		 System.out.println("previuos iterator");
		 while (j.hasPrevious()) {
			 System.out.println(j.previous());
		 
	}	
		 System.out.println("add value");
		 li.add(4,40);
		 for (Integer integer : li) {
				System.out.println(integer);
			}
		 System.out.println("remove");
		 li.remove(4);
		 for (Integer integer : li) {
				System.out.println(integer);
			}
		 li.set(2, 20);
		 System.out.println(li);
		 
		 Boolean flag = li.contains(10);
		 System.out.println(flag);
		 
		 Boolean flag1 =  li.isEmpty();
		 System.out.println(flag1);
		 
		 li.clear();
		 System.out.println(li);
		 
		 
			 List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
			 System.out.println(li1);

			 List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(40,70,23));
			 System.out.println(li2);
//			 
			 	li1.retainAll(li2);
			 System.out.println(li1);
			 
			 li2.addAll(li1);
			 System.out.println(li2);
	}
	 }
