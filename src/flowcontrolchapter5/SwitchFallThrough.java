package flowcontrolchapter5;

public class SwitchFallThrough {

	public static void main(String args[]) {

		int x = 9;

		switch (x) {
		case 2:
		case 4:
		case 6:
		case 8:
		case 10: {
			System.out.println("x is an even number");
			break;
		}
		default:
			System.out.println("x is a odd number");
		}
	}
}
