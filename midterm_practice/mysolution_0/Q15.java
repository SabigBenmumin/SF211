import java.util.Scanner;

public class Q15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = scan.next();
        boolean valid = true;
        int count = 0;
        for(int i = 0; i < bin.length(); i++){
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1'){
                valid = false;
                break;
            }else if(bin.charAt(i) == '1'){
                count++;
            }
        }
        if (valid) {
            System.out.println("There are " + count + " 1;s"); 
        }else{
            System.out.println();
        }
        scan.close();
    }
}