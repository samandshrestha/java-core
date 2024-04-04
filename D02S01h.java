package day2session1;

import java.util.*;
public class D02S01h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        boolean canSplit = canSplitIntoFourDistinctStrings(input);
        if (canSplit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
    public static boolean canSplitIntoFourDistinctStrings(String input) {
        int n = input.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String substring1 = input.substring(0, i);
                    String substring2 = input.substring(i, j);
                    String substring3 = input.substring(j, k);
                    String substring4 = input.substring(k);
                    if (!substring1.equals(substring2) && !substring1.equals(substring3) &&
                        !substring1.equals(substring4) && !substring2.equals(substring3) &&
                        !substring2.equals(substring4) && !substring3.equals(substring4)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
