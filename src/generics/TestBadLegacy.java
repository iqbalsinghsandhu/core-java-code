package generics;

import java.util.*;

public class TestBadLegacy {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList); // pass List<Integer> to legacy code
		Iterator<Integer> it = myList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

class Inserter {
	void insert(ArrayList<Integer> list) { // ArrayList<Integer> wont work here
		//list.add(new String("42")); // put a String in the list
		//list.add(new TestBadLegacy());
		list.add(999);
		// Iterator it = list.iterator();
	}

}