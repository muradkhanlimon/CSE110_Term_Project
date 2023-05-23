package ums.coreclasses;

import ums.abstructclasses.User;
import java.util.Date;
import java.util.HashMap;

public class Student extends User{
    
    private String enrollmentSemester;
    private String currentSemester;
    private int    enrollmentYear;
    private int    currentYear;
    private Date   admissionDate;
    private float  totalCredit;
    private float  currentCredit;
    private float  cgpa;
    //private String status;
    
    private Instructor advisor;
    private Department department;
    HashMap<Integer, Section> listOfCurrentCourses = new HashMap<>();

    public Student() {
        super();
    }
    
    public Student(String     enrollmentSemester,
                   int        enrollmentYear) {
        super();
        this.enrollmentSemester = enrollmentSemester;
        this.enrollmentYear = enrollmentYear;
    }
    
    
    public Student(String     enrollmentSemester,
                   String     currentSemester,
                   int        enrollmentYear,
                   int        currentYear,
                   Date       admissionDate,
                   float      totalCredit,
                   float      currentCredit,
                   float      cgpa,
                   //String     status,
                   String     advisorId,
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
        
        this.enrollmentSemester = enrollmentSemester;
        this.currentSemester = currentSemester;
        this.enrollmentYear = enrollmentYear;
        this.currentYear = currentYear;
        this.admissionDate = admissionDate;
        this.totalCredit = totalCredit;
        this.currentCredit = currentCredit;
        this.cgpa = cgpa;
        //this.status = status;
        this.advisor = Search.searchInstructorById(advisorId);
        this.department = Search.searchDepartmentByCode(department);
    }

    public String getEnrollmentSemester() {
        return enrollmentSemester;
    }

    public void setEnrollmentSemester(String enrollmentSemester) {
        this.enrollmentSemester = enrollmentSemester;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public float getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(float totalCredit) {
        this.totalCredit = totalCredit;
    }

    public float getCurrentCredit() {
        return currentCredit;
    }

    public void setCurrentCredit(float currentCredit) {
        this.currentCredit = currentCredit;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public Instructor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Instructor advisor) {
        this.advisor = advisor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
//    public String genStudentId() {
//        return "S" + "-" +
//                enrollmentYear + "-" +
//                Generator.genSemesterCode(enrollmentSemester) + "-" +
//                Generator.genStudentSerial();
//    }
    
    public void addSection(Section sec) {
        listOfCurrentCourses.put(sec.getId(), sec);
    }
    
    public void removeSection(Section sec) {
        listOfCurrentCourses.remove(sec.getId(), sec);
    }
}//Student class ends
