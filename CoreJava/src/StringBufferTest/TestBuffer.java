package StringBufferTest;

public class TestBuffer {

	public void createBufferObject(){
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Defautl size-----"+sb.capacity());
		
		StringBuffer sb2 = new StringBuffer("java");
		System.out.println("With String size-----"+sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println("Initial capacity  "+ sb3.capacity());	
		
	}
	
	public void appendTest(){
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		System.out.println("=====sb1===="+sb1);
		System.out.println("=====sb2===="+sb2);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().compareTo(sb2.toString()));		
	}
	

	public static void main(String[] args) {
		TestBuffer testBuffer = new TestBuffer();
		testBuffer.createBufferObject();
		testBuffer.appendTest();
	}

}
