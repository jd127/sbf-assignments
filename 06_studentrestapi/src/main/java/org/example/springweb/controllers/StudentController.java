package org.example.springweb.controllers;

import java.util.List;
import org.example.springweb.model.Student;
import org.example.springweb.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable Long id) {
        return repo.findById(id).get();
    }

    @GetMapping("/students/")
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @RequestMapping(value = "/students/", method = { RequestMethod.PUT, RequestMethod.POST })
    public Student updateOrCreateStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
    }

}
