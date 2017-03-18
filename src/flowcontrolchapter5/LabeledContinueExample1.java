package flowcontrolchapter5;

public class LabeledContinueExample1 {

	public static void main(String args[]) {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				// System.out.println("Hello");
				continue outer;
			} // end of inner loop
				// System.out.println("outer"); // Never prints
		}
		// System.out.println("Good-Bye");

		int x = 10;
		outer1: while (x <= 21) {
			if (x++ <= 16) {
				System.out.println("Another Year");
				continue outer1;
			} else {
				System.out.println("Get your license");
				break;
			}
		}

	}

}
