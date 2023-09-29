import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        // 1. read a number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        // 2. computer factorial
        int fac = 1;
        for (int i = 2; i <= n; i++)
            fac *= i;
        // 3. display result
        System.out.println(n + "! = " + fac);
    }

}
