package OOP;

class NormalClass  {
	
	public String reverseString(String s){
	    if (s.length() == 0) 
	         return s;

	    return reverseString(s.substring(1)) + s.charAt(0);
	}
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false	
		//if u wnat to compare the value in string buffer thencompare To
		System.out.println(sb1.toString().compareTo(sb2.toString()));//0
		
		String s = new String("java");
		//reverseString(s);
		
	}
	

}
