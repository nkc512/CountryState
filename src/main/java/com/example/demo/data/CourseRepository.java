package com.example.demo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.data.Course;
@Repository
public interface CourseRepository extends MongoRepository<Course, Long>{
 List<Course> findByInstructorId(Long instructorId);
 Optional<Course> findByIdAndInstructorId(Long id, Long instructorId);
}