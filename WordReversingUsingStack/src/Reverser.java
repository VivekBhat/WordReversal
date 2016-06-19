
class Reverse {
	private String input;
	private String output;

	public Reverse(String in) {
		input = in;
	}

	public String doReverse() {
		int stackSize = input.length();
		StackX stack = new StackX(stackSize);

		for (int i = 0; i < stackSize; i++) {
			char ch = input.charAt(i);
			stack.push(ch);
		}

		output = " ";

		while (!stack.isEmpty()) {
			char ch = stack.pop();
			output += ch;
		}
		return output;
	}
}
