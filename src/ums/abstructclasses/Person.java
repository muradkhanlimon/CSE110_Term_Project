package ums.abstructclasses;

import java.util.Date;
import ums.coreclasses.Generator;

public abstract class Person {
    
    private String uniqueId;
    private String firstName;
    private String lastName;
    private String fathersName;
    private String mothersName;
    private Date   dateOfBirth;
    private String bloodGroup;
    private String nationality;
    private String religion;
    private String address;
    private String phone;
    private String email;

    public Person() {
        uniqueId = Generator.genUniqueId() + "";
    }

    
    public Person(String firstName,
                  String lastName,
                  String fathersName,
                  String mothersName,
                  Date   dateOfBirth,
                  String bloodGroup,
                  String nationality,
                  String religion,
                  String address,
                  String phone,
                  String email) {
        
        uniqueId = Generator.genUniqueId() + "";
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.nationality = nationality;
        this.religion = religion;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}//Person class ends
