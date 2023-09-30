import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = scan.next().charAt(0);
        boolean isValid = Character.isLetter(ch) || ch == '$' || ch == '_';
        if(isValid){
            System.out.print(ch + " is valid start charater.");
        }else{
            System.out.print(ch + " is not valid start character.");
        }
    }
}
