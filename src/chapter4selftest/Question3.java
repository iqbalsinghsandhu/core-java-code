package chapter4selftest;

class Fork {
	public static void main(String[] args) {
		if (args.length == 1 | args[1].equals("test")/* throws AIOOB exception at runtime*/) {
			System.out.println("test case");
		} else {
			System.out.println("production " + args[0]);
		}
	}
}