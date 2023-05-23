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
import ums.coreclasses.Search;
import ums.coreclasses.Student;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_32_A_Update_Student_Controller implements Initializable {

    private String[] status = {"ACTIVATED", "DEACTIVATED"};
    private String[] sem = {"Spring", "Summer", "Fall"};
    
    @FXML
    private Button backButton;
    @FXML
    private TextField uniqueIdTF;
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
    private TextField dobMMTF;
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
    private TextField userTypeTF;
    @FXML
    private TextField userIdTF;
    @FXML
    private TextField passTF;
    @FXML
    private ChoiceBox<String> statusCB;
    @FXML
    private TextField enrollYearTF;
    @FXML
    private TextField currYearTF;
    @FXML
    private TextField totalCreditTF;
    @FXML
    private TextField currCreditTF;
    @FXML
    private TextField cgpaTF;
    @FXML
    private ChoiceBox<String> advisorCB;
    @FXML
    private ChoiceBox<String> deptCB;
    @FXML
    private TextField adDDTF;
    @FXML
    private TextField adMMTF;
    @FXML
    private TextField adYYYYTF;
    @FXML
    private ChoiceBox<String> enrollSenCB;
    @FXML
    private ChoiceBox<String> currSemCB;
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
        statusCB.setValue(status[0]);
        statusCB.getItems().addAll(status);
        
        enrollSenCB.setValue(sem[0]);
        enrollSenCB.getItems().addAll(sem);
        
        currSemCB.setValue(sem[0]);
        currSemCB.getItems().addAll(sem);

        advisorCB.getItems().addAll(UmsFile.instructorList.keySet());
        advisorCB.setValue(UmsFile.instructorList.keySet().iterator().next());
        
        deptCB.getItems().addAll(UmsFile.departmentList.keySet());
        deptCB.setValue(UmsFile.departmentList.keySet().iterator().next());
    }

    Student s = null;
    @FXML
    private void searchButtonHandler(ActionEvent event) {
        String id = searchTF.getText();
        s = UmsFile.studentList.get(id);
        
        uniqueIdTF.setText(s.getUniqueId());
        enrollSenCB.setValue(s.getEnrollmentSemester());
        currSemCB.setValue(s.getCurrentSemester());
        enrollYearTF.setText(s.getEnrollmentYear()+"");
        currYearTF.setText(s.getCurrentYear()+"");
        adYYYYTF.setText(s.getAdmissionDate().getYear()+"");
        adMMTF.setText(s.getAdmissionDate().getMonth()+"");
        adDDTF.setText(s.getAdmissionDate().getDate()+"");
        totalCreditTF.setText(s.getTotalCredit()+"");
        currCreditTF.setText(s.getCurrentCredit()+"");
        cgpaTF.setText(s.getCgpa()+"");
        advisorCB.setValue(s.getAdvisor().getUserId());
        deptCB.setValue(s.getDepartment().getCode());

        userTypeTF.setText(s.getUserType());
        userIdTF.setText(s.getUserId());
        passTF.setText(s.getUserPassword());
        statusCB.setValue(s.getUserStatus());

        firstNameTF.setText(s.getFirstName());
        lastNameTF.setText(s.getLastName());
        fathersNameTF.setText(s.getFathersName());
        mothersNameTF.setText(s.getMothersName());
        dobYYYYTF.setText(s.getDateOfBirth().getYear()+"");
        dobMMTF.setText(s.getDateOfBirth().getMonth()+"");
        dobDDTF.setText(s.getDateOfBirth().getDate()+"");
        bloodGroupTF.setText(s.getBloodGroup());
        nationalityTF.setText(s.getNationality());
        religionTF.setText(s.getReligion());
        addressTF.setText(s.getAddress());
        phoneTF.setText(s.getPhone());
        emailTF.setText(s.getEmail());
        
    }

    @FXML
    private void updateButtonHandler(ActionEvent event) throws IOException {
        s.setEnrollmentSemester(enrollSenCB.getValue());
        s.setCurrentSemester(currSemCB.getValue());
        s.setEnrollmentYear(Integer.parseInt(enrollYearTF.getText()));
        s.setCurrentYear(Integer.parseInt(currYearTF.getText()));
        s.setAdmissionDate(new Date(
                                    Integer.parseInt(adYYYYTF.getText()),
                                    Integer.parseInt(adMMTF.getText()),
                                    Integer.parseInt(adDDTF.getText())
        ));
        s.setTotalCredit(Float.parseFloat(totalCreditTF.getText()));
        s.setCurrentCredit(Float.parseFloat(currCreditTF.getText()));
        s.setCgpa(Float.parseFloat(cgpaTF.getText()));
        s.setAdvisor(Search.searchInstructorById(advisorCB.getValue()));
        s.setDepartment(Search.searchDepartmentByCode(deptCB.getValue()));
        s.setUserType(userTypeTF.getText());
        s.setUserId(userIdTF.getText());
        s.setUserPassword(passTF.getText());
        s.setUserStatus(statusCB.getValue());
        s.setFirstName(firstNameTF.getText());
        s.setLastName(lastNameTF.getText());
        s.setFathersName(fathersNameTF.getText());
        s.setMothersName(mothersNameTF.getText());
        s.setDateOfBirth(new Date(
                                    Integer.parseInt(dobYYYYTF.getText()),
                                    Integer.parseInt(dobMMTF.getText()),
                                    Integer.parseInt(dobDDTF.getText())
        ));
        s.setBloodGroup(bloodGroupTF.getText());
        s.setNationality(nationalityTF.getText());
        s.setReligion(religionTF.getText());
        s.setAddress(addressTF.getText());
        s.setPhone(phoneTF.getText());
        s.setEmail(emailTF.getText());
        
        ActionEvent ev = new ActionEvent();
        backButtonHandler(ev);
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        
        backButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_5_A_Student.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
}
