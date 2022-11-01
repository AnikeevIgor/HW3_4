package com.example.hw3_4.school.Service;


import com.example.hw3_4.school.Model.Faculty;
import com.example.hw3_4.school.repositories.FacultyRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class FacultyService {
    private final FacultyRepo facultyRepo;


    public FacultyService(FacultyRepo facultyRepo) {
        this.facultyRepo = facultyRepo;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    public Faculty findFaculty(Long id) {
        return facultyRepo.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepo.deleteById(id);
    }

    public Collection<Faculty> getAllFaculty() {
        return facultyRepo.findAll();
    }

    public Collection<Faculty> findFacultiesByColorIgnoreCase(String color) {
        return facultyRepo.findFacultiesByColorIgnoreCase(color);
    }

    // public Collection<Student> getStudentByFaculty(long id){
    //       return facultyRepo.findById(id)
    //               .map(Faculty::getStudents)
    //               .map(students->
    //                       students.stream()
    //                               .colletct(Collectors.toList()));
    // }
}
