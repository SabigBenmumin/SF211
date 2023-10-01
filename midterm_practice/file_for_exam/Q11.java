import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        // 1. read web address
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter web address: ");
        String address = scan.next();
        // 2. extract domain class
        String domain = address.substring(address.length() - 3);
//      System.out.println(domain);
        // 3. classify the domain
        if (domain.equals("gov")) {
            System.out.println("It is a government address.");
        } else if (domain.equals("edu")) {
            System.out.println("It is a university address.");
        } else if (domain.equals("com")) {
            System.out.println("It is a business address.");
        } else if (domain.equals("org")) {
            System.out.println("It is an organization address.");
        } else {
            System.out.println("It is a web address of another entity.");
        }
        switch (domain) {
        case "gov":
            System.out.println("It is a government address.");
            break;
        case "edu":
            System.out.println("It is a university address.");
            break;
        case "com":
            System.out.println("It is a business address.");
            break;
        case "org":
            System.out.println("It is an organization address.");
            break;
        default:
            System.out.println("It is a web address of another entity.");
        }
    }

}
