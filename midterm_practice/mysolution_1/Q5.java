import java.text.DecimalFormat;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        DecimalFormat form = new DecimalFormat("#.00");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circum = 2 * Math.PI * radius;
        System.out.println("circle area: " + form.format(area));
        System.out.println("circle circum: " + form.format(circum));

    }
}
