package collection;

import java.util.Arrays;

public class StringProgram {

	public static void main(String[] args) {
		//StringConcat();
		//StringChatAt();
		//stringToChar();
		//stringSort();
		//stringCompareExample();
		stringReverse();
		
		
		

	}

	private static void stringReverse() {
		String s= "subrata";		
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println("reverse String====  "+  reverse);
		StringBuffer sb = new StringBuffer();
		
	}

	private static void stringCompareExample() {
		String s = "subrata";
		String s1 = "subrata";
		System.out.println("1st==="+ s.compareTo(s1));
		System.out.println("2nd==="+s.compareToIgnoreCase(s1));
		System.out.println("3nd == check"+ s == s1);
		System.out.println("3nd .equals==="+ s.equals(s1));
		boolean blnFound = s.contains(s1);
        System.out.println("String contains another string? : " + blnFound);
		
	}

	private static void stringSort() {
		String[] strNames = new String[]{"John", "alex", 
				"Chris", "williams", "Mark", "Bob"};
		 Arrays.sort(strNames);
		 for (String name : strNames) {
			System.out.println("===="+name);
		}
		
	}

	private static void stringToChar() {
		String s = new String("subrata");
		char [] charArray = null;
		charArray = s.toCharArray();
		for (char c : charArray) {
			System.out.println("-------"+c);
		}
		
	}

	private static void StringChatAt() {
		String s = new String("subrata");
		System.out.println("s.charAt(3)======"+s.charAt(3));
		System.out.println("s.length()-------"+s.length());
		System.out.println("s.indexOf()-------"+s.indexOf("a"));
		System.out.println("s.lastIndexOf()-------"+s.lastIndexOf("a"));	
		System.out.println("=========="+s.split("a", 2));
	}
	
	
	

	private static void StringConcat() {
		System.out.println("--------String Concat Start------------");
		String s = new String("Subrata");
		String s1="De";		
		System.out.println("1St string s "+ s);
		System.out.println("2nd string s1 "+ s1);
		s.concat(s1);
		System.out.println("Predefine Method concat "+ s);
		//s+s1;
		//System.out.println("concat string s1 +s "+ s);
		s = s+s1;
		System.out.println("reassign s "+ s);
		System.out.println("--------String Concat End------------");
	}

}
