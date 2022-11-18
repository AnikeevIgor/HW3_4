package com.example.hw3_4.school.repositories;


import com.example.hw3_4.school.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Collection<Student> findStudentByAgeIsBetween(int min, int max);

   Student getById(Long studentId);

}
