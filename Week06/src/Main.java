import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Teacher john = new Teacher(101, "John");
        Teacher mary = new Teacher(102, "Mary");
        Teacher david = new Teacher(103, "David");
        Teacher[] teachers = {john, mary, david};

        Student bob = new Student(1, "Bob", 10);
        Student amy = new Student(2, "Amy", 11);
        Student[] students = {bob, amy};

        Course johnMath = new Course("Math", john);
        Course johnScience = new Course("Science", john);
        Course maryChinese = new Course("Chinese", mary);
        Course maryHistory = new Course("History", mary);
        Course davidScience = new Course("Science", david);

        john.setCourses(johnMath);
        john.setCourses(johnScience);
        mary.setCourses(maryChinese);
        mary.setCourses(maryHistory);
        david.setCourses(davidScience);

        johnMath.setStudents(bob);
        johnMath.setStudents(amy);
        johnScience.setStudents(bob);
        davidScience.setStudents(amy);
        maryChinese.setStudents(bob);
        maryChinese.setStudents(amy);
        maryHistory.setStudents(bob);
        maryHistory.setStudents(amy);

        bob.setScores(new HashMap<Course, Integer>() {{
            put(johnMath, 50);
            put(johnScience, 20);
            put(maryChinese, 85);
            put(maryHistory, 95);
        }});
        amy.setScores(new HashMap<Course, Integer>() {{
            put(johnMath, 80);
            put(davidScience, 25);
            put(maryChinese, 85);
            put(maryHistory, 80);
        }});

        System.out.println("--------------------");
        for (Student student : students) {
            System.out.println(student.getTranscript());
        }

        bob.setScores(new HashMap<Course, Integer>() {{
            put(johnMath, 60);
        }});
        amy.setScores(new HashMap<Course, Integer>() {{
            put(davidScience, 90);
        }});

        System.out.println("--------------------");
        for (Student student : students) {
            System.out.println(student.getTranscript());
        }

        System.out.println("--------------------");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getStudentList());
        }

        System.out.println("--------------------");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getStudentScore());
        }
    }
}