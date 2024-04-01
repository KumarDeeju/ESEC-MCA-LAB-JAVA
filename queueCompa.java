import java.util.Comparator;
import java.util.PriorityQueue;

public class queueCompa {

    public static <T> void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            public int compare(String student, String t1){
                return student.getGrade() - t1.getGrade();
            }
        });
    }

    public static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}
