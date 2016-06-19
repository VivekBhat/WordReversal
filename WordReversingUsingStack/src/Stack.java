class StackX {
	int top;
	int maxSize;
	char[] word;

	public StackX(int max) {
		maxSize = max;
		top = -1;
		word = new char[maxSize];
	}

	public void push(char s) {
		word[++top] = s;
	}

	public char pop() {
		return word[top--];
	}

	public char peek() {
		return word[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}