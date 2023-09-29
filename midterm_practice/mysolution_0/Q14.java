import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer");
        int n = scan.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++){
            fact += i;
        }
        System.out.println(n + "! = " + fact);
    }
}
