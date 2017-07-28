package funcation.overloading;

public class Test {
	
	public void m1(int a){
		System.out.println("Inside int");
	}
	public void m1(float b){
		System.out.println("Inside float");
	}
	public void m1(double d){
		System.out.println("Inside double");
	}

	public static void main(String[] args) {
		 Test t = new  Test();
		 t.m1(10);		
		 t.m1(10.5f);
		 t.m1('a');
		 t.m1(12d);

	}

}
