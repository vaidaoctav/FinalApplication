package com.example.finalapplication;

import com.example.finalapplication.domain.Student;
import com.example.finalapplication.repository.StudentRepository;
import com.example.finalapplication.service.StudentService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentServiceTest {

    @Test
    public void testFindAll() {
        StudentRepository studentRepository = mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);

        Student student = new Student("John", "Doe", LocalDate.of(2000, 1, 1));
        when(studentRepository.findAll()).thenReturn(Collections.singletonList(student));

        List<Student> students = studentService.findAll();

        assertEquals(1, students.size());
        assertEquals(student, students.get(0));
    }

    // Add more test methods for other service operations if necessary
}
