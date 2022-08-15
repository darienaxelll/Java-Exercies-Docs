package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<Integer> gradeList = new ArrayList<>();
    private String username;

    public Student(String name, String username) {
        this.name = name;
        this.username = username;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        gradeList.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        double sum = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            sum += gradeList.get(i);
        }
        return sum / gradeList.size();
    }
}
