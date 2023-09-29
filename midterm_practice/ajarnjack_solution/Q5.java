import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // 1. read radius
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();
        // 2.1 compute area
        double area = Math.PI * Math.pow(radius, 2);
        // 2.2 compute circumference
        double circumference = 2 * Math.PI * radius;
        // 3. display results
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

}
