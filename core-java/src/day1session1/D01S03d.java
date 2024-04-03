package day1session1;
import java.util.Scanner;

	public class D01S03d {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            // Print number i, then repeat i times
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println(); // Move to the next line after printing each row
	        }
	    }
	}


