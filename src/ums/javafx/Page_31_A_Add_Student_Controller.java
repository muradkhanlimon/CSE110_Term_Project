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
import ums.coreclasses.Student;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_31_A_Add_Student_Controller implements Initializable {
    
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
    private Button createButton;

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

    @FXML
    private void createButtonHandler(ActionEvent event) throws IOException {
        
        String     enrollmentSemester = enrollSenCB.getValue();
        String     currentSemester    = currSemCB.getValue();
        int        enrollmentYear     = Integer.parseInt(enrollYearTF.getText());
        int        currentYear        = Integer.parseInt(currYearTF.getText());
        Date       addmissionDate     = new Date(
                                              Integer.parseInt(adYYYYTF.getText()),
                                              Integer.parseInt(adMMTF.getText()),
                                              Integer.parseInt(adDDTF.getText())
                                                 );
        float      totalCredit        = Float.parseFloat(totalCreditTF.getText());
        float      currentCredit      = Float.parseFloat(currCreditTF.getText());
        float      cgpa               = Float.parseFloat(cgpaTF.getText());
        String     advisor            = advisorCB.getValue();
        String     department         = deptCB.getValue();

        String     userType           = userTypeTF.getText();
        String     userId             = Generator.genStudentId(enrollmentYear, enrollmentSemester, UmsFile.departmentList.get(department).getId());
        String     userPassword       = passTF.getText();
        String     userStatus         = statusCB.getValue().toString();

        String     firstName          = firstNameTF.getText();
        String     lastName           = lastNameTF.getText();
        String     fathersName        = fathersNameTF.getText();
        String     mothersName        = mothersNameTF.getText();
        Date       dateOfBirth        = new Date(
                                              Integer.parseInt(dobYYYYTF.getText()),
                                              Integer.parseInt(dobMMTF.getText()),
                                              Integer.parseInt(dobDDTF.getText())
                                                );
        String     bloodGroup         = bloodGroupTF.getText();
        String     nationality        = nationalityTF.getText();
        String     religion           = religionTF.getText();
        String     address            = addressTF.getText();
        String     phone              = phoneTF.getText();
        String     email              = emailTF.getText();
        
        Student s = new Student(
                                enrollmentSemester,
                                currentSemester,
                                enrollmentYear,
                                currentYear,
                                addmissionDate,
                                totalCredit,
                                currentCredit,
                                cgpa,
                                advisor,
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
        
        UmsFile.studentList.put(userId, s);
        
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
