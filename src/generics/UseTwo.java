package generics;

class UseTwo<T, X> {
	T one;
	X two;

	UseTwo(T one, X two) {
		this.one = one;
		this.two = two;
	}

	T getT() {
		return one;
	}

	X getX() {
		return two;
	}

	// test it by creating it with <String, Integer>
	public static void main(String[] args) {
		UseTwo<String, Integer> twos = new UseTwo<String, Integer>("foo", 42);
		UseTwo<Integer, String> duos = new UseTwo<Integer, String>(42, "foo");
		String x = "300";
		int y = Integer.parseInt(x);
		String theT = twos.getT(); // returns a String
		int theX = twos.getX(); // returns Integer, unboxes to int
		System.out.println(theT + " " + theX);
	}
}