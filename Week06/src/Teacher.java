import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Course> courses;

    public Teacher(int id, String name) {
        super(id, name);
        this.courses = new ArrayList<>();
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Course course) {
        this.courses.add(course);
    }

    public String getStudentList() {
        String output = this.getName() + "'s Students\n";

        for (Course course : this.courses) {
            output += "\t" + course.getName() + ": ";

            for (int i = 0; i < course.getStudents().size(); i++) {
                if (i > 0) {
                    output += ", " + course.getStudents().get(i).getName();
                }
                else {
                    output += course.getStudents().get(i).getName();
                }
            }

            output += "\n";
        }

        return output;
    }

    public String getStudentScore() {
        String output = this.getName() + "'s Student Score\n";

        for (Course course: this.courses) {
            output += "\t" + course.getName() + ":\n";

            for (Student student : course.getStudents()) {
                output += "\t\t" + student.getName() + ": ";

                for (int i = 0; i < student.getScores().get(course).size(); i++) {
                    if (i > 0) {
                        output += ", " + student.getScores().get(course).get(i);
                    }
                    else {
                        output += student.getScores().get(course).get(i);
                    }
                }

                output += "\n";
            }
        }

        return output;
    }
}
