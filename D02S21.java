package day2session1;

import java.util.Scanner;
class LowBalanceException extends Exception {
 public LowBalanceException(String message) {
     super(message);
 }
}
class NegativeAmountException extends Exception {
 public NegativeAmountException(String message) {
     super(message);
 }
}

class BankAccount {
 private int accNo;
 private String custName;
 private String accType;
 private float balance;
 public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmountException {
     this.accNo = accNo;
     this.custName = custName;
     this.accType = accType;
     
     if (balance < 0) {
         throw new NegativeAmountException("NegativeAmount");
     }
     
     if (accType.equals("Saving") && balance < 1000) {
         throw new LowBalanceException("LowBalance");
     }
     
     if (accType.equals("Current") && balance < 5000) {
         throw new LowBalanceException("LowBalance");
     }
     
     this.balance = balance;
 }
 public void deposit(float amt) throws NegativeAmountException {
     if (amt < 0) {
         throw new NegativeAmountException("NegativeAmount");
     }
     balance += amt;
 }
 public float getBalance() throws LowBalanceException {
     if (balance < 1000 && accType.equals("Saving")) {
         throw new LowBalanceException("LowBalance");
     }
     
     if (balance < 5000 && accType.equals("Current")) {
         throw new LowBalanceException("LowBalance");
     }
     
     return balance;
 }
}
public class D02S21 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter account number:");
     int accNo = scanner.nextInt();
     scanner.nextLine(); // Consume newline
     System.out.println("Enter customer name:");
     String custName = scanner.nextLine();
     System.out.println("Enter account type (Saving/Current):");
     String accType = scanner.nextLine();
     System.out.println("Enter initial balance:");
     float balance = scanner.nextFloat();

     try {
         BankAccount account = new BankAccount(accNo, custName, accType, balance);
         System.out.println("Account created successfully.");
         System.out.println("Current balance: " + account.getBalance());

         System.out.println("Enter amount to deposit:");
         float depositAmt = scanner.nextFloat();
         account.deposit(depositAmt);
         System.out.println("Amount deposited successfully.");
         System.out.println("Updated balance: " + account.getBalance());
     } catch (LowBalanceException e) {
         System.out.println("LowBalance");
     } catch (NegativeAmountException e) {
         System.out.println("NegativeAmount");
     }
 }
}
