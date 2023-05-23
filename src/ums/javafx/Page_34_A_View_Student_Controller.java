/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ums.coreclasses.Department;
import ums.coreclasses.Instructor;
import ums.coreclasses.Student;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_34_A_View_Student_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TableView<Student> studentTV;
    @FXML
    private TableColumn<Student, String> uniqueIdCol;
    @FXML
    private TableColumn<Student, String> userTypeCol;
    @FXML
    private TableColumn<Student, String> usernameCol;
    @FXML
    private TableColumn<Student, String> passwordCol;
    @FXML
    private TableColumn<Student, String> statusCol;
    @FXML
    private TableColumn<Student, String> fnameCol;
    @FXML
    private TableColumn<Student, String> lnameCol;
    @FXML
    private TableColumn<Student, String> fanameCol;
    @FXML
    private TableColumn<Student, String> manameCol;
    @FXML
    private TableColumn<Student, Date> dobCol;
    @FXML
    private TableColumn<Student, String> bloodGroupCol;
    @FXML
    private TableColumn<Student, String> nationalityCol;
    @FXML
    private TableColumn<Student, String> religionCol;
    @FXML
    private TableColumn<Student, String> phoneCol;
    @FXML
    private TableColumn<Student, String> emailCol;
    @FXML
    private TableColumn<Student, Float> cCredCol;
    @FXML
    private TableColumn<Student, String> advCol;
    @FXML
    private TableColumn<Student, String> deptCol;
    @FXML
    private TableColumn<Student, String> addressCol;
    @FXML
    private TableColumn<Student, String> enSemCol;
    @FXML
    private TableColumn<Student, Integer> enYCol;
    @FXML
    private TableColumn<Student, String> crSemCol;
    @FXML
    private TableColumn<Student, Float> crYCol;
    @FXML
    private TableColumn<Student, Float> tCredCol;
    @FXML
    private TableColumn<Student, Float> cgpaCol;
    @FXML
    private TableColumn<Student, Date> adCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        uniqueIdCol.setCellValueFactory(new PropertyValueFactory<>("uniqueId"));
        userTypeCol.setCellValueFactory(new PropertyValueFactory<>("userType"));
        usernameCol.setCellValueFactory(new PropertyValueFactory<>("userId"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<>("userPassword"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("userStatus"));
        fnameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lnameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        fanameCol.setCellValueFactory(new PropertyValueFactory<>("fathersName"));
        manameCol.setCellValueFactory(new PropertyValueFactory<>("mothersName"));
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        bloodGroupCol.setCellValueFactory(new PropertyValueFactory<>("bloodGroup"));
        nationalityCol.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        religionCol.setCellValueFactory(new PropertyValueFactory<>("religion"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        enSemCol.setCellValueFactory(new PropertyValueFactory<>("enrollmentSemester"));
        enYCol.setCellValueFactory(new PropertyValueFactory<>("enrollmentYear"));
        crSemCol.setCellValueFactory(new PropertyValueFactory<>("currentSemester"));
        crYCol.setCellValueFactory(new PropertyValueFactory<>("currentYear"));
        tCredCol.setCellValueFactory(new PropertyValueFactory<>("totalCredit"));
        cCredCol.setCellValueFactory(new PropertyValueFactory<>("currentCredit"));
        cgpaCol.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
        adCol.setCellValueFactory(new PropertyValueFactory<>("admissionDate"));
        
    advCol.setCellValueFactory(cellData -> {
        Student student = cellData.getValue();
        Instructor instructor = student.getAdvisor();
        return new SimpleStringProperty(instructor.getUserId());
    });
    
    deptCol.setCellValueFactory(cellData -> {
        Student student = cellData.getValue();
        Department department = student.getDepartment();
        return new SimpleStringProperty(department.getCode());
    });

    studentTV.getItems().addAll(UmsFile.studentList.values());
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
