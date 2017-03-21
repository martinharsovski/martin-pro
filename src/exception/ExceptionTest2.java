package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		Integer i = null;
		
		try {
			i++;
		} catch (NullPointerException e) {
		File file = new File("C:\\Users\\Martin\\Desktop\\courses\\input.txt");
		try(PrintWriter printWriter = new PrintWriter(file)){
		e.printStackTrace(printWriter);
		
		}}

	}

}
