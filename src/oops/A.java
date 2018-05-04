package oops;

public class A{
	public int x;
	public static void display(A a){
		A a1=new A();
		a1.x=20;
		a=a1;
		System.out.println(a.x);
	}
	public static void main(String[] args) {
		A a=new A();
		a.x=10;
		display(a);
System.out.println(a.x);
	}
}
