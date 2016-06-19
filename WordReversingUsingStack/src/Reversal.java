import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversal {

	public static void main(String[] args) throws IOException {
		String input, output;
		while (true) {
			System.out.println("Enter String: ");
			input = getString();
			if (input.equals(" ")) // quit if [Enter]
				break;
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev(); // use it
			System.out.println("Reversed: " + output);
		}
	}

	public static String getString() throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(isr);
		String s = buf.readLine();
		return s;
	}
}
