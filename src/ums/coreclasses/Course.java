package ums.coreclasses;

public class Course {
    private String courseCode;
    private String courseTitle;
    private float courseCredit;
    private float courseCreditHour;
    
    //private Course prerequisite;
    private Department department;

    public Course(String     courseCode,
                  String     courseTitle,
                  float      courseCredit,
                  float      courseCreditHour,
                  //String     prerequisite,
                  String     department) {
        
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
        this.courseCreditHour = courseCreditHour;
        //this.prerequisite = Search.searchCourseByCode(prerequisite);
        this.department = Search.searchDepartmentByCode(department);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public float getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(float courseCredit) {
        this.courseCredit = courseCredit;
    }

    public float getCourseCreditHour() {
        return courseCreditHour;
    }

    public void setCourseCreditHour(float courseCreditHour) {
        this.courseCreditHour = courseCreditHour;
    }

//    public Course getPrerequisite() {
//        return prerequisite;
//    }
//
//    public void setPrerequisite(Course prerequisite) {
//        this.prerequisite = prerequisite;
//    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
}//Course class ends
