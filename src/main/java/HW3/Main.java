package HW3;

public class Main {


        public static void main(String[] args) {
            // Part 1: OOP Basics
            Person person1 = new Person("Norah", 23, "Khobar");
            Person person2 = new Person("Omar", 24, "Jeddah");

            System.out.println("Details of Person 1:");
            System.out.println(person1);

            System.out.println("Details of Person 2:");
            System.out.println(person2);

            // Part 2: Abstract Classes and Interfaces
            Student student1 = new Student("Sara", 24, "Riyadh", 7, "CA GEN");
            System.out.println("Details of Student 1:");
            System.out.println(student1);

            // Part 3: Collections
            School school = new School();

            school.addStudent(new Student("Reema", 28, "Khobar", 17, "Java"));
            school.addStudent(new Student("Rayan", 24, "Riyadh", 777, "C#"));
            school.addStudent(new Student("Moneerah", 26, "Khobar", 77, "HTML"));
            school.addStudent(new Student("Mohammed", 24, "Jeddah", 7777, "Python"));

            System.out.println("All Students:");
            school.displayAllStudents();

            school.removeStudent(7777);
            System.out.println("Students after removal:");
            school.displayAllStudents();

            school.sortStudentsByName();
            System.out.println("Students after sorting by name:");
            school.displayAllStudents();

            int studentIdToFind = 17;
            Student foundStudent = school.findStudentById(studentIdToFind);
            if (foundStudent != null) {
                System.out.println("Student with ID " + studentIdToFind + " found:");
                System.out.println(foundStudent);
            } else {
                System.out.println("Student with ID " + studentIdToFind + " not found.");
            }

            String filename = "students.txt";
            school.writeStudentsToFile(filename);
            System.out.println("Students written to file.");

            school.clearStudents();
            school.readStudentsFromFile(filename);
            System.out.println("Students read from file:");
            school.displayAllStudents();
        }
    }

