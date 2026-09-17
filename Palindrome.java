public class Palindrome {

	static boolean isPalindrome(int number) {
		int original = number;
		int reversed = 0;

		while (number > 0) {
			reversed = reversed * 10 + number % 10;
			number /= 10;
		}

		return original == reversed;
	}

	public static void main(String[] args) {
		int number = 11;

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}
}
