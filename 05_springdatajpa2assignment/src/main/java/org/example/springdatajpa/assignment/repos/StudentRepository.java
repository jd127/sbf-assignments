package org.example.springdatajpa.assignment.repos;

import org.example.springdatajpa.assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
