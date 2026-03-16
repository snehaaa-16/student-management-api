package com.sneha.studentmanagementapi.repository;

import com.sneha.studentmanagementapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}