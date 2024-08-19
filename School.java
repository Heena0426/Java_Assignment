import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    private List<Student> students = new ArrayList<>();

    // Lambda expression and functional interface for adding students
    public void addStudents(List<Student> newStudents) {
        newStudents.forEach(student -> students.add(student));
    }

    // Use Streams API to find the top scorer in a subject
    public Optional<Student> findTopScorer(String subject) {
        return students.stream()
                .filter(student -> student.getSubject().equals(subject))
                .max(Comparator.comparingDouble(Student::getScore));
    }

    // Use Optional to get a student by roll number
    public Optional<Student> getStudentByRollNumber(int rollNumber) {
        return students.stream()
                .filter(student -> student.getRollNumber() == rollNumber)
                .findFirst();
    }

    // Use method references to display student names
    public void displayStudentNames() {
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    // To display all students (for testing purposes)
    public void displayAllStudents() {
        students.forEach(System.out::println);
    }

    public static void main(String[] args) {
        School school = new School();

        List<Student> newStudents = Arrays.asList(
                new Student(1, "Alice", "Math", 92.5),
                new Student(2, "Bob", "Math", 85.0),
                new Student(3, "Charlie", "Science", 89.5),
                new Student(4, "David", "Science", 90.0)
        );

        // Adding students
        school.addStudents(newStudents);

        // Display all students
        System.out.println("All Students:");
        school.displayAllStudents();

        // Finding the top scorer in Math
        System.out.println("\nTop Scorer in Math:");
        Optional<Student> topMathScorer = school.findTopScorer("Math");
        topMathScorer.ifPresent(System.out::println);

        // Finding the top scorer in Science
        System.out.println("\nTop Scorer in Science:");
        Optional<Student> topScienceScorer = school.findTopScorer("Science");
        topScienceScorer.ifPresent(System.out::println);

        // Getting a student by roll number
        System.out.println("\nStudent with roll number 2:");
        Optional<Student> studentByRollNumber = school.getStudentByRollNumber(2);
        studentByRollNumber.ifPresent(System.out::println);

        // Display student names
        System.out.println("\nStudent Names:");
        school.displayStudentNames();
    }
}
