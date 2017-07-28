package test;



public class Test {

	public static void main(String[] args) {
		bubbleSort();
		selectionSort();
		insertionSort();
		
		
		
	}

	
	private static void selectionSort() {
		int [] a = {25,17,2};
		int n = a.length;
		for(int i=0;i < n-1; i++ ){
			for(int j=i+1;j<n;j++){
				if(a[i]> a[j]){
					int temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		System.out.println("Output--selection Sort-------");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

	
	private static void insertionSort() {
		int [] a = {25,17,31,13};
		int n = a.length;		
		for(int i= 1;i < n; i++ ){
			for(int j=i;j>0;j--){
				if(a[j]< a[j-1]){
					int temp =a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
			
		}
		System.out.println("Output----n -Insertion Sort----");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	
	private static void bubbleSort() {
		int [] a = {25,17,2,12};
		int n = a.length;
		System.out.println(n);
		for(int i= 0;i < n-1; i++ ){
			for(int j= 0;j<n-i-1;j++){
				if(a[j]> a[j+1]){
					int temp =a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		System.out.println("Output--Bubble Sort-------");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

}
