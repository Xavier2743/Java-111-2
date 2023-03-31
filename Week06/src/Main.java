import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Teacher john = new Teacher(101, "John");
        Teacher mary = new Teacher(102, "Mary");
        Teacher david = new Teacher(103, "David");

        Student bob = new Student(1, "Bob", 10);
        Student amy = new Student(2, "Amy", 11);

        Course math = new Course("Math", john);
        Course science = new Course("Science", john);
        Course chinese = new Course("Chinese", mary);
        Course history = new Course("History", mary);
        Course science2 = new Course("Science", david);

        math.setStudents(bob);
        math.setStudents(amy);
        science.setStudents(bob);
        science2.setStudents(amy);
        chinese.setStudents(bob);
        history.setStudents(amy);

        john.setCourses(math);
        john.setCourses(science);
        mary.setCourses(chinese);
        mary.setCourses(history);
        david.setCourses(science2);

        bob.setScores(new HashMap<Course, Integer>() {{
            put(john.getCourses().get(0), 50);
            put(john.getCourses().get(1), 20);
            put(mary.getCourses().get(0), 85);
            put(mary.getCourses().get(1), 95);
        }});
        amy.setScores(new HashMap<Course, Integer>() {{
            put(john.getCourses().get(0), 80);
            put(mary.getCourses().get(0), 25);
            put(mary.getCourses().get(1), 85);
            put(david.getCourses().get(0), 80);
        }});

        bob.printScores();
        System.out.println("--------------------");
//        amy.printScores();
//
        bob.setScores(new HashMap<Course, Integer>() {{
            put(john.getCourses().get(0), 60);
        }});
//
//        System.out.println("--------------------");
//        bob.printScores();
//        System.out.println("--------------------");
//        amy.printScores();

        john.printStudentsByCourse();
        mary.printStudentsByCourse();
        david.printStudentsByCourse();
    }
}