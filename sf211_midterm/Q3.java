//Sabig Benmumin 6510742197
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Make your choice (r=rock,p=paper,s=scissors): ");
        char c = scan.nextLine().charAt(0);
        //assume 0 = rock, 1=paper, 2=scissors
        int com_n = rand.nextInt(3);
        String com_choice;
        char com_c;
        if(com_n == 0){
            com_choice = "rock";
            com_c = 'r';
        }else if(com_n == 1){
            com_choice = "paper";
            com_c = 'p';
        }else{
            com_choice = "scissors";
            com_c = 's';
        }
        System.out.println("Computer choice is " + com_choice);
        //prefer
        if(com_c == c){
            System.out.print("Draw.");
        }else if((com_c == 'r' && c == 'p') || (com_c == 'p' && c == 's') || (com_c == 's' && c == 'r')){
            System.out.print("You won!");
        }else{
            System.out.print("You lost!");
        }

    }
}
