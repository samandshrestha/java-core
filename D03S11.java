package day3session1;

import java.util.ArrayList;
import java.util.Scanner;

public class D03S11 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of student names separated by spaces:");
        String input = scanner.nextLine();
        String[] names = input.split(" ");
        for (String name : names) {
            studentNames.add(name);
        }
        System.out.println("Enter the name to search for:");
        String searchName = scanner.nextLine();
        if (studentNames.contains(searchName)) {
            System.out.println( "Found");
        } else {
            System.out.println(" does not Found");
        }
        scanner.close();
    }
}
