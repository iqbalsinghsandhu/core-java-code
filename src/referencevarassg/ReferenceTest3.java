package referencevarassg;

public class ReferenceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		ReferenceTest3 rt3 = new ReferenceTest3();
		System.out.println("Before modify a is : " + a);
		rt3.modify(a);
		System.out.println("After modify a is : " + a);

	}

	void modify(int number) {
		number += 2;
		System.out.println("number is : " + number);
	}

}
