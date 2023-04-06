/*
package com.example.demo.Controller;


import com.example.demo.entity.StudentRegistration;
import com.example.demo.Service.StudentRegistrationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.ArrayList;
import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentRegistrationController.class)
@ExtendWith(MockitoExtension.class)
public class StudentRegistrationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentRegistrationService service;

    @Test
    public void testCreateStudentRegistration() throws Exception {
        StudentRegistration studentRegistration = new StudentRegistration();
        studentRegistration.setSchoolId("123");
        studentRegistration.setTitle("Mr.");
        studentRegistration.setFname("John");
        studentRegistration.setMname("Doe");
        studentRegistration.setLname("Smith");
        studentRegistration.setGender("Male");
        studentRegistration.setDate_of_birth(new Date());
        studentRegistration.setBlood_group("AB+");
        studentRegistration.setCategory("General");
        studentRegistration.setReligion("Christianity");
        studentRegistration.setSpecially_abled(false);
        studentRegistration.setIdentification_mark("None");
        studentRegistration.setCitizenship("USA");
        studentRegistration.setEthnicity("White");
        studentRegistration.setEmail("john.doe@example.com");
        studentRegistration.setPhonenumber("1234567890");
        studentRegistration.setEmergency_contact("9876543210");
        studentRegistration.setAddress(new Object());
        studentRegistration.setStudent_photo_link("https://example.com/image.jpg");
        studentRegistration.setIds(new ArrayList<>());
        studentRegistration.setLanguage_proficiency(new ArrayList<>());
        studentRegistration.setParents(new ArrayList<>());
        studentRegistration.setRegistration_timestamp(new Date());

        when(service.createStudentRegistration(any(StudentRegistration.class))).thenReturn(studentRegistration);

        mockMvc.perform(post("/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"schoolId\":\"123\",\"title\":\"Mr.\",\"fname\":\"John\",\"mname\":\"Doe\",\"lname\":\"Smith\",\"gender\":\"Male\",\"dateOfBirth\":\"2022-04-05\",\"bloodGroup\":\"AB+\",\"category\":\"General\",\"religion\":\"Christianity\",\"speciallyAbled\":false,\"identificationMark\":\"None\",\"citizenship\":\"USA\",\"ethnicity\":\"White\",\"email\":\"john.doe@example.com\",\"phonenumber\":\"1234567890\",\"emergencyContact\":\"9876543210\",\"address\":{},\"studentPhotoLink\":\"https://example.com/image.jpg\",\"ids\":[],\"languageProficiency\":[],\"parents\":[],\"registrationTimestamp\":\"2022-04-05\"}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fname").value("John"))
                .andExpect(jsonPath("$.lname").value("Smith"));
    }

    // Add more test cases as needed
}
*/
