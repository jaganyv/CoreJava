package CoreConcepts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
        static List<Student> students = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("\n=== Student Record System ===");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Save to File");
                System.out.println("4. Load from File");
                System.out.println("5. Exit");

                System.out.print("Choose: ");
                int choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        addStudent(); break;
                    case 2:
                        viewStudents(); break;
                    case 3:
                        saveToFile(); break;
                    case 4:
                        loadFromFile(); break;
                    case 5:
                        System.out.println("Exiting... ✅");
                        return;
                    default:
                        System.out.println("Invalid choice ❌");
                }
            }
        }

        static void addStudent() {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter course: ");
            String course = sc.nextLine();

            students.add(new Student(name, age, course));
            System.out.println("Student added ✅");
        }

        static void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found ❌");
            } else {
                for (Student s : students) {
                    s.display();
                }
            }
        }

        static void saveToFile() {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"))) {
                for (Student s : students) {
                    bw.write(s.toString());
                    bw.newLine();
                }
                System.out.println("Saved to file ✅");
            } catch (IOException e) {
                System.out.println("Error saving file ❌");
            }
        }

        static void loadFromFile() {
            students.clear();
            try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    students.add(Student.fromString(line));
                }
                System.out.println("Loaded from file ✅");
            } catch (IOException e) {
                System.out.println("Error loading file ❌");
            }
        }
    }
