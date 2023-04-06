package com.example.demo.Service;


import com.example.demo.Repository.StudentRegistrationRepository;
import com.example.demo.entity.StudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class StudentRegistrationService {
    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;

    public List<StudentRegistration> getAllStudentRegistrations() {
        return studentRegistrationRepository.findAll();
    }

    public Optional<StudentRegistration> getStudentRegistrationById(String id) {
        return studentRegistrationRepository.findById(id);
    }

    public StudentRegistration createStudentRegistration(StudentRegistration studentRegistration) {
        System.out.println("Printing Data"+studentRegistration);
        return studentRegistrationRepository.save(studentRegistration);
    }

    public Optional<StudentRegistration> updateStudentRegistrationById(String id, StudentRegistration updatedStudentRegistration) {
        Optional<StudentRegistration> studentRegistration = studentRegistrationRepository.findById(id);
        if (studentRegistration.isPresent()) {
            StudentRegistration existingStudentRegistration = studentRegistration.get();
            existingStudentRegistration.setSchoolId(updatedStudentRegistration.getSchoolId());
            existingStudentRegistration.setTitle(updatedStudentRegistration.getTitle());
            existingStudentRegistration.setFname(updatedStudentRegistration.getFname());
            existingStudentRegistration.setMname(updatedStudentRegistration.getMname());
            existingStudentRegistration.setLname(updatedStudentRegistration.getLname());
            existingStudentRegistration.setGender(updatedStudentRegistration.getGender());
            existingStudentRegistration.setDateOfBirth(updatedStudentRegistration.getDateOfBirth());
            existingStudentRegistration.setBloodGroup(updatedStudentRegistration.getBloodGroup());
            existingStudentRegistration.setCategory(updatedStudentRegistration.getCategory());
            existingStudentRegistration.setReligion(updatedStudentRegistration.getReligion());
            existingStudentRegistration.setSpeciallyAbled(updatedStudentRegistration.getSpeciallyAbled());
            existingStudentRegistration.setIdentificationMark(updatedStudentRegistration.getIdentificationMark());
            existingStudentRegistration.setCitizenship(updatedStudentRegistration.getCitizenship());
            existingStudentRegistration.setEthnicity(updatedStudentRegistration.getEthnicity());
            existingStudentRegistration.setEmail(updatedStudentRegistration.getEmail());
            existingStudentRegistration.setPhonenumber(updatedStudentRegistration.getPhonenumber());
            existingStudentRegistration.setEmergencyContact(updatedStudentRegistration.getEmergencyContact());
            existingStudentRegistration.setAddress(updatedStudentRegistration.getAddress());
            existingStudentRegistration.setStudentPhotoLink(updatedStudentRegistration.getStudentPhotoLink());
            existingStudentRegistration.setIds(updatedStudentRegistration.getIds());
            existingStudentRegistration.setLanguageProficiency(updatedStudentRegistration.getLanguageProficiency());
            existingStudentRegistration.setParents(updatedStudentRegistration.getParents());
            existingStudentRegistration.setRegistrationTimestamp(updatedStudentRegistration.getRegistrationTimestamp());

            studentRegistrationRepository.save(existingStudentRegistration);
        }
        return studentRegistration;
    }

    public boolean deleteStudentRegistrationById(String id) {
        studentRegistrationRepository.deleteById(id);
        if (studentRegistrationRepository.findById(id)==null)
        return true;
        else return false;
    }





    public List<StudentRegistration> getStudentRegistrationsBySchoolId(String schoolId) {
        return null;
    }
}

