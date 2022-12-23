package com.example.hw3_4.school.Service;


import com.example.hw3_4.school.Model.Faculty;
import com.example.hw3_4.school.Model.Student;
import com.example.hw3_4.school.repositories.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    Logger logger = LoggerFactory.getLogger(StudentService.class);


    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;

    }

    public Student createStudent(Student student) {
        logger.info("Was invoked method for create student");
        return studentRepo.save(student);
    }

    public Student findStudent(Long id) {
        logger.info("Was invoked method for find student");
        return studentRepo.findById(id).orElse(null);
    }

    public Student editStudent(Student student) {
        logger.debug("Was invoked method for edit student");
        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        logger.debug("Was invoked method for delete student");
        studentRepo.deleteById(id);
    }

    public Collection<Student> getAllStudents() {
        logger.debug("Was invoked method for getAllStudents");
        return studentRepo.findAll();
    }

    public Collection<Student> findStudentByAgeIsBetween(int min, int max) {
        logger.debug("Was invoked method for findStudentByAgeIsBetween");
        return studentRepo.findStudentByAgeIsBetween(min, max);
    }

    public Faculty findStudentByFaculty(Long id) {
        logger.debug("Was invoked method for findStudentByFaculty");
        return findStudent(id).getFaculty();
    }

    public Integer getStudentsByCategoryCount() {
        logger.debug("Was invoked method for getStudentsByCategoryCount");
        return studentRepo.getStudentsByCategoryCount();
    }

    public Double getStudentsByCategoryAvg() {
        logger.debug("Was invoked method for getStudentsByCategoryAvg");
        return studentRepo.getStudentsByCategoryAvg();
    }

    public List<Student> getStudentsByCategoryLimit() {
        logger.debug("Was invoked method for getStudentsByCategoryLimit");
        return studentRepo.getStudentsByCategoryLimit();
    }

    public  List<Student> getStudentsByName(String name){
        logger.debug("Was invoked method for getStudentsByName");
        return studentRepo.getStudentsByName(name);
    }
}
