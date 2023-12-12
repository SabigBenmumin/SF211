import java.util.Arrays;

public class Q3 {
    public static void main(String[] args){
        TestGrades t1 = new TestGrades(50);
        TestGrades t2 = new TestGrades(50);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
        t2.setGreades(t1.getGrades());
        System.out.println(t1.equals(t2));
        System.out.println(Arrays.toString(t1.sortedGrades()));
        System.out.println(t1.highestGrades());
        System.out.println(t1.averageGrade());
        System.out.println(t1.medianGrade());
        System.out.println(t1.modeGrade());
    }
}
