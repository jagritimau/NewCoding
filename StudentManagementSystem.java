import java.util.ArrayList;

class EnrolledStudent {
    int id;
    String name;
    String course;

    EnrolledStudent(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course;
    }
}

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(EnrolledStudent student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        students.removeIf(s -> s.id == id);
    }

    public EnrolledStudent searchStudent(int id) {
        for (EnrolledStudent s : students) {
            if (s.id == id) return s;
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}