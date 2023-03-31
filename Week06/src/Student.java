import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person {
    private int grade;
    private HashMap<Course, ArrayList<Integer>> scores;

    public Student(int id, String name, int grade) {
        super(id, name);

        if (grade < 1 || grade > 12) {
            throw new IllegalArgumentException("Grade must be between 1 and 12");
        }
        this.grade = grade;

        this.scores = new HashMap<>();
    }

    public int getGrade() {
        return this.grade;
    }

    public HashMap<Course, ArrayList<Integer>> getScores() {
        return this.scores;
    }

    public void setScores(HashMap<Course, Integer> scores) {
        for (Course course : scores.keySet()) {
            if (this.scores.containsKey(course)) {
                if ((int) this.scores.get(course).toArray()[0] >= 60) {
                    throw new IllegalArgumentException("The course has already passed");
                }
                else {
                    this.scores.get(course).add(scores.get(course));
                }
            }
            else {
                this.scores.put(course, new ArrayList<>() {{
                    add(scores.get(course));
                }});
            }
        }
    }

    public void printScores() {
        System.out.println("Name: " + this.getName());

        for (Course course : this.scores.keySet()) {
            System.out.println("Course: " + course.getName());
            System.out.println("Teacher: " + course.getTeacher().getName());
            if (this.scores.get(course).size() > 1) {
                for (int score : this.scores.get(course)) {
                    System.out.println("Score: " + score);
                }
            }
            else {
                System.out.println("Score: " + this.scores.get(course).toArray()[0]);
            }
            System.out.println();
        }
    }
}
