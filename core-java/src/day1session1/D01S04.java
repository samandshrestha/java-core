package day1session1;
import java.util.Scanner;

	public class D01S04{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
          int[] numbers = {1, 5,9, 21, 39};
          System.out.print("Enter two numbers in the range from 1 to 40: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == num1) {
	                foundNum1 = true;
	            }
	            if (numbers[i] == num2) {
	                foundNum2 = true;
	            }
	        }
	        if (foundNum1 && foundNum2) {
	            System.out.println("Its Bingo");
	        } else {
	            System.out.println("Not Found");
	        }
	    }
	}


