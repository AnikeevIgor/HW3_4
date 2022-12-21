package com.example.hw3_4.school.Service;


import com.example.hw3_4.school.Model.Faculty;
import com.example.hw3_4.school.Model.Student;
import com.example.hw3_4.school.repositories.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;


    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;

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

    public Faculty findStudentByFaculty(Long id) {
        return findStudent(id).getFaculty();
    }

    public Integer getStudentsByCategoryCount() {
        return studentRepo.getStudentsByCategoryCount();
    }

    public Double getStudentsByCategoryAvg() {
        return studentRepo.getStudentsByCategoryAvg();
    }

    public List<Student> getStudentsByCategoryLimit() {
        return studentRepo.getStudentsByCategoryLimit();
    }

    public  List<Student> getStudentsByName(String name){
        return studentRepo.getStudentsByName(name);
    }
}
