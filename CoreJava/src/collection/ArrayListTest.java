package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	public void listRaw(){
		List a = new ArrayList<>();
		a.add("Name");
		System.out.println("Name added sucessfully");		
		a.add(1,"Address");
		System.out.println("Address added sucessfully");	
		
		System.out.println("***********Start for loop***************");
		for (Object objectList : a) {
			System.out.println("Inside Foor loop "+ objectList);
		}
		System.out.println("***********End for loop***************");
		
		System.out.println("***********Start Of Iterator ***************");		
		Iterator<Object> itr = a.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println("Inside while " + object);
			
		}		
		System.out.println("***********End Of Iterator***************");
		
	}
	public void listwithString(){
		System.out.println("-----------------------------Inside listwithString method-------------------------------");
		List<String> arList = new ArrayList<>();
		arList.add("pin");
		arList.add("code");
		for(String info: arList){
			System.out.println("Inside for: " + info);
		}
		Iterator<String> itr = arList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------Exit from listwithString method-------------------------------");
	}
	
	public void arrayListImp(){
		ArrayList<String> al =  new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("A");
		al.add("C");
		
		
		for (String info : al) {
			System.out.println("Print Info in for  "+info);
		}
		
//		ArrayList<String> copyArr = new ArrayList<>();
//		for(String  info : al){
//			if(!info.contains("A")){
//				copyArr.add(info);
//				System.out.println("info " + info);
//			}
//		}
		
		for(int i = 0;i<al.size(); i++){
			for(int j= i+1; j<al.size(); j++){
				if(al.get(i).contains(al.get(j))){
					al.remove(j);
				}
			}
		}
		
		for (String info : al) {
			System.out.println("Print Info  After check "+info);
		}
		
//		System.out.println("al.get(0) "+ al.get(2));
//		System.out.println("al.get(0) "+ al.set(2, "F"));
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext()){
//		 System.out.println("print info "+ itr.next());
//		}
	}

	public static void main(String[] args) {		
		ArrayListTest arrayListTest = new ArrayListTest();
//		arrayListTest.listRaw();
//		arrayListTest.listwithString();
		arrayListTest.arrayListImp();
		
	}

}
