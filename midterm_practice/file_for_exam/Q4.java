import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // 1. read numbers of quarters, dimes and nickels
        Scanner scan = new Scanner(System.in);
//      System.out.print("Enter quarters: ");
//      int quarters = scan.nextInt();
//      System.out.print("Enter dimes: ");
//      int dimes = scan.nextInt();
//      System.out.print("Enter nickels: ");
//      int nickels = scan.nextInt();
        System.out.print("Enter quarters,dimes,nickes: ");
        int quarters = scan.nextInt();
        int dimes = scan.nextInt();
        int nickels = scan.nextInt();
        // 2. convert to dollar value
        double dollar = quarters*0.25 + dimes*0.10 + nickels*0.05;
        // 3. display result
        DecimalFormat formatter = new DecimalFormat("$#,###.00");
        System.out.println("You have " + formatter.format(dollar));
//      System.out.format("You have $%,.2f%n", dollar);
    }

}
