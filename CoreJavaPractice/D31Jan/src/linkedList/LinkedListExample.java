package linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> lst = new ArrayList();
		List<String> lst1 = new LinkedList();
		ArrayList arrayList = new ArrayList();
		String[] numbers = {"1","2","3","4"}; //can't resizable and immutable 
		lst = lst;
		List<String> lst2 = new ArrayList();
		lst2 = lst;
		
		lst1 = arrayList;
		for(String str:numbers)
		{
			System.out.println(str);
		}
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		lst.add("One");
		lst.add("Two");
		lst.add("Three");
		lst.add("Four");
		//lst.add(34343);
		Iterable it;
		Iterator iterator = lst.iterator();
		
		System.out.println("Iterating using Iterator");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Enhanced For Loop");
	}

}
