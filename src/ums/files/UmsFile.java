package ums.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import ums.coreclasses.Admin;
import ums.coreclasses.Classroom;
import ums.coreclasses.Course;
import ums.coreclasses.Department;
import ums.coreclasses.Generator;
import ums.coreclasses.Instructor;
import ums.coreclasses.Section;
import ums.coreclasses.Student;
import ums.coreclasses.Timeslot;

public class UmsFile {
    
    public static HashMap<String,  Admin>      adminList         = new HashMap<>();
    public static HashMap<String,  Instructor> instructorList    = new HashMap<>();
    public static HashMap<String,  Student>    studentList       = new HashMap<>();
    public static HashMap<String,  Department> departmentList    = new HashMap<>();
    public static HashMap<String,  Course>     courseList        = new HashMap<>();
    public static HashMap<Integer, Section>    sectionList       = new HashMap<>();
    public static HashMap<Integer, Classroom>  classroomList     = new HashMap<>();
    public static HashMap<Integer, Timeslot>   timeslotList      = new HashMap<>();
    
    private static final String[] fileName = {
        "Generator.txt",
        "Admin.txt",
        "Department.txt",
        "Timeslot.txt",
        "Classroom.txt",
        "Course.txt",
        "Instructor.txt",
        "Student.txt",
        "Section.txt"
    };
    
    //private static String directoryPath = "C:\\Users\\LIMON\\Documents\\NetBeansProjects\\UMS_V1\\src\\ums\\files";
    //private static String directoryPath = "E:\\umsfiles";
    
