package ums.javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ums.files.UmsFile;

/**
 *
 * @author LIMON
 */
public class Page_1_Login extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Page_1_Login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("UMS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        UmsFile.initialize();
        launch(args);
    }
    
}
