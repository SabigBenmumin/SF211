import java.lang.Math;
public class BMI {
    private double weight, height;
    public BMI(double weight, double height){
        setWeight(weight);
        setHeight(height);
    }

    public BMI setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }
        return this;
    }
    public BMI setHeight(double height){
        if(weight > 0){
            this.height = height;
        }
        return this;
    }
    public double getBMI(){
        return weight / Math.pow(height, 2);
    }
    public String getLevel(){
        double bmi = getBMI();
        if(bmi < 18.5) return "underweight";
        else if(bmi >= 18.5 && bmi < 25) return "normal";
        else if(bmi >= 25 && bmi < 30) return "overweight";
        else return "obesity";
        
    }

    private static final double TOLERANCE = 0.01;
    public boolean equals(Object other){
        if (!(other instanceof BMI)) return false;
        BMI o = (BMI) other;
        return Math.abs(getBMI() - o.getBMI()) < TOLERANCE;
    }
    public String toString(){
        return "\tWeight: " + weight + "\n\tHeight" + height 
        + "\n\tBMI: " + getBMI()
        + "\n\tLevel: " + getLevel();
    }
}
