package org.example;

import org.example.School;
import org.example.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Main{
    public static void main(String[] args) {
        School school = new School();
//
        List<Student> newStudents = Arrays.asList(
                new Student(1, "Heena", "Math", 92.5),
                new Student(2, "Daniya", "Math", 85.0),
                new Student(3, "Saniya", "Math", 95.5),
                new Student(4, "Charlie", "Science", 89.5),
                new Student(5, "David", "Science", 90.0),
                new Student(6, "Martin", "Science", 83.5),
                new Student(7, "Alice", "English", 83.5),
                new Student(8, "Bob", "English", 82.5),
                new Student(9, "Luther", "English", 81.5)
        );


        school.addStudents(newStudents);

        // Display students
        System.out.println("All Students:");
        school.displayAllStudents();


        System.out.println("\nTop Scorer in Math:");
        Optional<Student> topMathScorer = school.findTopScorer("Math");
        topMathScorer.ifPresent(System.out::println);


        System.out.println("\nTop Scorer in Science:");
        Optional<Student> topScienceScorer = school.findTopScorer("Science");
        topScienceScorer.ifPresent(System.out::println);

        System.out.println("\nTop Scorer in English:");
        Optional<Student> topEnglishScorer = school.findTopScorer("English");
        topEnglishScorer.ifPresent(System.out::println);


        System.out.println("\nStudent with roll number 2:");
        Optional<Student> studentByRollNumber = school.getStudentByRollNumber(2);
        studentByRollNumber.ifPresent(System.out::println);
        System.out.println("\nStudent with roll number :");
        Optional<Student> studentByRollNumber10 = school.getStudentByRollNumber(89);
        studentByRollNumber10.ifPresent(System.out::println);


        System.out.println("\nStudent Names:");
        school.displayStudentNames();
    }
}
