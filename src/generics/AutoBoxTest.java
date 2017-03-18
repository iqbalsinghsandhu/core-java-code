package generics;

import java.util.*;

public class AutoBoxTest {

	public static void main(String args[]) {
		/* Pre Java 5 style */
		List l = new ArrayList();
		l.add(1);
		int m = (Integer) l.get(0);
		// m = (Integer)l.get(1); //errors as value is not initialized
		System.out.println(m);

		/* Java 5 style */

		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		m = l2.get(0);
		System.out.println(m);

	}

}
