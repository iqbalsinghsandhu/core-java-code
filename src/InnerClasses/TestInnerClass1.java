package InnerClasses;

public class TestInnerClass1 {

	public static void main(String args[]) {
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}

}
