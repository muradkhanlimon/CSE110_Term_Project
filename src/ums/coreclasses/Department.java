package ums.coreclasses;

import java.util.HashMap;

public class Department {
    
    private String id;//60
    private String code;//CSE
    private String fullName;
    private double budget;
    private String building;
    
    
    HashMap<String, Course> listOfCourses = new HashMap<>();
    HashMap<String, Instructor> listOfInstructors = new HashMap<>();
    HashMap<String, Student> listOfStudents = new HashMap<>();

    public Department(String id,
                      String code,
                      String fullName,
                      double budget,
                      String building) {
        this.id = id;
        this.code = code;
        this.fullName = fullName;
        this.budget = budget;
        this.building = building;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void addCourse(Course c) {
        listOfCourses.put(c.getCourseCode(), c);
    }
    
    public void removeCourse(Course c) {
        listOfCourses.remove(c.getCourseCode(), c);
    }
    
    public void addInstructor(Instructor i) {
        listOfInstructors.put(i.getUserId(), i);
    }
    
    public void removeInstructor(Instructor i) {
        listOfInstructors.remove(i.getUserId(), i);
    }
    
    public void addStudent(Student s) {
        listOfStudents.put(s.getUserId(), s);
    }
    
    public void removeStudent(Student s) {
        listOfStudents.remove(s.getUserId(), s);
    }
}//Department class ends
