/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
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
import ums.coreclasses.Student;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_33_A_Delete_Student_Controller implements Initializable {

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
    private Button deleteButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void deleteButtonHandler(ActionEvent event) throws IOException {
        UmsFile.studentList.remove(searchTF.getText());
        
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
