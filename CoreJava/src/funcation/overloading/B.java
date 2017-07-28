package funcation.overloading;

public class B extends A {
	
	public void m3(int a){
		System.out.println("Inside Integer of B class " + a);
	}
	public void m3(double a){
		System.out.println("Inside Double of B class " + a);
	}
}
