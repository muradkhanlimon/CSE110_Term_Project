package ums.abstructclasses;

import java.util.Date;

public abstract class User extends Person{
    
    private String userType;
    private String userId;
    private String userPassword;
    private String userStatus;

    public User() {
        super();
    }

    
    public User(String userType,
                String userId,
                String userPassword,
                String userStatus,
                String firstName,
                String lastName,
                String fathersName,
                String mothersName,
                Date dateOfBirth,
                String bloodGroup,
                String nationality,
                String religion,
                String address,
                String phone,
                String email) {
        
        super(firstName,
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
        
        this.userType = userType;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userStatus = userStatus;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    
    
}//User class ends
