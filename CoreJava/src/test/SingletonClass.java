package test;

public class SingletonClass {
	private static SingletonClass objSing = null;
	
	public static SingletonClass getInstance(){
		if(objSing == null){
			objSing = new SingletonClass();
		}
		return objSing;
	}

}
