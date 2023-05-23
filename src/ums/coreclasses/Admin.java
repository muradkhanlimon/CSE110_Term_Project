package ums.coreclasses;

import ums.abstructclasses.User;
import java.util.Date;

public class Admin extends User{
    
    private String type;
    private double salary;
    private Date   joinDate;
    private String status;
    
    public Admin(String type,
                 double salary,
                 Date   joinDate,
                 String status,
                 String userType,
                 String userId,
                 String userPassword,
                 String userStatus,
                 String firstName,
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
        
        this.type = type;
        this.salary = salary;
        this.joinDate = joinDate;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}//Admin class ends
