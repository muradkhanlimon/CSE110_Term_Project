/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
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
import javafx.util.Callback;
import ums.coreclasses.Department;
import ums.coreclasses.Instructor;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_24_A_View_Instructor_Controller implements Initializable {

    @FXML
    private TableView<Instructor> instructorTable;
    @FXML
    private Button backButton;
    @FXML
    private TableColumn<Instructor, String> uniqueIdCol;
    @FXML
    private TableColumn<Instructor, String> userTypeCol;
    @FXML
    private TableColumn<Instructor, String> userIdCol;
    @FXML
    private TableColumn<Instructor, String> passCol;
    @FXML
    private TableColumn<Instructor, String> statusCol;
    @FXML
    private TableColumn<Instructor, String> firstNameCol;
    @FXML
    private TableColumn<Instructor, String> lastNameCol;
    @FXML
    private TableColumn<Instructor, String> fathersNameCol;
    @FXML
    private TableColumn<Instructor, String> mothersNmaeCol;
    @FXML
    private TableColumn<Instructor, Date> dobCol;
    @FXML
    private TableColumn<Instructor, String> bloodGroupCol;
    @FXML
    private TableColumn<Instructor, String> nationalityCol;
    @FXML
    private TableColumn<Instructor, String> religionCol;
    @FXML
    private TableColumn<Instructor, String> addressCol;
    @FXML
    private TableColumn<Instructor, String> phoneCol;
    @FXML
    private TableColumn<Instructor, String> emailCol;
    @FXML
    private TableColumn<Instructor, String> designationCol;
    @FXML
    private TableColumn<Instructor, Double> salaryCol;
    @FXML
    private TableColumn<Instructor, Boolean> isChairpersonCol;
    @FXML
    private TableColumn<Instructor, String> enrollSemCol;
    @FXML
    private TableColumn<Instructor, Integer> enrollYearCol;
    @FXML
    private TableColumn<Instructor, Date> joinDateCol;
    @FXML
    private TableColumn<Instructor, String> deptCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        uniqueIdCol.setCellValueFactory(new PropertyValueFactory<>("uniqueId"));
        userTypeCol.setCellValueFactory(new PropertyValueFactory<>("userType"));
        userIdCol.setCellValueFactory(new PropertyValueFactory<>("userId"));
        passCol.setCellValueFactory(new PropertyValueFactory<>("userPassword"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("userStatus"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        fathersNameCol.setCellValueFactory(new PropertyValueFactory<>("fathersName"));
        mothersNmaeCol.setCellValueFactory(new PropertyValueFactory<>("mothersName"));
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        bloodGroupCol.setCellValueFactory(new PropertyValueFactory<>("bloodGroup"));
        nationalityCol.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        religionCol.setCellValueFactory(new PropertyValueFactory<>("religion"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        designationCol.setCellValueFactory(new PropertyValueFactory<>("designation"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        isChairpersonCol.setCellValueFactory(new PropertyValueFactory<>("isChairperson"));
        enrollSemCol.setCellValueFactory(new PropertyValueFactory<>("enrollmentSemester"));
        enrollYearCol.setCellValueFactory(new PropertyValueFactory<>("enrollmentYear"));
        joinDateCol.setCellValueFactory(new PropertyValueFactory<>("joinDate"));
        //deptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
deptCol.setCellValueFactory(cellData -> {
    Instructor instructor = cellData.getValue();
    Department department = instructor.getDepartment();
    return new SimpleStringProperty(department.getCode());
});



        instructorTable.getItems().addAll(UmsFile.instructorList.values());
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
