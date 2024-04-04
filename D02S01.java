package day2session1;

import java.util.Scanner;

public class D02S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Length of the string: " + input.length());
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome.");
        }

        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
