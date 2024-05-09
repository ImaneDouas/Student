/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */                                                 
package studentmanagementsystem;


import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Souhaila
 */
public class dashboardController1  implements Initializable {
    
    
    @FXML
    private AnchorPane main_form;

    @FXML
    private Button close;

    @FXML
    private Button minimize;

    @FXML
    private Label username;

    @FXML
    private Button home_btn;

    @FXML
    private Button addStudents_btn;

    @FXML
    private Button availableCourse_btn;

    @FXML
    private Button studentGrade_btn;

    @FXML
    private Button logout;

    @FXML
    private AnchorPane home_form;

    @FXML
    private Label home_totalEnrolled;

    @FXML
    private Label home_totalFemale;

    @FXML
    private Label home_totalMale;

    @FXML
    private BarChart<?, ?> home_totalEnrolledChart;

    @FXML
    private AreaChart<?, ?> home_totalFemaleChart;

    @FXML
    private LineChart<?, ?> home_totalMaleChart;

    @FXML
    private AnchorPane addStudents_form;

    @FXML
    private TextField addStudents_search;

    @FXML
    private TableView<?> addStudents_tableView;

    @FXML
    private TableColumn<?, ?> addStudents_col_studentNum;

    @FXML
    private TableColumn<?, ?> addStudents_col_year;

    @FXML
    private TableColumn<?, ?> addStudents_col_course;

    @FXML
    private TableColumn<?, ?> addStudents_col_firstName;

    @FXML
    private TableColumn<?, ?> addStudents_col_lastName;

    @FXML
    private TableColumn<?, ?> addStudents_col_gender;

    @FXML
    private TableColumn<?, ?> addStudents_col_birth;

    @FXML
    private TableColumn<?, ?> addStudents_col_status;

    @FXML
    private TextField addStudents_studentNum;

    @FXML
    private ComboBox<?> addStudents_year;

    @FXML
    private ComboBox<?> addStudents_course;

    @FXML
    private TextField addStudents_firstName;

    @FXML
    private TextField addStudents_lastName;

    @FXML
    private ComboBox<?> addStudents_gender;

    @FXML
    private DatePicker addStudents_birth;

    @FXML
    private ComboBox<?> addStudents_status;

    @FXML
    private ImageView addStudents_imageView;

    @FXML
    private Button addStudents_insertBtn;

    @FXML
    private Button addStudents_addBtn;

    @FXML
    private Button addStudents_updateBtn;

    @FXML
    private Button addStudents_deleteBtn;

    @FXML
    private Button addStudents_clearBtn;

    @FXML
    private AnchorPane availableCourse_form;

    @FXML
    private TextField availableCourse_course;

    @FXML
    private TextField availableCourse_description;

    @FXML
    private TextField availableCourse_degree;

    @FXML
    private Button availableCourse_addBtn;

    @FXML
    private Button availableCourse_updateBtn;

    @FXML
    private Button availableCourse_clearBtn;

    @FXML
    private Button availableCourse_deleteBtn;

     @FXML
    private TableView<filiereData> availableCourse_tableView;

    @FXML
    private TableColumn<filiereData, String> availableCourse_col_course;

    @FXML
    private TableColumn<filiereData, String> availableCourse_col_description;

    @FXML
    private TableColumn<filiereData, String> availableCourse_col_degree;

    @FXML
    private AnchorPane studentGrade_form;

    @FXML
    private TextField studentGrade_studentNum;

    @FXML
    private Label studentGrade_year;

    @FXML
    private Label studentGrade_course;

    @FXML
    private TextField studentGrade_firstSem;

    @FXML
    private TextField studentGrade_secondSem;

    @FXML
    private Button studentGrade_updateBtn;

    @FXML
    private Button studentGrade_clearBtn;

    @FXML
    private TableView<?> studentGrade_tableView;

    @FXML
    private TableColumn<?, ?> studentGrade_col_studentNum;

    @FXML
    private TableColumn<?, ?> studentGrade_col_year;

    @FXML
    private TableColumn<?, ?> studentGrade_col_course;

    @FXML
    private TableColumn<?, ?> studentGrade_col_firstSem;

    @FXML
    private TableColumn<?, ?> studentGrade_col_secondSem;

    @FXML
    private TableColumn<?, ?> studentGrade_col_final;

    @FXML
    private TextField studentGrade_search;
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    
    
