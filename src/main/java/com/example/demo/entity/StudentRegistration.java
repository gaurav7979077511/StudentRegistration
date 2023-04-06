package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

@Document(collection = "StudentRegistration")
public class StudentRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String schoolId;
    private String title;
    private String fname;
    private String mname;
    private String lname;
    private String gender;
    private Date dateOfBirth;
    private String bloodGroup;
    private String category;
    private String religion;
    private boolean speciallyAbled;
    private String identificationMark;
    private String citizenship;
    private String ethnicity;
    private String email;
    private String phonenumber;
    private String emergencyContact;
    private Object address;
    private String studentPhotoLink;
    private List<IdDocument> ids;
    private List<String> languageProficiency;
    private List<Parent> parents;
    private Date registrationTimestamp;

    public StudentRegistration(String id, String schoolId, String title, String fname, String mname, String lname, String gender, Date dateOfBirth, String bloodGroup, String category, String religion, boolean speciallyAbled, String identificationMark, String citizenship, String ethnicity, String email, String phonenumber, String emergencyContact, Object address, String studentPhotoLink, List<IdDocument> ids, List<String> languageProficiency, List<Parent> parents, Date registrationTimestamp) {
        this.id = id;
        this.schoolId = schoolId;
        this.title = title;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.category = category;
        this.religion = religion;
        this.speciallyAbled = speciallyAbled;
        this.identificationMark = identificationMark;
        this.citizenship = citizenship;
        this.ethnicity = ethnicity;
        this.email = email;
        this.phonenumber = phonenumber;
        this.emergencyContact = emergencyContact;
        this.address = address;
        this.studentPhotoLink = studentPhotoLink;
        this.ids = ids;
        this.languageProficiency = languageProficiency;
        this.parents = parents;
        this.registrationTimestamp = registrationTimestamp;
    }

    public StudentRegistration() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean getSpeciallyAbled() {
        return speciallyAbled;
    }

    public void setSpeciallyAbled(boolean speciallyAbled) {
        this.speciallyAbled = speciallyAbled;
    }

    public String getIdentificationMark() {
        return identificationMark;
    }

    public void setIdentificationMark(String identificationMark) {
        this.identificationMark = identificationMark;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getStudentPhotoLink() {
        return studentPhotoLink;
    }

    public void setStudentPhotoLink(String studentPhotoLink) {
        this.studentPhotoLink = studentPhotoLink;
    }

    public List<IdDocument> getIds() {
        return ids;
    }

    public void setIds(List<IdDocument> ids) {
        this.ids = ids;
    }

    public List<String> getLanguageProficiency() {
        return languageProficiency;
    }

    public void setLanguageProficiency(List<String> languageProficiency) {
        this.languageProficiency = languageProficiency;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public Date getRegistrationTimestamp() {
        return registrationTimestamp;
    }

    public void setRegistrationTimestamp(Date registrationTimestamp) {
        this.registrationTimestamp = registrationTimestamp;
    }

    @Override
    public String toString() {
        return "StudentRegistration{" +
                "id='" + id + '\'' +
                ", schoolId='" + schoolId + '\'' +
                ", title='" + title + '\'' +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", category='" + category + '\'' +
                ", religion='" + religion + '\'' +
                ", speciallyAbled=" + speciallyAbled +
                ", identificationMark='" + identificationMark + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", address=" + address +
                ", studentPhotoLink='" + studentPhotoLink + '\'' +
                ", ids=" + ids +
                ", languageProficiency=" + languageProficiency +
                ", parents=" + parents +
                ", registrationTimestamp=" + registrationTimestamp +
                '}';
    }
}



