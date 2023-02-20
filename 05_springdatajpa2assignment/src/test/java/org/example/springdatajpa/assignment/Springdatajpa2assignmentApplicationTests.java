package org.example.springdatajpa.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.example.springdatajpa.assignment.model.Student;
import org.example.springdatajpa.assignment.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springdatajpa2assignmentApplicationTests {

    @Autowired
    private StudentRepository repo;

    @Test
    public void testInsertStudent() {
        repo.deleteAll();
        repo.save(new Student(1L, "Emil", 15));
        Student savedStudent = repo.findById(1L).get();
        assertNotNull(savedStudent);
        repo.deleteAll();
    }

    @Test
    public void testReadStudent() {
        repo.save(new Student(7L, "Anton", 17));
        Student savedStudent = repo.findById(7L).get();
        assertEquals("Anton", savedStudent.getName());
        assertEquals(17, savedStudent.getTestScore());
        repo.deleteAll();
    }

    @Test
    public void testDeleteStudent() {
        repo.save(new Student(6L, "Ernst", 16));
        repo.deleteById(6L);
        Student savedStudent = repo.findById(6L).orElse(null);
        assertNull(savedStudent);
    }

    @Test
    public void testUdateStudent() {
        repo.save(new Student(4L, "Heinrich", 14));
        repo.save(new Student(4L, "Holger", 99));
        Student savedStudent = repo.findById(4L).get();
        assertEquals("Holger", savedStudent.getName());
        assertEquals(99, savedStudent.getTestScore());
        repo.deleteAll();
    }

}
