// Name (in English): Sabig Benmumin
// ID: 6510742197

import java.text.DecimalFormat;

public class Q1 {
	public static void main(String[] args) {
		// uncomment line by line to test your code
		GPA myGPA = new GPA();
		System.out.println("My Initial GPA: " + myGPA.getGPA());
		myGPA =	new GPA(103.5, 36);
		GPA yourGPA = new GPA(106.5, 37);
		System.out.println("My Grades:\n" + myGPA);
		System.out.println("Your Grades:\n" + yourGPA);
		System.out.println("The GPA's are " + (myGPA.equals(yourGPA) ? "" : "not ") + "the same.");
		System.out.println("We both get " + myGPA.getHonor());
		String gpa1 = myGPA.setGradePoints(102).setCreditsAccumulated(26).getGPA();
		String gpa2 = yourGPA.setGradePoints(91).setCreditsAccumulated(26).getGPA();
		System.out.println("My Grades:\n" + myGPA);
		System.out.println("Your Grades:\n" + yourGPA);
		System.out.println("The GPA's are now " + (myGPA.equals(yourGPA) ? "" : "not ") + "the same.");
		double diff = Math.abs(Double.parseDouble(gpa1) - Double.parseDouble(gpa2));
		System.out.printf("Our GPA's are different by %.2f\n", diff);
	}
}

// WRITE YOUR CODE HERE
class GPA{
	private double gradePoints;
	private double creditsAccumulated;
	public GPA(){
		this.gradePoints = 0;
		this.creditsAccumulated = 1;
	}
	public GPA(double gradePoints, double creditsAccumulated){
		this.gradePoints = gradePoints;
		this.creditsAccumulated = creditsAccumulated;
	}
	public GPA setGradePoints(double gradePoints){
		if (gradePoints > 0) this.gradePoints = gradePoints;
		return this;
	}
	public GPA setCreditsAccumulated(double creditsAccumulated){
		if (creditsAccumulated > 0) this.creditsAccumulated = creditsAccumulated;
		return this;
	}
	public double gpaCal(){
		return gradePoints/creditsAccumulated;
	}
	public DecimalFormat FGPA = new DecimalFormat("0.00");
	public String getGPA(){
		if (gradePoints == 0){
			return "0.00";
		}
		return FGPA.format(gpaCal());
	}
	public String getHonor(){
		double gpa = gpaCal();
		if(gpa <= 3.49) return "No Honor";
		else if(gpa <= 3.69) return "Cum Laude";
		else if(gpa <= 3.89) return "Magna Cum Laude";
		else return "Summa Cum Laude";
	}
	public String toString(){
		return "\tGP: " + gradePoints + "\n\tCA: " + creditsAccumulated +
		"\n\tGPA: " + getGPA();
	}
	public boolean equals(Object other){
		if(!(other instanceof GPA)) return false;
		GPA o = (GPA) other;
		return Math.abs(gpaCal() - o.gpaCal()) < 0.01;
	}
}