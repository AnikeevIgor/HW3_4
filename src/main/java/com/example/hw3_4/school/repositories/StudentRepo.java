package com.example.hw3_4.school.repositories;


import com.example.hw3_4.school.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Collection<Student> findStudentByAgeIsBetween(int min, int max);

   Student getById(Long studentId);

   @Query(value = " select COUNT (*) from Student ", nativeQuery = true)
   Integer getStudentsByCategoryCount();

    @Query(value = " select avg(age) from student", nativeQuery = true)
    Double getStudentsByCategoryAvg();

    @Query(value = " select *from student order by id desc limit 5", nativeQuery = true)
    List<Student> getStudentsByCategoryLimit();

}
