import java.util.Random;
import java.util.Scanner;

public class GunGame {
    private static int playerHealth = 100;
    private static int enemyHealth = 100;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Gun Game!");
        System.out.println("You are facing an enemy. You have a gun, and so does the enemy.");
        System.out.println("Your health: " + playerHealth);
        System.out.println("Enemy health: " + enemyHealth);

        while (playerHealth > 0 && enemyHealth > 0) {
            int playerDamage = random.nextInt(10) + 1; // Random damage between 1 and 10
            int enemyDamage = random.nextInt(10) + 1;

            System.out.println("\nChoose an action:");
            System.out.println("1. Shoot");
            System.out.println("2. Run");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You shoot the enemy!");
                enemyHealth -= playerDamage;
                System.out.println("Enemy takes " + playerDamage + " damage.");
            } else if (choice == 2) {
                System.out.println("You try to run away, but the enemy shoots you!");
                playerHealth -= enemyDamage;
                System.out.println("You take " + enemyDamage + " damage.");
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }

            System.out.println("Your health: " + playerHealth);
            System.out.println("Enemy health: " + enemyHealth);
        }

        if (playerHealth <= 0) {
            System.out.println("Game over! You lose.");
        } else {
            System.out.println("Congratulations! You win!");
        }
    }
}