    public void switchForm(ActionEvent event) {
        if (event.getSource() == home_btn) {
            home_form.setVisible(true);
            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(false);

            home_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            addStudents_btn.setStyle("-fx-background-color:transparent");
            availableCourse_btn.setStyle("-fx-background-color:transparent");
            studentGrade_btn.setStyle("-fx-background-color:transparent");

//            homeDisplayTotalEnrolledStudents();
//            homeDisplayMaleEnrolled();
//            homeDisplayFemaleEnrolled();
//            homeDisplayEnrolledMaleChart();
//            homeDisplayFemaleEnrolledChart();
//            homeDisplayTotalEnrolledChart();

        } else if (event.getSource() == addStudents_btn) {
            home_form.setVisible(false);
            addStudents_form.setVisible(true);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(false);

            addStudents_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            home_btn.setStyle("-fx-background-color:transparent");
            availableCourse_btn.setStyle("-fx-background-color:transparent");
            studentGrade_btn.setStyle("-fx-background-color:transparent");

//            TO BECOME UPDATED ONCE YOU CLICK THE ADD STUDENTS BUTTON ON NAV
//            addStudentsShowListData();
//            addStudentsYearList();
//            addStudentsGenderList();
//            addStudentsStatusList();
//            addStudentsCourseList();
//            addStudentsSearch();

        } else if (event.getSource() == availableCourse_btn) {
            home_form.setVisible(false);
            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(true);
            studentGrade_form.setVisible(false);

            availableCourse_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            addStudents_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            studentGrade_btn.setStyle("-fx-background-color:transparent");

            availableFiliereShowListData();

        } else if (event.getSource() == studentGrade_btn) {
            home_form.setVisible(false);
            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(true);

            studentGrade_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            addStudents_btn.setStyle("-fx-background-color:transparent");
            availableCourse_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");

//            studentGradesShowListData();
//            studentGradesSearch();

        }
    }
    
    
    public ObservableList<filiereData> availableFiliereListData(){
    
        ObservableList<filiereData> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM filiere";

        connect = database.connectDb();

        try {
            filiereData filiereD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                filiereD = new filiereData(result.getString("nom_filiere"),
                        result.getString("description"),
                        result.getString("objectif"));

                listData.add(filiereD);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;

    
    
     }
    
    
    private ObservableList<filiereData> availableFiliereList;

    public void availableFiliereShowListData() {
        availableFiliereList = availableFiliereListData();

        availableCourse_col_course.setCellValueFactory(new PropertyValueFactory<>("filiere"));
        availableCourse_col_description.setCellValueFactory(new PropertyValueFactory<>("description"));
        availableCourse_col_degree.setCellValueFactory(new PropertyValueFactory<>("objectif"));

        availableCourse_tableView.setItems(availableFiliereList);

    }
    
    
    
        public void availableCourseAdd() {

        String insertData = "INSERT INTO filiere (nom_filiere,description,objectif) VALUES(?,?,?)";

        connect = database.connectDb();

        try {
            Alert alert;

            if (availableCourse_course.getText().isEmpty()
                    || availableCourse_description.getText().isEmpty()
                    || availableCourse_degree.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {
//            CHECK IF THE COURSE YOU WANT TO INSERT IS ALREADY EXIST!
                String checkData = "SELECT nom_filiere FROM filiere WHERE nom_filiere = '"
                        + availableCourse_course.getText() + "'";

                statement = connect.createStatement();
                result = statement.executeQuery(checkData);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Filiere: " + availableCourse_course.getText() + " was already exist!");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1, availableCourse_course.getText());
                    prepare.setString(2, availableCourse_description.getText());
                    prepare.setString(3, availableCourse_degree.getText());

                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                    // TO BECOME UPDATED OUR TABLEVIEW ONCE THE DATA WE GAVE SUCCESSFUL
                    availableFiliereShowListData();
                    // TO CLEAR THE TEXT FIELDS
                    availableFiliereClear();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
        
        public void availableCourseUpdate() {

        String updateData = "UPDATE filiere SET description = '"
                + availableCourse_description.getText() + "', objectif = '"
                + availableCourse_degree.getText() + "' WHERE nom_filiere = '"
                + availableCourse_course.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;

            if (availableCourse_course.getText().isEmpty()
                    || availableCourse_description.getText().isEmpty()
                    || availableCourse_degree.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Course: " + availableCourse_course.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    // TO BECOME UPDATED OUR TABLEVIEW ONCE THE DATA WE GAVE SUCCESSFUL
                    availableFiliereShowListData();
                    // TO CLEAR THE TEXT FIELDS
                    availableFiliereClear();

                } else {
                    return;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
        
    public void availableCourseDelete() {

        String deleteData = "DELETE FROM filiere WHERE nom_filiere = '"
                + availableCourse_course.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;

            if (availableCourse_course.getText().isEmpty()
                    || availableCourse_description.getText().isEmpty()
                    || availableCourse_degree.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {
//                ALL GOOD GUYS! NOW LETS PROCEED TO ADD STUDENTS FORM
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE Course: " + availableCourse_course.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();

                    // TO BECOME UPDATED OUR TABLEVIEW ONCE THE DATA WE GAVE SUCCESSFUL
                    availableFiliereShowListData();
                    // TO CLEAR THE TEXT FIELDS
                    availableFiliereClear();

                } else {
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
        
        
     public void availableFiliereClear() {
        availableCourse_course.setText("");
        availableCourse_description.setText("");
        availableCourse_degree.setText("");
    }
    
    
     public void availableFiliereSelect() {
        filiereData filiereD = availableCourse_tableView.getSelectionModel().getSelectedItem();
        int num = availableCourse_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        availableCourse_course.setText(filiereD.getFiliere());
        availableCourse_description.setText(filiereD.getDescription());
        availableCourse_degree.setText(filiereD.getObjectif());

    }
     
     
    private void imprimer(TableView<filiereData> tableView) {
        // Code pour imprimer la tableview
        System.out.println("Imprimer la tableview...");
    }

    
    
    
     public void close() {
        System.exit(0);
    }

    public void minimize() {
        Stage stage = (Stage) main_form.getScene().getWindow();
        stage.setIconified(true);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
         availableFiliereShowListData();
    }
    
}
