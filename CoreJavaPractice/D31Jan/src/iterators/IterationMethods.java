package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationMethods {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		String [] names = {"Ann", "Bob", "Carol"};
		// Add to arrayList
		for (int k = 0; k < names.length; k++) 
			nameList.add(names[k]); 
		// Display name list using an iterator
		Iterator<String> it = nameList.iterator(); //Get the iterator
		while (it.hasNext())	//Use the Iterator
			System.out.println(it.next());

	}

}
