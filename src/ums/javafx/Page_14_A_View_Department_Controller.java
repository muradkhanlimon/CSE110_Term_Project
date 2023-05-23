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
import ums.coreclasses.Department;
import ums.files.UmsFile;

/**
 * FXML Controller class
 *
 * @author LIMON
 */
public class Page_14_A_View_Department_Controller implements Initializable {

    @FXML
    private TableView<Department> departmentTable;
    @FXML
    private Button backButton;
    @FXML
    private TableColumn<Department, String> idCol;
    @FXML
    private TableColumn<Department, String> codeCol;
    @FXML
    private TableColumn<Department, String> fullNameCol;
    @FXML
    private TableColumn<Department, Double> budgetCol;
    @FXML
    private TableColumn<Department, String> buildingCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
        fullNameCol.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        budgetCol.setCellValueFactory(new PropertyValueFactory<>("budget"));
        buildingCol.setCellValueFactory(new PropertyValueFactory<>("building"));

        departmentTable.getItems().addAll(UmsFile.departmentList.values());
    }
    
    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        
            backButton.getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Page_3_A_Department.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin");
            stage.show();
    }
    
}//Class ends
