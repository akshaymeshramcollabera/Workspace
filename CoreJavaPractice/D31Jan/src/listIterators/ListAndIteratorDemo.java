package listIterators;

import java.util.ArrayList;
import java.util.List;

public class ListAndIteratorDemo {

	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add("One");
		lst.add("Two");
		lst.add("Three");
		lst.add("Three");
		for(Object obj:lst) {
			System.out.println(obj);
		}
		
		for(int i=0; i<lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}
		
		System.out.println(lst);

	}

}
