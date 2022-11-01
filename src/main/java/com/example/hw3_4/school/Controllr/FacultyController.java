package com.example.hw3_4.school.Controllr;



import com.example.hw3_4.school.Model.Faculty;
import com.example.hw3_4.school.Service.FacultyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Faculty> getFacultyInfo(@PathVariable Long id){
        Faculty faculty = facultyService.findFaculty(id);
        if(faculty == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PostMapping
    public Faculty createFacultyInfo(@RequestBody Faculty faculty) {
        return facultyService.createFaculty(faculty);
    }

    @PutMapping
    public ResponseEntity<Faculty> editFaculty(@RequestBody Faculty faculty) {
        Faculty faculty1 = facultyService.editFaculty(faculty);
        if(faculty1==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(faculty1);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteFaculty(@PathVariable Long id) {
         facultyService.deleteFaculty(id);
         return ResponseEntity.ok().build();
    }
  //  @GetMapping
  //  public ResponseEntity<Collection<Faculty>> getAllFaculty(){
  //      return  ResponseEntity.ok(facultyService.getAllFaculty());
  //  }

    @GetMapping(params = "color")
    public ResponseEntity<Collection<Faculty>> findFacultiesByColorIgnoreCase(@RequestParam String color) {
        return  ResponseEntity.ok(facultyService.findFacultiesByColorIgnoreCase(color));
    }
 //  @GetMapping("/{id}/students")
 //  public ResponseEntity<Collection<Student>> getStudentsByFaculty(@PathVariable long id){
 //      return  ResponseEntity.ok(facultyService.getStudentsByfaculty(id));
 //  }
}
