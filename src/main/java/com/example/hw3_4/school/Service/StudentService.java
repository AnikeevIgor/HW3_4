package com.example.hw3_4.school.Service;


import com.example.hw3_4.school.Model.Faculty;
import com.example.hw3_4.school.Model.Student;
import com.example.hw3_4.school.repositories.FacultyRepo;
import com.example.hw3_4.school.repositories.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    private final StudentRepo studentRepo;
    private final FacultyRepo facultyRepo;

    public StudentService(StudentRepo studentRepo, FacultyRepo facultyRepo) {
        this.studentRepo = studentRepo;
        this.facultyRepo = facultyRepo;
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findStudent(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Student editStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

    public Collection<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Collection<Student> findStudentByAgeIsBetween(int min, int max) {
        return studentRepo.findStudentByAgeIsBetween(min, max);
    }

       public Faculty findStudentByFaculty(Long id){
             return findStudent(id).getFaculty();
       }

}
