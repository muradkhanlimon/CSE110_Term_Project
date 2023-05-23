/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ums.coreclasses.Generator;
import ums.coreclasses.Instructor;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_22_A_Update_Instructor_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField firstNameTF;
    @FXML
    private TextField lastNameTF;
    @FXML
    private TextField fathersNameTF;
    @FXML
    private TextField mothersNameTF;
    @FXML
    private TextField dobDDTF;
    @FXML
    private TextField dobMTF;
    @FXML
    private TextField dobYYYYTF;
    @FXML
    private TextField bloodGroupTF;
    @FXML
    private TextField nationalityTF;
    @FXML
    private TextField religionTF;
    @FXML
    private TextField addressTF;
    @FXML
    private TextField phoneTF;
    @FXML
    private TextField emailTF;
    @FXML
    private ChoiceBox<String> typeChoiceBox;
    private String[] userType = {"Instructor", "Chairperson"};
    @FXML
    private TextField userNameTF;
    @FXML
    private TextField userPassTF;
    @FXML
    private ChoiceBox<String> statusChoiceBox;
    private String[] status = {"ACTIVATED", "DEACTIVATED"};
    @FXML
    private TextField designationTF;
    @FXML
    private TextField salaryTF;
    @FXML
    private ChoiceBox<String> isCpChoiceBox;
    private String[] bool = {"True", "False"};
    @FXML
    private TextField enrollYearTF;
    @FXML
    private ChoiceBox<String> enrollSemChoiceBox;
    private String[] sem = {"Spring", "Summer", "Fall"};
    @FXML
    private TextField jdDDTF;
    @FXML
    private TextField jdMMTF;
    @FXML
    private TextField jdYYYYTF;
    @FXML
    private ChoiceBox<String> deptChoiceBox;
    @FXML
    private TextField searchTF;
    @FXML
    private Button searchButton;
    @FXML
    private Button updateButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeChoiceBox.setValue(userType[0]);
        typeChoiceBox.getItems().addAll(userType);
        
        statusChoiceBox.setValue(status[0]);
        statusChoiceBox.getItems().addAll(status);
        
        isCpChoiceBox.setValue(bool[0]);
        isCpChoiceBox.getItems().addAll(bool);
        
        enrollSemChoiceBox.setValue(sem[0]);
        enrollSemChoiceBox.getItems().addAll(sem);
        
        deptChoiceBox.getItems().addAll(UmsFile.departmentList.keySet());
        deptChoiceBox.setValue(UmsFile.departmentList.keySet().iterator().next());
    }
    
    Instructor i = null;
    
    @FXML
    private void searchButtonHandler(ActionEvent event) {
        String instructorId = searchTF.getText();
        
        i = UmsFile.instructorList.get(instructorId);
        
        
        firstNameTF.setText(i.getFirstName());
        lastNameTF.setText(i.getLastName());
        fathersNameTF.setText(i.getFathersName());
        mothersNameTF.setText(i.getMothersName());
        dobDDTF.setText(i.getDateOfBirth().getDate() + "");
        dobMTF.setText(i.getDateOfBirth().getMonth() + "");
        dobYYYYTF.setText(i.getDateOfBirth().getYear() + "");
        bloodGroupTF.setText(i.getBloodGroup());
        nationalityTF.setText(i.getNationality());
        religionTF.setText(i.getReligion());
        addressTF.setText(i.getAddress());
        phoneTF.setText(i.getPhone());
        emailTF.setText(i.getEmail());
        typeChoiceBox.setValue(i.getUserType());
        userNameTF.setText(i.getUserId());
        userPassTF.setText(i.getUserPassword());
        statusChoiceBox.setValue(i.getUserStatus());
        designationTF.setText(i.getDesignation());
        salaryTF.setText(i.getSalary()+"");
        isCpChoiceBox.setValue(i.isIsChairperson()+"");
        enrollSemChoiceBox.setValue(i.getEnrollmentSemester());
        enrollYearTF.setText(i.getEnrollmentYear()+"");
        jdDDTF.setText(i.getJoinDate().getDate() + "");
        jdMMTF.setText(i.getJoinDate().getMonth() + "");
        jdYYYYTF.setText(i.getJoinDate().getYear() + "");
        deptChoiceBox.setValue(i.getDepartment().getCode());
        
    }  
    
    @FXML
    private void updateButtonHandler(ActionEvent event) throws IOException {
        String     designation        = designationTF.getText();
        double     salary             = Double.parseDouble(salaryTF.getText());
        boolean    isChairperson      = Boolean.parseBoolean(isCpChoiceBox.getValue().toString());
        int        enrollmentYear     = Integer.parseInt(enrollYearTF.getText());
        String     enrollmentSemester = enrollSemChoiceBox.getValue().toString();
        //int        enrollmentYear =
        Date       joinDate           = new Date(
                                              Integer.parseInt(jdYYYYTF.getText()),
                                              Integer.parseInt(jdMMTF.getText()),
                                              Integer.parseInt(jdDDTF.getText())
                                                 );
        String     department         = deptChoiceBox.getValue().toString();

        String     userType           = typeChoiceBox.getValue().toString();
        //String     userId             = Generator.genInstructorId(enrollmentYear, enrollmentSemester);
        String     userPassword       = userPassTF.getText();
        String     userStatus         = statusChoiceBox.getValue().toString();

        String     firstName          = firstNameTF.getText();
        String     lastName           = lastNameTF.getText();
        String     fathersName        = fathersNameTF.getText();
        String     mothersName        = mothersNameTF.getText();
        Date       dateOfBirth        = new Date(
                                              Integer.parseInt(dobYYYYTF.getText()),
                                              Integer.parseInt(dobMTF.getText()),
                                              Integer.parseInt(dobDDTF.getText())
                                                );
        String     bloodGroup         = bloodGroupTF.getText();
        String     nationality        = nationalityTF.getText();
        String     religion           = religionTF.getText();
        String     address            = addressTF.getText();
        String     phone              = phoneTF.getText();
        String     email              = emailTF.getText();
        
        i.setDesignation(designation);
        i.setSalary(salary);
        i.setIsChairperson(isChairperson);
        i.setEnrollmentSemester(enrollmentSemester);
        i.setEnrollmentYear(enrollmentYear);
        i.setJoinDate(joinDate);
        i.setDepartment(UmsFile.departmentList.get(department));
        i.setUserType(userType);
        //i.setUserId(userId);
        i.setUserPassword(userPassword);
        i.setUserStatus(userStatus);
        i.setFirstName(firstName);
        i.setLastName(lastName);
        i.setFathersName(fathersName);
        i.setMothersName(mothersName);
        i.setDateOfBirth(dateOfBirth);
        i.setBloodGroup(bloodGroup);
        i.setNationality(nationality);
        i.setReligion(religion);
        i.setAddress(address);
        i.setPhone(phone);
        i.setEmail(email);
        
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev);
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        backButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_4_A_Instructor.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
    

    
}
