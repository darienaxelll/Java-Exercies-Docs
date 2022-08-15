package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student josh = new Student("Josh", 0);
        josh.addGrade(80);
        josh.addGrade(90);
        josh.addGrade(100);
        System.out.println("Josh grade average is: " + josh.getGradeAverage());

        System.out.println();

        Student nick = new Student("Nick", 0);
        nick.addGrade(70);
        nick.addGrade(60);
        nick.addGrade(85);
        System.out.println("Nick grade average is: " + nick.getGradeAverage());
    }
}
