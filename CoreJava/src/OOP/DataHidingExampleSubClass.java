package OOP;


class DataHidingExampleSubClass extends DataHidingExample {

	public static void main(String[] args) {

		DataHidingExample dataHidingExample = new DataHidingExample();
		dataHidingExample.setName("Subrata");
		System.out.println("Name ==: " + dataHidingExample.getName());
	}

}
