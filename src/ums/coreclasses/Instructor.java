package ums.coreclasses;

import ums.abstructclasses.User;
import java.util.Date;
import java.util.HashMap;

public class Instructor extends User{
    
    //private String  type;
    private String  designation;
    private double  salary;
    private boolean isChairperson;
    private String  enrollmentSemester;
    private int     enrollmentYear;
    private Date    joinDate;
    //private String  status;
    
    private Department department;
    HashMap<String, Course> listOfCurrentCourses = new HashMap<>();
    HashMap<String, Student> listOfAdvisees = new HashMap<>();

    public Instructor() {
        super();
    }
    
    public Instructor(String     enrollmentSemester,
                      int        enrollmentYear) {
        super();
        this.enrollmentSemester = enrollmentSemester;
        this.enrollmentYear = enrollmentYear;
    }
    
    public Instructor(//String     type,
                      String     designation,
                      double     salary,
                      boolean    isChairperson,
                      String     enrollmentSemester,
                      int        enrollmentYear,
                      Date       joinDate,
                      //String     status,
                      String     department,
                      
                      String     userType,
                      String     userId,
                      String     userPassword,
                      String     userStatus,
                      
                      String     firstName,
                      String     lastName,
                      String     fathersName,
                      String     mothersName,
                      Date       dateOfBirth,
                      String     bloodGroup,
                      String     nationality,
                      String     religion,
                      String     address,
                      String     phone,
                      String     email) {
        
        super(userType,
              userId,
              userPassword,
              userStatus,
              firstName,
              lastName,
              fathersName,
              mothersName,
              dateOfBirth,
              bloodGroup,
              nationality,
              religion,
              address,
              phone,
              email);
        
        //this.type = type;
        this.designation = designation;
        this.salary = salary;
        this.isChairperson = isChairperson;
        this.enrollmentSemester = enrollmentSemester;
        this.enrollmentYear = enrollmentYear;
        this.joinDate = joinDate;
        //this.status = status;
        this.department = Search.searchDepartmentByCode(department);
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isIsChairperson() {
        return isChairperson;
    }

    public void setIsChairperson(boolean isChairperson) {
        this.isChairperson = isChairperson;
    }

    public String getEnrollmentSemester() {
        return enrollmentSemester;
    }

    public void setEnrollmentSemester(String enrollmentSemester) {
        this.enrollmentSemester = enrollmentSemester;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}//Instructor class ends
