package chapterseven;

import java.util.*;

class TestSort1 {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");		
		System.out.println("unsorted " + stuff);
		stuff.remove(2);
		Collections.sort(stuff); // #2
		System.out.println("sorted " + stuff);
	}
}