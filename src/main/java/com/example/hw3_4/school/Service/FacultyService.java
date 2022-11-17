package com.example.hw3_4.school.Service;


import com.example.hw3_4.school.Model.Faculty;
import com.example.hw3_4.school.repositories.FacultyRepo;
import com.example.hw3_4.school.repositories.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class FacultyService {
    private final FacultyRepo facultyRepo;
    private final StudentRepo studentRepo;


    public FacultyService(FacultyRepo facultyRepo, StudentRepo studentRepo) {
        this.facultyRepo = facultyRepo;
        this.studentRepo = studentRepo;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    public Faculty findFaculty(Long id) {
        return facultyRepo.findById(id).orElse(null);
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

    public Collection<Faculty> findFacultiesByColorIgnoreCaseOrNameIgnoreCase(String colorOrName) {
        return facultyRepo.findFacultiesByColorIgnoreCaseOrNameIgnoreCase(colorOrName,colorOrName);
    }

  //  public Collection<Student> getStudentByFaculty(long id){
  //        return facultyRepo.findById(id)
  //                .map(Faculty::getStudents)
  //                .map(students-> students.stream()
  //                        .collect(Collectors.toList()))
  //                                ;
  //  }
}
