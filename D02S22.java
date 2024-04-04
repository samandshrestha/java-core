package day2session1;

import java.util.Scanner;
class NotEligibleException extends Exception {
 public NotEligibleException(String message) {
     super(message);
 }
}
class CricketRating {
 private String playerName;
 private float critic1;
 private float critic2;
 private float critic3;
 private float avgRating;
 private String coins;
 public CricketRating(String playerName, float critic1, float critic2) {
     this.playerName = playerName;
     this.critic1 = critic1;
     this.critic2 = critic2;
     calculateAverageRating(critic1, critic2);
     coins = calculateCoins();
 }
 public CricketRating(String playerName, float critic1, float critic2, float critic3) {
     this.playerName = playerName;
     this.critic1 = critic1;
     this.critic2 = critic2;
     this.critic3 = critic3;
     calculateAverageRating(critic1, critic2, critic3);
     coins = calculateCoins();
 }
 private void calculateAverageRating(float critic1, float critic2) {
     avgRating = (critic1 + critic2) / 2;
 }
 private void calculateAverageRating(float critic1, float critic2, float critic3) {
     avgRating = (critic1 + critic2 + critic3) / 3;
 }
 private String calculateCoins() {
     if (avgRating >= 7)
         return "Gold";
     else if (avgRating >= 5)
         return "Silver";
     else if (avgRating >= 2)
         return "Copper";
     else
         return "NotEligible";
 }
 public void display() {
     System.out.println("Player Name: " + playerName);
     System.out.println("Average Rating: " + avgRating);
     System.out.println("Coins: " + coins);
 }
}
public class D02S22 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter player name:");
     String playerName = scanner.nextLine();
     System.out.println("Enter critic 1 rating:");
     float critic1 = scanner.nextFloat();
     System.out.println("Enter critic 2 rating:");
     float critic2 = scanner.nextFloat();
     scanner.nextLine();
     System.out.println("Enter critic 3 rating (leave blank if only two critics):");
     String critic3Input = scanner.nextLine();
     if (!critic3Input.isEmpty()) {
         float critic3 = Float.parseFloat(critic3Input);
         CricketRating playerRating = new CricketRating(playerName, critic1, critic2, critic3);
         playerRating.display();
     } else {
         CricketRating playerRating = new CricketRating(playerName, critic1, critic2);
         playerRating.display();
     }
 }
}
