package generics;

import java.util.*;

public class CreateAnArrayList {

	public <T> void addListEntry(T l) {
		List<T> l2 = new ArrayList<T>();
		l2.add(l);
	}

}
