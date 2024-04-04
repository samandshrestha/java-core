package day2session1;

import java.util.Scanner;

public class D02S01b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the number of last vowels to count:");
        int n = scanner.nextInt();
        int vowelCount = 0;
        int length = input.length();
        for (int i = length - 1; i >= 0 && n > 0; i--) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                n--;
            }
        }
        if (n == 0) {
            System.out.println("Count of last " + (n + 1) + " vowels: " + vowelCount);
        } else {
            System.out.println("Mismatch in Vowel Count");
        }
        scanner.close();
    }
}
