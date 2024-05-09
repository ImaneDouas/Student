/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package studentmanagementsystem;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



/**
 *
 * @author Souhaila
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private AnchorPane main_form;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtn;

    @FXML
    private Button close;
    
    public void close(){
        System.exit(0);
    }
    
    
    //    DATABASE TOOls
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    
     public void loginAdmin(){
         
     String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
     
     connect =  database.connectDb();
     
     
     try{
         
          Alert alert;
            
            prepare =  connect.prepareStatement(sql);
            prepare.setString(1, username.getText());
            prepare.setString(2, password.getText());
            
             result = prepare.executeQuery();
             
            if(username.getText().isEmpty() || password.getText().isEmpty()){
              alert = new Alert(AlertType.ERROR);
              alert.setTitle("Error Message");
              alert.setHeaderText(null);
              alert.setContentText("Please fill all blank fields");
              alert.showAndWait();
            }else{
                if(result.next()){

//                     getData.username = username.getText();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Login!");
                    alert.showAndWait();
                    
                    loginBtn.getScene().getWindow().hide();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    
                    stage.setScene(scene);
                    stage.show();
                    
                }else{
                    // THEN ERROR MESSAGE WILL APPEAR
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong Username/Password");
                    alert.showAndWait();
                }
            }
         
         
       }catch(Exception e){e.printStackTrace();}
     
     }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
