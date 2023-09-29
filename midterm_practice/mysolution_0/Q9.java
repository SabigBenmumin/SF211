import java.util.Scanner;

public class Q9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scan.next().charAt(0);
        if(Character.isLetter(c) || c == "_" || c == "$"){
            System.out.println(c + "is a valid stater character.");
        }else{
            System.out.print(c + "is not a valid charactoer");
        }
    }
}