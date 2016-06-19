class Stack {

	private int maxSize;
	private char[] word;
	private int top;

	public Stack(int max) {
		maxSize = max;
		word = new char[maxSize];
		top = -1;
	}

	public void push(char insert) {
		word[++top] = insert;
	}

	public char pop() {
		return word[top--];
	}

	public char peek() {
		return word[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
