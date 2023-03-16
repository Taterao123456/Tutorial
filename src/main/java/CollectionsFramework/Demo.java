package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/*
	 * 1)Heterogenious data -allowed 2)Insertion order-preserved(Index) 3)Duplicate
	 * elements-allowed 4)multiple nulls- null
	 */

	public static void main(String[] args) {
		// declaration
		ArrayList mylist = new ArrayList();// Heterogenious data allowed
		// ArrayList<String> mylist = new ArrayList();
		// List mylist = new ArrayList();

		// adding data element into array

		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add("Welcom");
		mylist.add(null);
		mylist.add(null);

		System.out.println(mylist.size());

		System.out.println(mylist);

		// remove vale from arraylist

		mylist.remove(3);

		System.out.println(("After removing the elements: " + mylist));
		System.out.println(mylist.size());

		// Insert a new value in the list

		mylist.add(2, "Java");

		System.out.println("After insertion" + mylist);

		System.out.println(mylist.get(3));

		mylist.clear();
		System.out.println("After clearing " + mylist);

	}

}
