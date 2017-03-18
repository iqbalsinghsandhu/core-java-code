package flowcontrolchapter5;

public class FormatExceptionTestEx3 {

	public static void main (String args[])
	{
		try {
			int x = Integer.parseInt("3.00767");
			System.out.println("x is " +x);
		}
		catch (Exception e){
			System.out.println("caught ..." + e.toString());
		}
	}
}
