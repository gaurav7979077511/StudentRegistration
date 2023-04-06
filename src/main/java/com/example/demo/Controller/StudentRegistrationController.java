package com.example.demo.Controller;

import com.example.demo.Service.StudentRegistrationService;
import com.example.demo.entity.StudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/students")
public class StudentRegistrationController {

    @Autowired
    private StudentRegistrationService studentRegistrationService;

    @PostMapping
    public ResponseEntity<StudentRegistration> createStudentRegistration(@RequestBody StudentRegistration studentRegistration) {
        StudentRegistration createdStudentRegistration = studentRegistrationService.createStudentRegistration(studentRegistration);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudentRegistration);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentRegistration> getStudentRegistrationById(@PathVariable String id) {
        Optional<StudentRegistration> optionalStudentRegistration = studentRegistrationService.getStudentRegistrationById(id);
        return optionalStudentRegistration.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentRegistration> updateStudentRegistrationById(@PathVariable String id, @RequestBody StudentRegistration studentRegistration) {
        Optional<StudentRegistration> optionalStudentRegistration = studentRegistrationService.updateStudentRegistrationById(id, studentRegistration);
        return optionalStudentRegistration.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentRegistrationById(@PathVariable String id) {
        boolean deleted = studentRegistrationService.deleteStudentRegistrationById(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<StudentRegistration>> getAllStudentRegistrations() {
        List<StudentRegistration> studentRegistrations = studentRegistrationService.getAllStudentRegistrations();
        return ResponseEntity.ok(studentRegistrations);
    }

    @GetMapping(params = {"schoolId"})
    public ResponseEntity<List<StudentRegistration>> getStudentRegistrationsBySchoolId(@RequestParam String schoolId) {
        List<StudentRegistration> studentRegistrations = studentRegistrationService.getStudentRegistrationsBySchoolId(schoolId);
        return ResponseEntity.ok(studentRegistrations);
    }
}

