package com.OneToOne.service;

import com.OneToOne.model.Instructor;
import com.OneToOne.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructor(){
        return instructorRepository.findAll();
    }
}
