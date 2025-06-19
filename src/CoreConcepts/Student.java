package CoreConcepts;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
    public class Student {
        private String name;
        private int age;
        private String course;

        Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        public String toString() {
            return name + "," + age + "," + course;
        }

        public static Student fromString(String data) {
            String[] parts = data.split(",");
            return new Student(parts[0], Integer.parseInt(parts[1]), parts[2]);
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        }
    }


