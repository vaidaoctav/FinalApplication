package com.example.finalapplication.repository;

import com.example.finalapplication.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
