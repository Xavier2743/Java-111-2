import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }
}
