import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		System.out.println("Enter data which you want to convert ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		boolean flag = true;

		for (int i = 0; i < english.length; i++) {
			if (str.charAt(0) == english[i]) {
				flag = false;
				System.out.println("Equalent morse code is " + morse[i]);
			} // if
			else if (str.equals(morse[i])) {
				flag = false;
				System.out.println("Equalent English letter is " + english[i]);
			} // if
		} // for

		if (flag) {
			System.out.println("You entered wrong input.");
		} // if
	}// main

}
