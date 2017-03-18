package referencevarassg;

public class Foo1 {

	static int size = 7;
	static void changeIt(int size){
		size = size + 200;
		System.out.println("size in changeIt is : "+size);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo1 f = new Foo1();
		System.out.println("size is : "+size);
		changeIt(size);
		System.out.println("size after changeIt is : "+size);
	}

}
