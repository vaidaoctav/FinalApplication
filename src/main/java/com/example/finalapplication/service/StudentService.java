package com.example.finalapplication.service;

import com.example.finalapplication.domain.Student;
import com.example.finalapplication.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Student with ID " + id + " not found"));
    }
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
