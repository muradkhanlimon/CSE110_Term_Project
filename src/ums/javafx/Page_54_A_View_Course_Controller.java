/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ums.javafx;

import java.io.IOException;
import java.net.URL;
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
import ums.coreclasses.Course;
import ums.coreclasses.Department;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_54_A_View_Course_Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TableView<Course> courseTV;
    @FXML
    private TableColumn<Course, String> cCodeCol;
    @FXML
    private TableColumn<Course, String> cTitleCol;
    @FXML
    private TableColumn<Course, Float> cCreditCol;
    @FXML
    private TableColumn<Course, Float> cCreditHourCol;
    @FXML
    private TableColumn<Course, String> cDeptCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        cTitleCol.setCellValueFactory(new PropertyValueFactory<>("courseTitle"));
        cCreditCol.setCellValueFactory(new PropertyValueFactory<>("courseCredit"));
        cCreditHourCol.setCellValueFactory(new PropertyValueFactory<>("courseCreditHour"));
        cDeptCol.setCellValueFactory(cellData -> {
                Course course = cellData.getValue();
                Department department = course.getDepartment();
                return new SimpleStringProperty(department.getCode());
            });
        courseTV.getItems().addAll(UmsFile.courseList.values());
    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        backButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_7_A_Course.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    }
    
}
