package funcation.overriding;

public class TestABC {

	public static void main(String[] args) {
		
//		Calling  Class A 
		A a = new A();
		a.m1(1);
//
		A a1 = new C();
		a1.m1(0);
		
		C c = new C();
		c.m1(10);

	}

}
