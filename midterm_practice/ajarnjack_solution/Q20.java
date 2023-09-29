import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
        // 1. read binary word
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary: ");
//      String binary = scan.next();
//      // 2. convert to decimal
//      int decimal = 0;
//      int weight = 1;
//      for (int i = binary.length()-1; i >=0; i--) {
//          if (binary.charAt(i) == '1')
//              decimal += weight;
//          weight *= 2;
//      }
        int binary = scan.nextInt();
        int decimal = 0;
        int weight = 1;
        while (binary > 0) {
            if (binary % 10 == 1)
                decimal += weight;
            binary /= 10;
            weight *= 2;
        }
        System.out.println(decimal);
    }

}
