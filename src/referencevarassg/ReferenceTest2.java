package referencevarassg;

class Foo {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ReferenceTest2 {

	void bar() {
		Foo f = new Foo();
		doStuff(f);
	}

	void doStuff(Foo g) {
		g.setName("X");
		g = new Foo();
	}

}
