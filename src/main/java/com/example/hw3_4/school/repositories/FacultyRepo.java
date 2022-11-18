package com.example.hw3_4.school.repositories;

import com.example.hw3_4.school.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepo extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultiesByColorIgnoreCaseOrNameIgnoreCase(String color,String name);
    Faculty getById(Long facultyId);
}
