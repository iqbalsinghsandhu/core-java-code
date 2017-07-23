package selftests_chap2;

class Building {
	Building() {
		System.out.print("b ");
	}

	Building(String name) {
		this();
		System.out.print("bn " + name);
	}
}

public class House extends Building {
	House() {
		System.out.print("h ");
	}

	House(String name) {
		this(); // Executes the default constructor of the House class
		System.out.print("hn " + name);
	}

	public static void main(String[] args) {
		new House("x ");
	}
}