package org.example.springdatajpa.assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private int testScore;

    public Student() {
        super();
    }

    public Student(long id, String name, int testScore) {
        super();
        this.id = id;
        this.name = name;
        this.testScore = testScore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", testScore=" + testScore + "]";
    }

}
