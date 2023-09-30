import java.text.DecimalFormat;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.0%");
        int shot, shot_made;
        System.out.print("Enter number of shot: ");
        shot = scan.nextInt();
        System.out.print("Enter number of shot made: ");
        shot_made = scan.nextInt();
        double percent = (double) shot/shot_made;
        System.out.print("shooting percentage: " + form.format(percent));
    }
}
