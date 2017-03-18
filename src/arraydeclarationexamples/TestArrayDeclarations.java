package arraydeclarationexamples;

class TestArrayDeclarations {

	public static void main(String[] args) {
		// 1 dimensional array declaration
		int[] a = new int[5]; //array of 5 ints
		// 2 dimensional array declaration
		int[][] b = new int[3][]; //3 arrays, each holding an array on ints
		b[0] = new int[3]; // first element of the array b is an array of 3 ints
		b[1] = new int[4];  // second element of the array b is an array of 4 ints
		System.out.println("array element at position 3 is " + a[2]);
		a[7] = 67; //throws runtime error
		System.out.println("array element at position 6 is " + a[5]); // throws
																		// array
																		// index
																		// out
																		// of
		System.out.println("array element at position -6 is " + a[-5]);	//same error as above															// bounds
	}

}
