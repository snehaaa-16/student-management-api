package com.sneha.studentmanagementapi.controller;

import com.sneha.studentmanagementapi.model.Student;
import com.sneha.studentmanagementapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }
}