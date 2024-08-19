public class Student {
    private int rollNumber;
    private String name;
    private String subject;
    private double score;

    public Student(int rollNumber, String name, String subject, double score) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
