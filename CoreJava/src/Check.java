public class Check {

	public static void main(String[] args) {
		int a = 10, b = 20;
		if (a == 10 & b == 21) {
//			System.out.println("1111");
		}
		if (a == 10 && b == 21) {
//			System.out.println("222");
		}
		
//	        Calendar now = Calendar.getInstance();
//	        System.out.println(now.getTimeZone());
//	        System.out.println(now.getTime());
		int n=5;
		for(int i=0;i<5;i++){
			for(int j=i;j<n;j++){
				System.out.println(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.println("*");
			}
		}

	}

}
