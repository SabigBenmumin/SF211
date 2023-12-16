// Name (in English): 
// ID: 

public class Q1 {
  public static void main(String[] args) {
    BMI myBMI = new BMI(70.2, 1.65);
    BMI yourBMI = new BMI(80.5, 1.91);
    System.out.println("My BMI:\n" + myBMI);
    System.out.println("Your BMI:\n" + yourBMI);
    System.out.println("Your BMI and my BMI are " + (myBMI.equals(yourBMI) ? "the same." : "not the same."));
    System.out.println("Your BMI is " + (yourBMI.getBMI() > myBMI.getBMI() ? "larger" : "smaller") + " than mine.");

    myBMI.setWeight(60.8).setHeight(1.66);
    System.out.println("My BMI:\n" + myBMI);
    System.out.println("Your BMI and my BMI are now " + (myBMI.equals(yourBMI) ? "the same." : "not the same."));
  }
}

// WRITE YOUR CODE HERE
