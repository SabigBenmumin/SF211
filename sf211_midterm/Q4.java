//Sabig Benmumin 6510742197
import java.util.Scanner;

public class Q4 {
    public static boolean hasA(String word){
        char c;
        for(int i = 0; i< word.length();i++ ){
            c = word.charAt(i);
            if(c == 'a' || c == 'A'){
                return true;
            }
        }
        return false;
    }
    public static boolean hasY(String word){
        char c;
        for(int i = 0; i< word.length();i++ ){
            c = word.charAt(i);
            if(c == 'y' || c == 'Y'){
                return true;
            }
        }
        return false;
    }
    public static boolean hasAandY(String word){
        boolean A = hasA(word);
        boolean Y = hasY(word);
        if(A && Y){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = 1;
        System.out.print("Enter first word: ");
        String word = scan.nextLine();
        while(!(hasAandY(word))){
            System.out.print("Enter next word: ");
            word = scan.nextLine();
            count++;
        }
        System.out.print("I found a word with 'a' and 'y' after " + count + " reads.");
    }
}
