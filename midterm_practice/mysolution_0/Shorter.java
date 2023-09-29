// this is Q1
import java.util.Scanner;

public class Shorter{
    public static void main(String[] args){
        String world1, world2;
        Scanner scan = new Scanner(System.in);
        System.out.print("input first world: ");
        world1 = scan.nextLine();
        System.out.print("input second world: ");
        world2 = scan.nextLine();
        if(world1.length() < world2.length()){
            System.out.print(world1.length());
        }else{
            System.out.print(world2.length());
        }
    }
}