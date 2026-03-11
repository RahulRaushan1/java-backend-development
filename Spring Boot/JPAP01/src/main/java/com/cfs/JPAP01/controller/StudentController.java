package com.cfs.JPAP01.controller;

import com.cfs.JPAP01.entity.Student;
import com.cfs.JPAP01.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo){
        this.studentRepo=studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id,@RequestBody Student student){
       Student s= studentRepo.findById(id)
               .orElseThrow(()->new RuntimeException("Student Not Found"));

       s.setName(student.getName());
       s.setEmail(student.getEmail());
       return studentRepo.save(s);
    }

    @PatchMapping
    public Student patchStudent(@RequestParam Long id,@RequestBody Student student){
        Student s=studentRepo.findById(id)
                .orElseThrow(() ->new RuntimeException("Student Not Found"));
        return studentRepo.save(student);
    }
}