    public static void initialize() throws IOException {
        for(String f : fileName) {
            //File file = new File(directoryPath, f);
            File file = new File( f);
            if (!file.exists()){
                try {
                    file.createNewFile();
                    /*throw new IOException("File not created." +
                                          "IOException");*/
                } catch(IOException e) {
                    System.out.println(e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                    switch (f) {
                        case "Generator.txt":
                                    FileReader fileReader10 = new FileReader(file);
                                    BufferedReader bufferedReader10 = new BufferedReader(fileReader10);
                                    String line10;
                                    while((line10 = bufferedReader10.readLine()) != null){
                                        String[] data = line10.split(";");
                                        
                                        long uniqueId       = Long.parseLong(data[0]);
                                        int adminSerial     = Integer.parseInt(data[1]);
                                        int instructorSerial= Integer.parseInt(data[2]);
                                        int studentSerial   = Integer.parseInt(data[3]);
                                        int staffSerial     = Integer.parseInt(data[4]);
                                        int sectionSerial   = Integer.parseInt(data[5]);
                                        int classroomSerial = Integer.parseInt(data[6]);
                                        int timeslotSerial  = Integer.parseInt(data[7]);
                                        
                                        Generator.setUniqueId(uniqueId);
                                        Generator.setAdminSerial(adminSerial);
                                        Generator.setInstructorSerial(instructorSerial);
                                        Generator.setStudentSerial(studentSerial);
                                        Generator.setStaffSerial(staffSerial);
                                        Generator.setSectionSerial(sectionSerial);
                                        Generator.setClassroomSerial(classroomSerial);
                                        Generator.setTimeslotSerial(timeslotSerial);
                                        
                                    }//while ends
                            break;
                        case "Admin.txt":
                                    FileReader fileReader = new FileReader(file);
                                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                                    String line;
                                    while((line = bufferedReader.readLine()) != null){
                                        String[] data = line.split(";");
                                        String uniqueId     = data[0];
                                        String type         = data[1];
                                        double salary       = Double.parseDouble(data[2]);
                                        Date   joinDate     = new Date(Long.parseLong(data[3]));
                                        String status       = data[4];
                                        String userType     = data[5];
                                        String userId       = data[6];
                                        String userPassword = data[7];
                                        String userStatus   = data[8];
                                        String firstName    = data[9];
                                        String lastName     = data[10];
                                        String fathersName  = data[11];
                                        String mothersName  = data[12];
                                        Date   dateOfBirth  = new Date (Long.parseLong(data[13]));
                                        String bloodGroup   = data[14];
                                        String nationality  = data[15];
                                        String religion     = data[16];
                                        String address      = data[17];
                                        String phone        = data[18];
                                        String email        = data[19];
                                        
                                        Admin a = new Admin(type,
                                                            salary,
                                                            joinDate,
                                                            status,
                                                            userType,
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
                                        a.setUniqueId(uniqueId);
                                        adminList.put(userId, a);
                                    }//while ends
                            break;
                        case "Instructor.txt":
                                    FileReader fileReader1 = new FileReader(file);
                                    BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

                                    String line1;
                                    while((line1 = bufferedReader1.readLine()) != null){
                                        String[] data = line1.split(";");
                                        
                                        //String  type               = data[0];
                                        String  designation        = data[0];
                                        double  salary             = Double.parseDouble(data[1]);
                                        boolean isChairperson      = Boolean.parseBoolean(data[2]);
                                        String  enrollmentSemester = data[3];
                                        int     enrollmentYear     = Integer.parseInt(data[4]);
                                        Date    joinDate           = new Date(Long.parseLong(data[5]));
                                        //String  status             = data[7];
                                        String  department         = data[6];
                                        
                                        String  userType           = data[7];
                                        String  userId             = data[8];
                                        String  userPassword       = data[9];
                                        String  userStatus         = data[10];
                                        
                                        String  firstName          = data[11];
                                        String  lastName           = data[12];
                                        String  fathersName        = data[13];
                                        String  mothersName        = data[14];
                                        Date    dateOfBirth        = new Date (Long.parseLong(data[15]));
                                        String  bloodGroup         = data[16];
                                        String  nationality        = data[17];
                                        String  religion           = data[18];
                                        String  address            = data[19];
                                        String  phone              = data[20];
                                        String  email              = data[21];
                                        
                                        Instructor i = new Instructor(
                                                            //type,
                                                            designation,                                                
                                                            salary,
                                                            isChairperson,
                                                            enrollmentSemester,
                                                            enrollmentYear,
                                                            joinDate,
                                                            //status,
                                                            department,
                                                            userType,
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
                                        instructorList.put(userId, i);
                                    }//while ends
                            break;
                        case "Student.txt":
                                    FileReader fileReader2 = new FileReader(file);
                                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

                                    String line2;
                                    while((line2 = bufferedReader2.readLine()) != null){
                                        String[] data = line2.split(";");
                                        
                                        String  enrollmentSemester = data[0];
                                        String  currentSemester    = data[1];
                                        int     enrollmentYear     = Integer.parseInt(data[2]);
                                        int     currentYear        = Integer.parseInt(data[3]);
                                        Date    admissionDate      = new Date(Long.parseLong(data[4]));
                                        float   totalCredit        = Float.parseFloat(data[5]);
                                        float   currentCredit      = Float.parseFloat(data[6]);
                                        float   cgpa               = Float.parseFloat(data[7]);
                                        //String  status             = data[8];
                                        String  advisorId          = data[8];
                                        String  department         = data[9];
                                        String  userType           = data[10];
                                        String  userId             = data[11];
                                        String  userPassword       = data[12];
                                        String  userStatus         = data[13];
                                        String  firstName          = data[14];
                                        String  lastName           = data[15];
                                        String  fathersName        = data[16];
                                        String  mothersName        = data[17];
                                        Date    dateOfBirth        = new Date (Long.parseLong(data[18]));
                                        String  bloodGroup         = data[19];
                                        String  nationality        = data[20];
                                        String  religion           = data[21];
                                        String  address            = data[22];
                                        String  phone              = data[23];
                                        String  email              = data[24];
                                        
                                        Student s = new Student(
                                                            enrollmentSemester,
                                                            currentSemester,
                                                            enrollmentYear,
                                                            currentYear,
                                                            admissionDate,
                                                            totalCredit,
                                                            currentCredit,
                                                            cgpa,
                                                            //status,
                                                            advisorId,
                                                            department,
                                                            userType,
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
                                        studentList.put(userId, s);
                                    }//while ends
                            break;
                        case "Department.txt":
                                    FileReader fileReader4 = new FileReader(file);
                                    BufferedReader bufferedReader4 = new BufferedReader(fileReader4);

                                    String line4;
                                    while((line4 = bufferedReader4.readLine()) != null){
                                        String[] data = line4.split(";");
                                        
                                        String  id       = data[0];
                                        String  code     = data[1];
                                        String  fullname = data[2];
                                        double  budget   = Double.parseDouble(data[3]);
                                        String  building = data[4];
                                        
                                        Department dept  = new Department(
                                                            id,
                                                            code,
                                                            fullname,
                                                            budget,
                                                            building);
                                        
                                        departmentList.put(code, dept);
                                    }//while ends
                            break;
                        case "Course.txt":
                                    FileReader fileReader5 = new FileReader(file);
                                    BufferedReader bufferedReader5 = new BufferedReader(fileReader5);

                                    String line5;
                                    while((line5 = bufferedReader5.readLine()) != null){
                                        String[] data = line5.split(";");
                                        
                                        String courseCode       = data[0];
                                        String courseTitle      = data[1];
                                        float  courseCredit     = Float.parseFloat(data[2]);
                                        float  courseCreditHour = Float.parseFloat(data[3]);
                                        //String prerequisite     = data[4];
                                        String department       = data[4];
                                        
                                        Course course  = new Course(
                                                            courseCode,
                                                            courseTitle,
                                                            courseCredit,
                                                            courseCreditHour,
                                                            //prerequisite,
                                                            department);
                                        
                                        courseList.put(courseCode, course);
                                    }//while ends
                            break;
                        case "Section.txt":
                                    FileReader fileReader6 = new FileReader(file);
                                    BufferedReader bufferedReader6 = new BufferedReader(fileReader6);

                                    String line6;
                                    while((line6 = bufferedReader6.readLine()) != null){
                                        String[] data = line6.split(";");
                                        
                                        int     id              = Integer.parseInt(data[0]);
                                        int     sectionName     = Integer.parseInt(data[1]);
                                        String  semester        = data[2];
                                        int     year            = Integer.parseInt(data[3]);
                                        String  course          = data[4];
                                        String  instructor      = data[5];
                                        
                                        Section section  = new Section(
                                                            id,
                                                            sectionName,
                                                            semester,
                                                            year,
                                                            course,
                                                            instructor);
                                        
                                        sectionList.put(id, section);
                                    }//while ends
                            break;
                        case "Classroom.txt":
                                    FileReader fileReader7 = new FileReader(file);
                                    BufferedReader bufferedReader7 = new BufferedReader(fileReader7);

                                    String line7;
                                    while((line7 = bufferedReader7.readLine()) != null){
                                        String[] data = line7.split(";");
                                        
                                        int     id          = Integer.parseInt(data[0]);
                                        int     roomNumber  = Integer.parseInt(data[1]);
                                        String  building    = data[2];
                                        int     capacity    = Integer.parseInt(data[3]);
                                        
                                        Classroom classroom  = new Classroom(
                                                            id,
                                                            building,
                                                            roomNumber,
                                                            capacity);
                                        
                                        classroomList.put(id, classroom);
                                    }//while ends
                            break;
                        case "Timeslot.txt":
                                    FileReader fileReader8 = new FileReader(file);
                                    BufferedReader bufferedReader8 = new BufferedReader(fileReader8);

                                    String line8;
                                    while((line8 = bufferedReader8.readLine()) != null){
                                        String[] data = line8.split(";");
                                        
                                        int     id          = Integer.parseInt(data[0]);
                                        String  day         = data[1];
                                        int     startHour   = Integer.parseInt(data[2]);
                                        int     startMin    = Integer.parseInt(data[3]);
                                        int     endHour     = Integer.parseInt(data[4]);
                                        int     endMin      = Integer.parseInt(data[5]);
                                        
                                        Timeslot ts  = new Timeslot(
                                                            id,
                                                            day,
                                                            startHour,
                                                            startMin,
                                                            endHour,
                                                            endMin);
                                        
                                        timeslotList.put(id, ts);
                                    }//while ends
                            break;
                    }//switch ends
            }//else ends
        }//for loop ends
    }//initialize() ends
    public static void saveAndClose() throws IOException {
        for(String f : fileName) {
            //String path = directoryPath + "\\" + f;
            //System.out.println("Attempting to delete file: " + file.getAbsolutePath());
            try {
            //File file = new File(directoryPath, f);
            File file = new File( f);
                //System.out.println("Attempting to delete file: " + file.getAbsolutePath());
                //if (
                        file.delete();
//){
                    //System.out.println("File deleted successfully.");
                    file.createNewFile();
                    writeOnFile(file.getName());
//                } else {
//                    System.out.println("Failed to delete file.");
//                }
            } catch (Exception e) {
                System.err.println("Error deleting file: " + e.getMessage());
            }
//            if (file.delete()){
//                try {
//                    //file.delete();
//                    System.out.println("File Deleted");
//                    //file.createNewFile();
//                    //writeOnFile(file.getName());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            } else {
//                System.out.println("File not deleted");
//            }
        }//for ends
    }//saveAndClose() ends
    
    public static void writeOnFile(String fileName) {
        switch (fileName) {
            case "Generator.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        w.print(Generator.getUniqueId() + ";" +
                                                Generator.getAdminSerial() + ";" +
                                                Generator.getInstructorSerial() + ";" +
                                                Generator.getStudentSerial() + ";" +
                                                Generator.getStaffSerial() + ";" +
                                                Generator.getSectionSerial() + ";" +
                                                Generator.getClassroomSerial() + ";" +
                                                Generator.getTimeslotSerial() + ";\n"
                                                );
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Admin.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<String, Admin> entry : adminList.entrySet()){
                                            w.print(
                                                    entry.getValue().getUniqueId() + ";" +
                                                    entry.getValue().getType() + ";" +
                                                    entry.getValue().getSalary() + ";" +
                                                    entry.getValue().getJoinDate().getTime() + ";" +
                                                    entry.getValue().getStatus() + ";" +
                                                    entry.getValue().getUserType() + ";" +
                                                    entry.getValue().getUserId() + ";" +
                                                    entry.getValue().getUserPassword() + ";" +
                                                    entry.getValue().getUserStatus() + ";" +
                                                    entry.getValue().getFirstName() + ";" +
                                                    entry.getValue().getLastName() + ";" +
                                                    entry.getValue().getFathersName() + ";" +
                                                    entry.getValue().getMothersName() + ";" +
                                                    entry.getValue().getDateOfBirth().getTime() + ";" +
                                                    entry.getValue().getBloodGroup() + ";" +
                                                    entry.getValue().getNationality() + ";" +
                                                    entry.getValue().getReligion() + ";" +
                                                    entry.getValue().getAddress() + ";" +
                                                    entry.getValue().getPhone() + ";" +
                                                    entry.getValue().getEmail() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Instructor.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<String, Instructor> entry : instructorList.entrySet()){
                                            w.print(
                                                    //entry.getValue().getType() + ";" +
                                                    entry.getValue().getDesignation() + ";" +
                                                    entry.getValue().getSalary() + ";" +
                                                    entry.getValue().isIsChairperson() + ";" +
                                                    entry.getValue().getEnrollmentSemester() + ";" +
                                                    entry.getValue().getEnrollmentYear() + ";" +
                                                    entry.getValue().getJoinDate().getTime() + ";" +
                                                    //entry.getValue().getStatus() + ";" +
                                                            
                                                    entry.getValue().getDepartment().getCode() + ";" +
                                                            
                                                    entry.getValue().getUserType() + ";" +
                                                    entry.getValue().getUserId() + ";" +
                                                    entry.getValue().getUserPassword() + ";" +
                                                    entry.getValue().getUserStatus() + ";" +
                                                    entry.getValue().getFirstName() + ";" +
                                                    entry.getValue().getLastName() + ";" +
                                                    entry.getValue().getFathersName() + ";" +
                                                    entry.getValue().getMothersName() + ";" +
                                                    entry.getValue().getDateOfBirth().getTime() + ";" +
                                                    entry.getValue().getBloodGroup() + ";" +
                                                    entry.getValue().getNationality() + ";" +
                                                    entry.getValue().getReligion() + ";" +
                                                    entry.getValue().getAddress() + ";" +
                                                    entry.getValue().getPhone() + ";" +
                                                    entry.getValue().getEmail() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Student.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<String, Student> entry : studentList.entrySet()){
                                            w.print(
                                                    entry.getValue().getEnrollmentSemester() + ";" +
                                                    entry.getValue().getCurrentSemester() + ";" +
                                                    entry.getValue().getEnrollmentYear() + ";" +
                                                    entry.getValue().getCurrentYear() + ";" +
                                                    entry.getValue().getAdmissionDate().getTime() + ";" +
                                                    entry.getValue().getTotalCredit() + ";" +
                                                    entry.getValue().getCurrentCredit() + ";" +
                                                    entry.getValue().getCgpa() + ";" +
                                                    //entry.getValue().getStatus() + ";" +
                                                            
                                                    entry.getValue().getAdvisor().getUserId() + ";" +
                                                    entry.getValue().getDepartment().getCode() + ";" +
                                                            
                                                    entry.getValue().getUserType() + ";" +
                                                    entry.getValue().getUserId() + ";" +
                                                    entry.getValue().getUserPassword() + ";" +
                                                    entry.getValue().getUserStatus() + ";" +
                                                    entry.getValue().getFirstName() + ";" +
                                                    entry.getValue().getLastName() + ";" +
                                                    entry.getValue().getFathersName() + ";" +
                                                    entry.getValue().getMothersName() + ";" +
                                                    entry.getValue().getDateOfBirth().getTime() + ";" +
                                                    entry.getValue().getBloodGroup() + ";" +
                                                    entry.getValue().getNationality() + ";" +
                                                    entry.getValue().getReligion() + ";" +
                                                    entry.getValue().getAddress() + ";" +
                                                    entry.getValue().getPhone() + ";" +
                                                    entry.getValue().getEmail() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Department.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<String, Department> entry : departmentList.entrySet()){
                                            w.print(
                                                    entry.getValue().getId() + ";" +
                                                    entry.getValue().getCode() + ";" +
                                                    entry.getValue().getFullName() + ";" +
                                                    entry.getValue().getBudget() + ";" +
                                                    entry.getValue().getBuilding() + ";\n" 
                                                    
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Course.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<String, Course> entry : courseList.entrySet()){
                                            w.print(
                                                    entry.getValue().getCourseCode() + ";" +
                                                    entry.getValue().getCourseTitle() + ";" +
                                                    entry.getValue().getCourseCredit() + ";" +
                                                    entry.getValue().getCourseCreditHour() + ";" +
                                                            
                                                    //entry.getValue().getPrerequisite().getCourseCode() + ";" +
                                                    entry.getValue().getDepartment().getCode() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Section.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<Integer, Section> entry : sectionList.entrySet()){
                                            w.print(
                                                    entry.getValue().getId() + ";" +
                                                    entry.getValue().getSectionName() + ";" +
                                                    entry.getValue().getSemester() + ";" +
                                                    entry.getValue().getYear() + ";" +
                                                            
                                                    entry.getValue().getCourse().getCourseCode() + ";" +
                                                    entry.getValue().getInstructor().getUserId() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Classroom.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<Integer, Classroom> entry : classroomList.entrySet()){
                                            w.print(
                                                    entry.getValue().getId() + ";" +
                                                    entry.getValue().getRoomNumber() + ";" +
                                                    entry.getValue().getBuilding() + ";" +
                                                    entry.getValue().getCapacity() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
            case "Timeslot.txt":
                                    try (PrintWriter w = new PrintWriter(new FileWriter(fileName)))
                                    {
                                        //PrintWriter w = new PrintWriter(fileName);
                                        for(Map.Entry<Integer, Timeslot> entry : timeslotList.entrySet()){
                                            w.print(
                                                    entry.getValue().getId() + ";" +
                                                    entry.getValue().getDay() + ";" +
                                                    entry.getValue().getStartTime().getHour() + ";" +
                                                    entry.getValue().getStartTime().getMinute() + ";" +
                                                    entry.getValue().getEndTime().getHour() + ";" +
                                                    entry.getValue().getEndTime().getMinute() + ";\n"
                                                   );
                                        }
                                        w.close();
                                        System.out.println("Successfully wrote to " + fileName);
                                    } catch (IOException e) {
                                        System.out.println("An error occurred while writing to " + fileName);
                                        e.printStackTrace();
                                    }
                break;
        }
    }
}//File class ends