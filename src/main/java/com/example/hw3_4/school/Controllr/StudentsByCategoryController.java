package com.example.hw3_4.school.Controllr;

import com.example.hw3_4.school.Model.Student;
import com.example.hw3_4.school.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsByCategoryController {
    private final StudentService studentService;

    public StudentsByCategoryController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students-by-categories-count")
   public Integer getStudentsByCategoryCount(){
        return studentService.getStudentsByCategoryCount();
    }

    @GetMapping("/students-by-categories-avg")
   public Double getStudentsByCategoryAvg(){
        return studentService.getStudentsByCategoryAvg();
    }

    @GetMapping("/students-by-categories-limit")
    public List<Student> getStudentsByCategoryLimit(){
        return studentService.getStudentsByCategoryLimit();
    }


}
