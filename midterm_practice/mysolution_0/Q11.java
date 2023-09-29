import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a web address: ");
        String address = scan.next();
        String type = address.substring(address.length() - 3);
        switch (type) {
            "gov" : System.out.println("it is a goverment web address"); break;
            "adu" : System.out.println("it is a university web address"); break;
            "com" : System.out.println("it is a business web address"); break;
            "org" : System.out.println("it is a organization web address"); break;
            default: System.out.println("it is a web address for another entity");
        }
    }
}
