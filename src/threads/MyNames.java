package threads;

class NameRunnable1 implements Runnable {
	public void run() {
		for (int x = 1; x <= 100; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
		}
	}
}

public class MyNames {
	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable1 nr = new NameRunnable1();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
		//one.start();
	}
}