public class Student {
    String name;
    int age;
    String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentId);
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S12345");
        student1.displayDetails();
        student1.updateName("Alice Johnson");
        student1.displayDetails();
    }
}
