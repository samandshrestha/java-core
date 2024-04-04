package day2session1;

import java.util.Scanner;

public class D02S01c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("All subsequences of the string:");
        printSubsequences(input);
        scanner.close();
    }
    public static void printSubsequences(String str) {
        int n = str.length();
        int totalSubsequences = 1 << n;
        for (int i = 0; i < totalSubsequences; i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subsequence.append(str.charAt(j));
                }
            }
            System.out.println(subsequence);
        }
    }
}
