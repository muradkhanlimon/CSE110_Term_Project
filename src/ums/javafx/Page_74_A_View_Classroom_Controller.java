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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ums.coreclasses.Classroom;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_74_A_View_Classroom_Controller implements Initializable {

    @FXML
    private TableView<Classroom> classroomTV;
    @FXML
    private TableColumn<Classroom, Integer> idCol;
    @FXML
    private TableColumn<Classroom, String> buildingCol;
    @FXML
    private TableColumn<Classroom, Integer> roomNumCol;
    @FXML
    private TableColumn<Classroom, Integer> capacityCol;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        buildingCol.setCellValueFactory(new PropertyValueFactory<>("building"));
        roomNumCol.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<>("capacity"));

        classroomTV.getItems().addAll(UmsFile.classroomList.values());
    }    

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        backButton.getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Page_9_A_Classroom.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Admin");
        stage.show();
    } 
    
}
