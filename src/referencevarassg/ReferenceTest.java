package referencevarassg;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension a = new Dimension(5, 10);
		System.out.println("a.height " + a.height + " a.width " + a.width);
		Dimension b = a;
		b.height = 30;
		System.out.println("a.height " + a.height + " b.height " + b.height);

	}

}
