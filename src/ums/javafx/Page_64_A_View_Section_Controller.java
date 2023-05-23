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
import ums.coreclasses.Instructor;
import ums.coreclasses.Section;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_64_A_View_Section_Controller implements Initializable {

    @FXML
    private TableView<Section> secTV;
    @FXML
    private TableColumn<Section, Integer> secIdCol;
    @FXML
    private TableColumn<Section, Integer> secNameCol;
    @FXML
    private TableColumn<Section, String> secSemCol;
    @FXML
    private TableColumn<Section, Integer> secYearCol;
    @FXML
    private TableColumn<Section, String> secCourseCol;
    @FXML
    private TableColumn<Section, String> secInsCol;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        secIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        secNameCol.setCellValueFactory(new PropertyValueFactory<>("sectionName"));
        secSemCol.setCellValueFactory(new PropertyValueFactory<>("semester"));
        secYearCol.setCellValueFactory(new PropertyValueFactory<>("year"));
        secCourseCol.setCellValueFactory(cellData -> {
                Section section = cellData.getValue();
                Course course = section.getCourse();
                return new SimpleStringProperty(course.getCourseCode());
            });
        secInsCol.setCellValueFactory(cellData -> {
                Section section = cellData.getValue();
                Instructor instructor = section.getInstructor();
                return new SimpleStringProperty(instructor.getUserId());
            });
        secTV.getItems().addAll(UmsFile.sectionList.values());
    }    
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        
            backButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_8_A_Section.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            stage.show();
    }
}
