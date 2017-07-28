package string;

public class ConcatAString {

	public static void main(String[] args) {
		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);
		
		
		String s11="Sachin";  
		s11=s11.concat(" Tendulkar");  
		System.out.println(s11);  // will print Sachin because strings are immutable
								// objects

	   System.out.println("=================================================================");
	   String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   String s4="Saurav";  
	   System.out.println(s1.equals(s2));//true  
	   System.out.println(s1.equals(s3));//true  
	   System.out.println(s1.equals(s4));//false  
	   System.out.println("=================================================================");
	   
	   String s14="Sachin";  
	   String s24="SACHIN";  
	  
	   System.out.println(s14.equals(s24));//false  
	   System.out.println(s14.equalsIgnoreCase(s3));//true  
		
	}

}
