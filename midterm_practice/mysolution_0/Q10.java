import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass1 = scan.nextLine();
        System.out.print("Enter a password again: ");
        String pass2 = scan.nextLine();
        if(pass1.equals(pass2)){
            System.out.print("You are now registered as a new user.");
        }else{
            System.out.print("There is a type in your password.");
        }
    }
}
