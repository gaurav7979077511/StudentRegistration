package com.example.demo.Repository;

import com.example.demo.entity.StudentRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRegistrationRepository extends MongoRepository<StudentRegistration, String> {

}

