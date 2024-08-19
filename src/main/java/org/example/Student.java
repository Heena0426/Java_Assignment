package org.example;

import java.util.*;

public class Student{
    int rollNumber;
    String name;
    String subject;
    double score;

    public Student() {
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


    public Student(int rollNumber, String name, String subject, double score){
        this.rollNumber=rollNumber;
        this.name=name;
        this.subject=subject;
        this.score=score;
    }

    public String getSubject() {
        return this.subject;
    }

    public double getScore() {
        return this.score;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }
}
