package string;

public class StringAdd {

	public static void main(String[] args) {
		String sbc = new String();
		sbc="Subrata";
		System.out.println("1========"+sbc);
		
		String string = new String(sbc);
		
		if(string == sbc){
			System.out.println("IN the condition == ");
		}
		if(string.equals(sbc)){
			System.out.println("IN the condition equals");
		}
		
		string="De";		
		System.out.println("2+++++++++"+string);
		
		
		String s="javatpoint";  
		System.out.println("3+++++++"+s);

	}

}
