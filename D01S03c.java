package day1session1;
import java.util.Scanner;

	public class D01S03c {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the marks obtained: ");
	        double marks = scanner.nextDouble();

	        if (marks >= 60) {
	            System.out.println("A Grade");
	        } else if (marks >= 45) {
	            System.out.println("B Grade");
	        } else if (marks >= 35) {
	            System.out.println("C Grade");
	        } else {
	            System.out.println("Fail");
	        }
	    }
	}
