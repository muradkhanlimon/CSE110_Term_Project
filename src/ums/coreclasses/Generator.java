package ums.coreclasses;

public class Generator {
    private static long uniqueId;
    private static int adminSerial;
    private static int instructorSerial;
    private static int studentSerial;
    private static int staffSerial;
    private static int sectionSerial;
    private static int classroomSerial;
    private static int timeslotSerial;

    public static void setUniqueId(long uniqueId) {
        Generator.uniqueId = uniqueId;
    }

    public static void setAdminSerial(int adminSerial) {
        Generator.adminSerial = adminSerial;
    }

    public static void setInstructorSerial(int instructorSerial) {
        Generator.instructorSerial = instructorSerial;
    }

    public static void setStudentSerial(int studentSerial) {
        Generator.studentSerial = studentSerial;
    }

    public static void setStaffSerial(int staffSerial) {
        Generator.staffSerial = staffSerial;
    }

    public static void setSectionSerial(int sectionSerial) {
        Generator.sectionSerial = sectionSerial;
    }

    public static void setClassroomSerial(int classroomSerial) {
        Generator.classroomSerial = classroomSerial;
    }

    public static void setTimeslotSerial(int timeslotSerial) {
        Generator.timeslotSerial = timeslotSerial;
    }
    
    public static long getUniqueId() {
        return uniqueId;
    }

    public static int getAdminSerial() {
        return adminSerial;
    }

    public static int getInstructorSerial() {
        return instructorSerial;
    }

    public static int getStudentSerial() {
        return studentSerial;
    }
    
    public static String getToStringStudentSerial() {
        studentSerial++;
        if(studentSerial < 10) return "00" + studentSerial;
        else if(studentSerial < 100) return "0" + studentSerial;
        else return studentSerial + "";
    }

    public static int getStaffSerial() {
        return staffSerial;
    }

    public static int getSectionSerial() {
        return sectionSerial;
    }

    public static int getClassroomSerial() {
        return classroomSerial;
    }

    public static int getTimeslotSerial() {
        return timeslotSerial;
    }
    
    public static long genUniqueId() {
        return uniqueId++;
    }
    
    public static int genAdminSerial() {
        return adminSerial++;
    }
    
    public static int genInstructorSerial() {
        return instructorSerial++;
    }
    
    public static String genStudentSerial() {
        return getToStringStudentSerial();
    }
    
    public static int genStaffSerial() {
        return staffSerial++;
    }
    
    public static int genSectionSerial() {
        return sectionSerial++;
    }
    
    public static int genClassroomSerial() {
        return classroomSerial++;
    }
    
    public static int genTimeslotSerial() {
        return timeslotSerial++;
    }
    
    public static int genSemesterCode(String s) {
        if(s.equals("Spring")) return 1;
        else if(s.equals("Summer")) return 2;
        else return 3;
    }
    
    public static String genStudentId(int enrollmentYear, String enrollmentSemester, String deptId) {
        return "S" +
                enrollmentYear +
                Generator.genSemesterCode(enrollmentSemester) +
                deptId +
                Generator.genStudentSerial();
    }
    
    public static String genInstructorId(int enrollmentYear, String enrollmentSemester, String departmentCode) {
        return "I" +
                enrollmentYear +
                Generator.genSemesterCode(enrollmentSemester) +
                departmentCode +
                Generator.genStudentSerial();
    }
    
}//Generator class ends
