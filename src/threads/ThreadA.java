package threads;

class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
				// b.sleep(5000);
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;

	public void run() {
		try {
			synchronized (this) {
				for (int i = 0; i < 20; i++) {
					System.out.println("Sleeping at value " + i + " for a sec");
					sleep(1000);
					total += i;
				}
				notify();
			}
		} catch (InterruptedException e) {
		}

	}
}