package flowcontrolchapter5;

public class ReverseStringTest {

	public static void main(String args[]) throws Exception {
		String s = "JAVA";
		String reverseStr;
		try {
			//if (s.length() == 0) { throw Exception; }
			reverseStr = reverseIt(s);
			System.out.println("Reversed String is " + reverseStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static String reverseIt(String ps) {
		String reverseStr = "";
		try {
			for (int i = ps.length() -1 ; i >= 0; --i) {

				reverseStr += ps.charAt(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in reverseInt !");
		}
		return reverseStr;

	}

}
