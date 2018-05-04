package oops;

public class CarTest  extends Vehicle {
	
	public void show(){
		System.out.println("Show in Car class");
	}

	public static void main(String[] args) {
		/*Vehicle v=new CarTest();
		v.show();
		Vehicle v1=new Vehicle();
		v1.show();*/
		//CarTest v=new Vehicle(); //type mismatch
		CarTest v1=new CarTest();
		v1.show();

	}

}
