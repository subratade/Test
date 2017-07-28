package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListWorks {
	ArrayList<String> al = new ArrayList<>();
	public void addValueList() {
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("A");
		
		System.out.println("List contains ");
		System.out.println(al);
//		for (String addedObject : al) {
//			System.out.print(" "+addedObject);
//		}
	}
	
	public void removeDuplicate(){
		for(int i=0; i<= al.size(); i++){
			for(int j=i+1; j<al.size();j++){
				if(al.get(i).contains(al.get(j))){
					al.remove(j);
				}
			}
		}
		System.out.println(" After duplicate remove list contains ");
		System.out.println(al);
//		for (String addedObject : al) {
//			System.out.println(addedObject);
//		}
	}
	public void removeDuplicateWithSet(){
//		Set<String> hs =  new HashSet<>(al);
		Set<String> hs =  new LinkedHashSet<>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		System.out.println("After duplicate remove list contains ");
		System.out.println(al);
//		for (String addedObject : al) {
//			System.out.println(addedObject);
//		}
	}

	public static void main(String[] args) {
		ArrayListWorks arrayListWorks = new ArrayListWorks();
		arrayListWorks.addValueList();
//		arrayListWorks.removeDuplicate();
		arrayListWorks.removeDuplicateWithSet();
	}

}
