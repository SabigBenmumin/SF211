import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        // 1. keep reading value until it is greater than 10
        Scanner scan = new Scanner(System.in);
        double num;
        do {
            System.out.print("Enter a value greater than 10: ");
            num = scan.nextDouble();
        } while (num <= 10);
        // 2. keep computing sqrt until it is less than 1.01
        double sqrt = num;
        do {
            sqrt = Math.sqrt(sqrt);
        } while (sqrt >= 1.01);
        // 3. display final values
        System.out.println("You entered " + num);
        System.out.println("The final sqrt is " + sqrt);
    }

}
