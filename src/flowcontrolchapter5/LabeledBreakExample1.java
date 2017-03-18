package flowcontrolchapter5;

public class LabeledBreakExample1 {

	public static void main(String args[]) {
		boolean isTrue = true;
		outer: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				System.out.println("Hello");
				break outer;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop
		System.out.println("Good-Bye");

	}
}
