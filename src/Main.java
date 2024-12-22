import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double stuckPrice = 15.3;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much euro do you have?");
        double money = sc.nextDouble();
        int amount = (int) (money / stuckPrice);
        double left = money % stuckPrice;
        if (money > stuckPrice) {
            System.out.println("You can buy: " + amount + " stuck. Total price: " + String.format("%.2f",(amount * stuckPrice)) + " euro. " +
                    "You have also " + String.format("%.2f",(left)) + " euro.");
        } else System.out.println("Impossible to buy. You need extra " + (stuckPrice - money) + " euro.");
        sc.close();

    }
}