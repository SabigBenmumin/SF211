import java.util.Random;

public class Q2 {
    public static void main(String[] args){
        Random rand = new Random();
        int n1, n2;
        n1 = rand.nextInt(101);
        n2 = rand.nextInt(101);
        //System.out.println(n1);
        //System.out.println(n2);
        System.out.print(Math.min(n1, n2));
    }
}
