import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("$#,###.00");
        double quarters, dimes, nickels, dollars;
        System.out.print("quarters: ");
        quarters = scan.nextInt();
        System.out.print("dimes: ");
        dimes = scan.nextInt();
        System.out.print("nickels: ");
        nickels = scan.nextInt();
        dollars = (quarters/4) + (dimes/10) + (nickels/20);
        System.out.print("total: " + form.format(dollars));
    }
}
