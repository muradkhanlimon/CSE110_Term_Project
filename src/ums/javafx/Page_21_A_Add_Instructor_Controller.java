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
public class Page_21_A_Add_Instructor_Controller implements Initializable {

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
    private Button createButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        typeChoiceBox.setValue(userType[0]);
        typeChoiceBox.getItems().addAll(userType);
        
        statusChoiceBox.setValue(status[0]);
        statusChoiceBox.getItems().addAll(status);
        
        isCpChoiceBox.setValue(bool[1]);
        isCpChoiceBox.getItems().addAll(bool);
        
        enrollSemChoiceBox.setValue(sem[0]);
        enrollSemChoiceBox.getItems().addAll(sem);
        
        deptChoiceBox.getItems().addAll(UmsFile.departmentList.keySet());
        deptChoiceBox.setValue(UmsFile.departmentList.keySet().iterator().next());
    }
    
    @FXML
    private void createButtonHandler(ActionEvent event) throws IOException {
        
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
        String     userId             = Generator.genInstructorId(enrollmentYear, enrollmentSemester, UmsFile.departmentList.get(department).getId());
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

        Instructor i = new Instructor (
                                          designation,
                                          salary,
                                          isChairperson,
                                          enrollmentSemester,
                                          enrollmentYear,
                                          joinDate,
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
                                          email                              
                                      );
        UmsFile.instructorList.put(userId, i);
        
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
    
}//Class ends
