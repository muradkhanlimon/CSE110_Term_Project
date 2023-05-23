package ums.coreclasses;

import java.util.HashMap;

public class Section {
    
    private int    id;
    private int    sectionName;
    private String semester;
    private int    year;
    
    private Course course;
    private Instructor instructor;
    HashMap<String, Student> listOfStudents = new HashMap<>();

    public Section(int      id,
                   int      sectionName,
                   String   semester,
                   int      year,
                   String   course,
                   String   instructor) {
        this.id = id;
        this.sectionName = sectionName;
        this.semester = semester;
        this.year = year;
        this.course = Search.searchCourseByCode(course);
        this.instructor = Search.searchInstructorById(instructor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSectionName() {
        return sectionName;
    }
    
    public void setSectionName(int sectionName) {
        this.sectionName = sectionName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    public void addStudent(Student s) {
        listOfStudents.put(s.getUserId(), s);
    }
    
    public void removeStudent(Student s) {
        listOfStudents.remove(s.getUserId(), s);
    }
}//Section class ends
