import java.util.concurrent.Semaphore;

public class One {
	static String name = "oneTwo";
	static int t = 1;
	static volatile boolean flag = true;

	static class MyThread extends Thread {
		Semaphore sem;
		String threadName;

		public MyThread(Semaphore sem, String threadName) {
			this.sem = sem;
			this.threadName = threadName;
		}

		public void run() {
			try {
				while (flag) {
					sem.acquire();
					if (t == 10)
						break;
					if (threadName.equalsIgnoreCase("one")
							&& threadName.equals(name.substring(0, 3))) {
						System.out.print(0);
						name = name.substring(3);

					} else if (threadName.equalsIgnoreCase("two")
							&& name.equalsIgnoreCase("two")) {
						System.out.print(t);
						t++;
						name = "oneThree";
					} else if (threadName.equalsIgnoreCase("three")
							&& name.equalsIgnoreCase("three")) {
						System.out.print(t);
						t++;
						name = "oneTwo";
					}
					sem.release();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		MyThread one = new MyThread(sem, "one");
		MyThread two = new MyThread(sem, "two");
		MyThread three = new MyThread(sem, "three");
		one.start();
		two.start();
		three.start();
	}}