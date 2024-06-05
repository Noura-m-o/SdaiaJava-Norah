package HW3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {

    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortStudentsByName() {
        Collections.sort(students, Comparator.comparing(Person::getName));
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;}
    public void writeStudentsToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Student student : students) {
                writer.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readStudentsFromFile(String filename) {
        students.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0].substring(parts[0].indexOf(": ") + 2);
                int age = Integer.parseInt(parts[1].substring(parts[1].indexOf(": ") + 2));
                String address = parts[2].substring(parts[2].indexOf(": ") + 2);
                int studentId = Integer.parseInt(parts[3].substring(parts[3].indexOf(": ") + 2));
                String course = parts[4].substring(parts[4].indexOf(": ") + 2);
                Student student = new Student(name, age, address, studentId, course);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearStudents() {

    }
}
