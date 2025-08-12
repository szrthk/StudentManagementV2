package com.szrthk.studentapi.student.repo;

import com.szrthk.studentapi.student.model.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepositery extends MongoRepository<StudentEntity, String> {
    
}
