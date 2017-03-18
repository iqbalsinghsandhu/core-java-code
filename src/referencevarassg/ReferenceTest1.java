package referencevarassg;

import java.awt.Dimension;

class ReferenceTest1 {
	public static void main(String[] args) {
		Dimension d = new Dimension(15,10);
		ReferenceTest1 rt = new ReferenceTest1();
		System.out.println("Before modify() d.height = " + d.height);
		rt.modify(d);
		System.out.println("After modify() d.height = " + d.height);
	}

	void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("dim = " + dim.height);
	}
}
