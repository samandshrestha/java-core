package day2session1;

import java.util.Scanner;

public class D02S01f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scanner.nextLine();
        int length = Length(s);
        System.out.println(length);
        scanner.close();
    }
    public static int Length(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 0; i--) {
           if (s.substring(0, i).equals(s.substring(n - i, n))) {
                return i;
            }
        }
        return 0; 
    }
}
