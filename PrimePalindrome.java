import java.util.Scanner;

public class PrimePalindrome {

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number) && isPalindrome(number)) {
            System.out.println(number + " is a prime palindrome.");
        } else {
            System.out.println(number + " is not a prime palindrome.");
        }

        scanner.close();
    }
}