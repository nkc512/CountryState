package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Instructor;
@Repository
public interface InstructorRepository extends MongoRepository<Instructor, Long>{

}
