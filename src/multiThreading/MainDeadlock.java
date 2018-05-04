package multiThreading;

public class MainDeadlock {

	public static void main(String[] args) throws InterruptedException  {
			System.out.println("Entering in the deadlock");
			Thread.currentThread().join();
			System.out.println("Statment will not forever");
		
	}

}
