package com.example.lms.student.repository;

import com.example.lms.student.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, String> {
}
