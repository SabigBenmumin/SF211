import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        // 1. read decimal number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scan.nextInt();
        // 2. convert to binary
        String binary = "";
        while (decimal > 0) {
            binary = decimal % 2 + binary;
            decimal = decimal / 2;
        }
        System.out.println(binary);
    }

}
