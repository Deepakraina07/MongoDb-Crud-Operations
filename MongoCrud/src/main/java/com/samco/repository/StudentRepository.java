package com.samco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.student.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{

}
