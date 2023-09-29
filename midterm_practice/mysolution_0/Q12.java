import java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num = 0;
        do{
            System.out.print("Enter a number larger than 10: ");
            num = scan.nextDouble();
        } while(num <= 10);
        int iters = 0;
        while(num >= 1.01){
            num = Math.sqrt(num);
            iters++;
        }
        System.out.println("it took " + iters + " Iteration.");
    }
}
