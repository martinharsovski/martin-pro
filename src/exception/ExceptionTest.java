package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		String string = "a5";
		
		try {
			int a = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			System.out.println("You have not entered a number");
		}
		
	}

}
