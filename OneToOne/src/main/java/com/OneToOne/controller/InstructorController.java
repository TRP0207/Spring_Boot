package com.OneToOne.controller;

import com.OneToOne.model.Instructor;
import com.OneToOne.repository.InstructorRepository;
import com.OneToOne.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/all")
    public ResponseEntity<List<Instructor>> getInstructors(){
        return ResponseEntity.ok(instructorService.getAllInstructor());
    }
}
