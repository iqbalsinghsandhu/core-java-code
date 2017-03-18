package generics;

import java.util.*;

 public class SelfTest7 {
	public static void main(String[] args) {

		Object o = new Object();
		// insert code here
		LinkedHashSet s = new LinkedHashSet();
		s.add("o");
		s.add(o);
		System.out.println(s);
	}
}