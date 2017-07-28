public class ExceptionTest {

	public static void main(String[] args) {
//		exitTest();
		returnTest();

	}

	private static void exitTest() {
		try {
			System.out.printf("Inside try", +10 / 0);
		} catch (Exception e) {
			System.out.println("Inside catch");
			
			System.exit(0);
			/*
			 * Zero => Everything Okay
			 * 			 * 
			 * Positive => Something I expected could potentially go wrong went
			 * wrong (bad command-line, can't find file, could not connect to
			 * server)
			 * 
			 * Negative => Something I didn't expect at all went wrong (system
			 * error - unanticipated exception - externally forced termination
			 * e.g. kill -9)
			 */

		}finally{
			System.out.println("Inside finally");
		}
	}
	private static void returnTest() {
		try {
			System.out.printf("Inside try", +10 / 0);			
		} catch (Exception e) {
			return;
		}finally{
			System.out.println("Inside finally");
		}
	}

}
