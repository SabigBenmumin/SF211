import java.text.DecimalFormat;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of attempts: ");
        int attempts = scan.nextInt();
        System.out.print("Enter number of shots: ");
        int shots = scan.nextInt();
        DecimalFormat format = new DecimalFormat("0.0%");
        double ratio = (double) shots / attempts;
        System.out.println("Shot percentage = " + format.format(ratio));
    }
}
