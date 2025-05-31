public class Student {
    private final String name;
    private final int rollNumber;
    private final String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String toString() {
        return name + "," + rollNumber + "," + grade;
    }
  
    public static Student fromString(String data) {
        String[] parts = data.split(",");
        return new Student(parts[0], Integer.parseInt(parts[1]), parts[2]);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------");
}
}