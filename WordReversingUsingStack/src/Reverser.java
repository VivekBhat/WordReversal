import java.util.Scanner;

class Reverser {
	String input;
	String output;

	public Reverser(String in) {
		input = in;
	}

	public String doRev() {
		int stackSize = input.length();
		Stack theStack = new Stack(stackSize);

		Scanner in = new Scanner(System.in);

		System.out.println("Enter word");
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		output = " ";
		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			output = output + ch;
		}
		return output;
	}
}
