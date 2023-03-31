import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Course> courses;

    public Teacher(int id, String name) {
        super(id, name);
        this.courses = new ArrayList<>();
    }

    public void setCourses(Course course) {
        this.courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void printStudents() {
        for (Course course : this.courses) {
            System.out.println("Teacher: " + this.getName());
            System.out.println("Course: " + course.getName());
            System.out.println("Students: ");
            for (Student student : course.getStudents()) {
                System.out.println(student.getName());
            }
            System.out.println();
        }
    }

    public void printStudentsByCourse() {
        for (Course course : this.courses) {
            System.out.println("Teacher: " + this.getName());
            System.out.println("Course: " + course.getName());
            System.out.println("Students: ");
            for (Student student : course.getStudents()) {
                System.out.print("\t" + student.getName() + ": ");
                if (student.getScores().get(course).size() > 1) {
                    for (int score : student.getScores().get(course)) {
                        System.out.print(score + " ");
                    }
                    System.out.println();
                }
                else {
                    System.out.print(student.getScores().get(course).toArray()[0]);
                }
            }
            System.out.println("\n");
        }
    }
}
