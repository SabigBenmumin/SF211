import java.util.Random;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestGrades{
    private int numOfStudents;
    private int[] grades;
    public TestGrades(int numOfStudents){
        Random rand = new Random();
        this.numOfStudents = numOfStudents;
        grades = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++){
            grades[i] = rand.nextInt(101);
        }
    }
    public int[] getGrades() {
        return Arrays.copyOf(grades, numOfStudents);
    }
    public void setGreades(int[] grades) {
        this.grades = Arrays.copyOf(grades, numOfStudents);
    }
    public String toString() {
        return "Test grades are: " + Arrays.toString(grades);
    }
    public boolean equals(Object other) {
        if (!(other instanceof TestGrades)) return false;
        TestGrades o = (TestGrades) other;
        return numOfStudents == o.numOfStudents && Arrays.equals(grades, o.grades);
    }
    public int[] sortedGrades(){
        int[] copy = Arrays.copyOf(grades, numOfStudents);
        Arrays.sort(copy);
        return copy;
    }
    public int highestGrades() {
        return sortedGrades()[numOfStudents - 1];
    }
    public double averageGrade() {
        double total = 0;
        for (int grade: grades){
            total += grade;
        }
        return total / numOfStudents;
    }
    public double medianGrade() {
        if (numOfStudents % 2 == 1){
            return sortedGrades()[numOfStudents / 2];
        }
        else{
            int[] sorted = sortedGrades();
            return (sorted[numOfStudents / 2 - 1] + sorted[numOfStudents / 2]) / 2;
        }
    }
    public int modeGrade() {
        int[] counters = new int[101];
        for (int grade: grades){
            counters[grade]++;
        }
        int mode = 0;
        for (int score = 0; score < 101; score++){
            if (counters[score] == counters[mode]){
                mode = score;
            }
        }
        return mode;
    }

}