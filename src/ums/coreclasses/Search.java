package ums.coreclasses;

import ums.files.UmsFile;

public class Search extends UmsFile{
    
    public static Department searchDepartmentByCode(String code) {
        return UmsFile.departmentList.get(code);
    }
    
    public static Instructor searchInstructorById(String id) {
        return UmsFile.instructorList.get(id);
    }
    
    public static Course searchCourseByCode(String id) {
        return UmsFile.courseList.get(id);
    }
    
    public static Student searchStudentById(String id) {
        return UmsFile.studentList.get(id);
    }
    
    public static Section searchSectionById(int id) {
        return UmsFile.sectionList.get(id);
    }
}
