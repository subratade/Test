package string;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		
		String s= new String("abca");
		for(int i= 0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				if(s.charAt(i) != s.charAt(j)){
					System.out.println(s.charAt(i));
					
				}
			}
		}
		//System.out.println("output : "+output);
	}

}
