package day2session1;

import java.util.Scanner;

public class D02S01i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        String replacedString = replaceSpaces(input);
        System.out.println("Output:");
        System.out.println(replacedString);
        scanner.close();
    }
    public static String replaceSpaces(String input) {
        return input.replace(" ", "%20");
    }
}
