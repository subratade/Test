package test.core.sude;

abstract public  class Test {
	
	private int value;
	
	abstract void m1();

	public int getValue() {
		//validation
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

//	public static void main(String[] args) {
//		
//	}

}
