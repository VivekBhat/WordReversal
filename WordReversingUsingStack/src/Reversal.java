import java.util.Scanner;

public class Reversal {
	public static void main(String[] args) {
		String input, output, checkString;
		Boolean check = true;

		Scanner in = new Scanner(System.in);

		while (check) {
			System.out.println(" Enter a String: ");
			input = in.nextLine();
			Reverse reverseObject = new Reverse(input);
			output = reverseObject.doReverse();

			System.out.println(" Reversed String is: " + output);
			Boolean check2 = true;
			while (check2) {
				System.out.println(" Want another one Y/N: ");

				checkString = in.nextLine();
				switch (checkString) {
				case "y":
				case "Y":
					check = true;
					check2 = false;
					break;
				case "n":
				case "N":
					check = false;
					check2 = false;
					System.out.println("BYE ");
					break;
				default:
					System.out.println("Invalid Input ");
				}
			}
		}
	}
}
