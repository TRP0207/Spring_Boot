package com.OneToOne.repository;

import com.OneToOne.model.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstructorRepository extends MongoRepository<Instructor, Long> {

}
