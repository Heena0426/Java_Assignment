package org.example;


import java.util.*;

public class School {
    private List<Student> students = new ArrayList<>();


    public void addStudents(List<Student> newStudents) {
        newStudents.forEach(student -> students.add(student));
    }


    public Optional<Student> findTopScorer(String subject) {
        return students.stream()
                .filter(student -> student.getSubject().equals(subject))
                .max(Comparator.comparingDouble(Student::getScore));
    }


    public Optional<Student> getStudentByRollNumber(int rollNumber) {
        Student student1 = students.stream()
                .filter(student -> student.getRollNumber() == rollNumber)
                .findFirst().orElse(new Student());
        return Optional.ofNullable(student1);
    }


    public void displayStudentNames() {
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }


    public void displayAllStudents() {
        students.forEach(System.out::println);
    }

}