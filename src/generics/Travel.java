package generics;

import java.util.*;

class Business {
}

class Hotel extends Business {
}

class Inn extends Hotel {
}

public class Travel {
	ArrayList<Hotel> go() {
		// insert code here
		return new ArrayList<Hotel>();
	}
}