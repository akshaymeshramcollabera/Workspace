package listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		String [] names = {"Ann", "Bob", "Carol"};
		// Add to arrayList
		ListIterator<String> it = nameList.listIterator();
		for (int k = 0; k < names.length; k++) 
			it.add(names[k]); 
		// Display name list using an iterator
		it = (ListIterator) nameList.iterator(); //Get the iterator
		while (it.hasNext())	//Use the Iterator
			System.out.println(it.next());

	}
}
