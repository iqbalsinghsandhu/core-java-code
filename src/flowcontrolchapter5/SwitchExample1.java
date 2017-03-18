package flowcontrolchapter5;

public class SwitchExample1 {

	public static void main(String args[]) {
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("x is equal to 1");
			//break; //falls through until first break is encountered, or till end
		case 2:
			System.out.println("x is equal to 2");
			//break;
		case 3:
			System.out.println("x is equal to 3");
			break;
		default:
			System.out.println("Still no idea what x is");
		}
	}

}
