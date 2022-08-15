package grades;

import java.util.ArrayList;

public class Student {
    private final String name;
    private int grade;

    ArrayList<Integer> gradeList = new ArrayList<>();

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        gradeList.add(grade);
        System.out.println(gradeList);
    };
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            sum += gradeList.get(i);
        }
        return sum / gradeList.size();
    }
}
