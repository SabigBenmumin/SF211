import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // 1. read password twice
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scan.nextLine();
        System.out.print("Reenter password: ");
        String password2 = scan.nextLine();
        // 2. check if match or not
        boolean matched = password.equals(password2);
        if (matched)
            System.out.println("You are now registered as a new user.");
        else
            System.out.println("Sorry, there is a typo in your password"
                    + "");
    }

}
