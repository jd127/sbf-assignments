package org.example.springweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int testscore;

    public Student() {
        super();
    }

    public Student(long id, String name, int testScore) {
        super();
        this.id = id;
        this.name = name;
        this.testscore = testScore;
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

    public int getTestscore() {
        return testscore;
    }

    public void setTestscore(int testScore) {
        this.testscore = testScore;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", testScore=" + testscore + "]";
    }

}
