package chapterseven;

import java.util.*;

public class TestBadLegacy {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		//myList.add("Hello"); - this is invalid in generics
		Inserter in = new Inserter();
		TestBadLegacy bl1 = new TestBadLegacy();
		in.insert(myList); // pass List<Integer> to legacy code
		Iterator it = myList.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	
		//System.out.println("Total Value in collection " + bl1.addList(myList));
		
	}
		int addList (List list)
		{
			Iterator it1 = list.iterator();
			int total = 0;
			while (it1.hasNext()) {
			int i = ((Integer)it1.next()).intValue();
			//int x = Integer.intValue(list.get(1));
			total += i;
			}
			return total;
		}

	
}

class Inserter {
	// method with a non-generic List argument
	//void insert(List list) {
		//list.add(new Integer(42)); // adds to the incoming list
	//}
	void insert(List list) {
		list.add(new String("42")); // put a String in the list
		// passed in
		}
	
}