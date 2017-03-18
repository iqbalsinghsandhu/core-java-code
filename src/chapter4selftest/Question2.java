package chapter4selftest;

class Comp2 {
	public static void main(String[] args) {
		float f1 = 2.3f;
		float[][] f2 = { { 42.0f }, { 1.7f, 2.3f }, { 2.6f, 2.7f } };
		float[] f3 = { 2.7f };
		Long x = 42L;
		// insert code here
		// if(f1 == f2) -- 1 dimensional float array cannot be compared against
		// a 2 dim one
		// if (f1 == f2[2][1]) // returns false since f1 = 2.3f and f2[2][1] is
		// 2.6f
		System.out.println("x = " + x + " f2[0][0] = " + f2[0][0]);
		if (x == f2[0][0]) // returns false since x is 42 and f2[0][0] is 42.0f
			// if(f1 == f2[1,1]) //this is illegal
			if (f3 == f2[2]) // this is not true
				System.out.println("true");
	}
}

// if(f1 == f2)
// if(f1 == f2[2][1])
// if(x == f2[0][0])
// if(f1 == f2[1,1])
// if(f3 == f2[2])