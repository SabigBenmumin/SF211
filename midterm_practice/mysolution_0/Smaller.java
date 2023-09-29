//this is Q2
import java.util.Random;

public class Smaller {
    public static void main(String[] args){
        Random rand = new Random();
        int n1 ,n2;
        n1 = rand.nextInt(101);
        n2 = rand.nextInt(101);
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        //if(n1 < n2){
        //    System.out.print("smaller is " + n1);
        //}else{
        //    System.out.print("smaller is " + n2);
        //}
        System.out.print("smaller is " + Math.min(n1, n2));
    }
}
