package day2session1;
import java.util.*;

public class D02S01e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter the strings separated by spaces:");
        String[] strings = scanner.nextLine().split(" ");
        if (canFormCircle(strings)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
    public static boolean canFormCircle(String[] strings) {
        int[] inDegree = new int[26];
        int[] outDegree = new int[26];
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            outDegree[firstChar - 'a']++;
            inDegree[lastChar - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (inDegree[i] != outDegree[i]) {
                return false;
            }
        }
        return true;
    }
}

