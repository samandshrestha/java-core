package day1session1;
import java.util.Scanner;

 public class D01S03b {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number between 1 to 7: ");
	        int dayNumber = scanner.nextInt();
            if (dayNumber >= 1 && dayNumber <= 7) {
	            if (dayNumber == 1) {
	                System.out.println("Sunday");
	            } else if (dayNumber == 2) {
	                System.out.println("Monday");
	            } else if (dayNumber == 3) {
	                System.out.println("Tuesday");
	            } else if (dayNumber == 4) {
	                System.out.println("Wednesday");
	            } else if (dayNumber == 5) {
	                System.out.println("Thursday");
	            } else if (dayNumber == 6) {
	                System.out.println("Friday");
	            } else {
	                System.out.println("Saturday");
	            }
	        } else {
	            System.out.println("Invalid Input");
	        }
	    }
	}

