package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStrName {

	public static void main(String[] args) {
		List<String> nameList = new LinkedList<String> ();
		String[] names = {"Ann", "Bob", "Carol"};
		
		//Add to arrayList for
		for(int k=0; k<names.length; k++)
		{
			nameList.add(names[k]);
		}
		
		for(int k=0; k<names.length; k++)
		{
			nameList.add(nameList.get(k));
		}
		
		

	}

}
