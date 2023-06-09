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

    public void setGrade(int grade) {
        if (grade < 1 || grade > 12) {
            throw new IllegalArgumentException("Grade must be between 1 and 12");
        }
        this.grade = grade;
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

    public String getTranscript() {
        String output = this.getName() + "'s Transcript\n";

        for (Course course : this.scores.keySet()) {
            output += "\t" + course.getName() + ": ";

            for (int i = 0; i < scores.get(course).size(); i++) {
                if (i > 0) {
                    output += ", " + scores.get(course).get(i);
                }
                else {
                    output += scores.get(course).get(i);
                }
            }

            output += "\n";
        }

        return output;
    }
}
