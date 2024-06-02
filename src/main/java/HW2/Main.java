package HW2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        System.out.println("Retrieving student with ID 2:");
        Student retrievedStudent = manager.getStudentById(2);
        if (retrievedStudent != null) {
            System.out.println("Name: " + retrievedStudent.getName() + ", ID: " + retrievedStudent.getId());
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nAll students:");
        for (Student student : manager.getAllStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }

        System.out.println("\nRemoving student with ID 2:");
        boolean removed = manager.removeStudentById(2);
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nAll students after removal:");
        for (Student student : manager.getAllStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }

    }
}