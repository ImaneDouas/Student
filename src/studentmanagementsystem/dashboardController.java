/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class dashboardController implements Initializable {

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
    private Button gestionmatiere_btn;

    @FXML
    private Button studentGrade_btn;

    @FXML
    private Button logout;

    @FXML
    private AnchorPane home_form;
    
    
    @FXML
    private AnchorPane matiere_form;

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
    private TableView<studentData> addStudents_tableView;

    @FXML
    private TableColumn<studentData, String> addStudents_col_studentNum;

    @FXML
    private TableColumn<studentData, String> addStudents_col_year;

    @FXML
    private TableColumn<studentData, String> addStudents_col_course;

    @FXML
    private TableColumn<studentData, String> addStudents_col_firstName;

    @FXML
    private TableColumn<studentData, String> addStudents_col_lastName;

    @FXML
    private TableColumn<studentData, String> addStudents_col_gender;

    @FXML
    private TableColumn<studentData, String> addStudents_col_birth;

    @FXML
    private TableColumn<studentData, String> addStudents_col_status;
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
    private Button gestionmodule_btn;
    

@FXML
    private TextField nom_matiere;

    @FXML
    private TextField matiere_description;

    @FXML
    private TextField matiere_coeff;

    @FXML
    private Button matiere_addBtn;

    @FXML
    private Button matiere_updateBtn;

    @FXML
    private Button matiere_clearBtn;

    @FXML
    private Button matiere_deleteBtn;

    @FXML
    private TextField volume_horaire;

    @FXML
    private ComboBox<String> modulematiere;

    @FXML
    private TableView<matiereData> matiere_tableView;

    @FXML
    private TableColumn<?, String> matiere_col;

    @FXML
    private TableColumn<?, String> matiere_col_description;

    @FXML
    private TableColumn<matiereData, Integer> matiere_volume;

    @FXML
    private TableColumn<matiereData, Integer> matiere_coef;

    @FXML
    private TableColumn<matiereData, String> matiere_module;



    @FXML
    private AnchorPane Module_form;



    @FXML
    private Button module_addBtn;

    @FXML
    private Button module_updateBtn;

    @FXML
    private Button module_clearBtn;

    @FXML
    private Button module_deleteBtn;

    @FXML
    private TextField Nom_module;

    @FXML
    private TextField desc_module;

    @FXML
    private ComboBox<String> niv_module;
    
      @FXML
    private ComboBox<String> filiereNom;

    @FXML
    private TableView<moduleData> module_tableView;

    @FXML
    private TableColumn<moduleData, String> Nom_mod; 

    @FXML
    private TableColumn<moduleData, String> description_mod;

    @FXML
    private TableColumn<moduleData, String> niveau_mod;

    @FXML
    private TableColumn<moduleData, String> filiere;

    @FXML
    private TextField module_search;    
    

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
    private TableView<studentData> studentGrade_tableView;

    @FXML
    private TableColumn<studentData, String> studentGrade_col_studentNum;

    @FXML
    private TableColumn<studentData, String> studentGrade_col_year;

    @FXML
    private TableColumn<studentData, String> studentGrade_col_course;

    @FXML
    private TableColumn<studentData, String> studentGrade_col_firstSem;

    @FXML
    private TableColumn<studentData, String> studentGrade_col_secondSem;

    @FXML
    private TableColumn<studentData, String> studentGrade_col_final;

    @FXML
    private TextField studentGrade_search;
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    private Image image;
    
//##############################################[Page Etudiant]###################################################################"
    
    private String[] genderList = {"Homme", "Femme"};

    public void addStudentsGenderList() {
        List<String> genderL = new ArrayList<>();

        for (String data : genderList) {
            genderL.add(data);
        }

        ObservableList ObList = FXCollections.observableArrayList(genderL);
        addStudents_gender.setItems(ObList);
    }
    
    
    private String[] statusList = {"célibataire", "marié(e)", "divorcé(e)"};

    public void addStudentsStatusList() {
        List<String> statusL = new ArrayList<>();

        for (String data : statusList) {
            statusL.add(data);
        }

        ObservableList ObList = FXCollections.observableArrayList(statusL);
        addStudents_status.setItems(ObList);
    }
    
     private String[] yearList = {"1A", "2A", "3A", "4A","5A"};

     public void addStudentsYearList() {

        List<String> yearL = new ArrayList<>();

        for (String data : yearList) {
            yearL.add(data);
        }

        ObservableList ObList = FXCollections.observableArrayList(yearL);
        addStudents_year.setItems(ObList);

     }
     
     
     
    public void addStudentsCourseList() {

        String listCourse = "SELECT * FROM filiere";

        connect = database.connectDb();

        try {

            ObservableList listC = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(listCourse);
            result = prepare.executeQuery();

            while (result.next()) {
                listC.add(result.getString("nom_filiere"));
            }
            addStudents_course.setItems(listC);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
        public void addStudentsInsertImage() {

        FileChooser open = new FileChooser();
        open.setTitle("Open Image File");
        open.getExtensionFilters().add(new ExtensionFilter("Image File", "*jpg", "*png"));

        File file = open.showOpenDialog(main_form.getScene().getWindow());

        if (file != null) {

            image = new Image(file.toURI().toString(), 120, 149, false, true);
            addStudents_imageView.setImage(image);

            getData.path = file.getAbsolutePath();

        }
    }
        
        
        
        public void addStudentsAdd() {

        String insertData = "INSERT INTO student "
                + "(studentNum,year,course,firstName,lastName,gender,birth,status,image) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        connect = database.connectDb();

        try {
            Alert alert;

            if (addStudents_studentNum.getText().isEmpty()
                    || addStudents_year.getSelectionModel().getSelectedItem() == null
                    || addStudents_course.getSelectionModel().getSelectedItem() == null
                    || addStudents_firstName.getText().isEmpty()
                    || addStudents_lastName.getText().isEmpty()
                    || addStudents_gender.getSelectionModel().getSelectedItem() == null
                    || addStudents_birth.getValue() == null
                    || addStudents_status.getSelectionModel().getSelectedItem() == null
                    || getData.path == null || getData.path == "") {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {
                String checkData = "SELECT studentNum FROM student WHERE studentNum = '"
                        + addStudents_studentNum.getText() + "'";

                statement = connect.createStatement();
                result = statement.executeQuery(checkData);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Etudiant #" + addStudents_studentNum.getText() + " was already exist!");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1, addStudents_studentNum.getText());
                    prepare.setString(2, (String) addStudents_year.getSelectionModel().getSelectedItem());
                    prepare.setString(3, (String) addStudents_course.getSelectionModel().getSelectedItem());
                    prepare.setString(4, addStudents_firstName.getText());
                    prepare.setString(5, addStudents_lastName.getText());
                    prepare.setString(6, (String) addStudents_gender.getSelectionModel().getSelectedItem());
                    prepare.setString(7, String.valueOf(addStudents_birth.getValue()));
                    prepare.setString(8, (String) addStudents_status.getSelectionModel().getSelectedItem());

                    String uri = getData.path;
                    uri = uri.replace("\\", "\\\\");
                    prepare.setString(9, uri);
//
//                    Date date = new Date();
//                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//                    prepare.setString(10, String.valueOf(sqlDate));
//
                    prepare.executeUpdate();

                    String insertStudentGrade = "INSERT INTO student_grade "
                            + "(studentNum,matiere,CC1,CC2,Moyenne_mat) "
                            + "VALUES(?,?,?,?,?)";

                    prepare = connect.prepareStatement(insertStudentGrade);
                    prepare.setString(1, addStudents_studentNum.getText());
                    prepare.setString(2, (String) addStudents_year.getSelectionModel().getSelectedItem());
                    prepare.setString(3, (String) addStudents_course.getSelectionModel().getSelectedItem());
                    prepare.setString(4, "0");
                    prepare.setString(5, "0");
                    prepare.setString(6, "0");

                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                    addStudentsShowListData();
                    addStudentsClear();
                }
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
    
        
     public void addStudentsUpdate() {

        String uri = getData.path;
        uri = uri.replace("\\", "\\\\");

        String updateData = "UPDATE student SET "
                + "year = '" + addStudents_year.getSelectionModel().getSelectedItem()
                + "', course = '" + addStudents_course.getSelectionModel().getSelectedItem()
                + "', firstName = '" + addStudents_firstName.getText()
                + "', lastName = '" + addStudents_lastName.getText()
                + "', gender = '" + addStudents_gender.getSelectionModel().getSelectedItem()
                + "', birth = '" + addStudents_birth.getValue()
                + "', status = '" + addStudents_status.getSelectionModel().getSelectedItem()
                + "', image = '" + uri + "' WHERE studentNum = '"
                + addStudents_studentNum.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;
            if (addStudents_studentNum.getText().isEmpty()
                    || addStudents_year.getSelectionModel().getSelectedItem() == null
                    || addStudents_course.getSelectionModel().getSelectedItem() == null
                    || addStudents_firstName.getText().isEmpty()
                    || addStudents_lastName.getText().isEmpty()
                    || addStudents_gender.getSelectionModel().getSelectedItem() == null
                    || addStudents_birth.getValue() == null
                    || addStudents_status.getSelectionModel().getSelectedItem() == null
                    || getData.path == null || getData.path == "") {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Student #" + addStudents_studentNum.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    addStudentsShowListData();
                    addStudentsClear();

                } else {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudentsDelete() {

        String deleteData = "DELETE FROM student WHERE studentNum = '"
                + addStudents_studentNum.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;
            if (addStudents_studentNum.getText().isEmpty()
                    ) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill numetud");
                alert.showAndWait();
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE Student #" + addStudents_studentNum.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {

                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    String checkData = "SELECT studentNum FROM student_grade "
                            + "WHERE studentNum = '" + addStudents_studentNum.getText() + "'";

                    prepare = connect.prepareStatement(checkData);
                    result = prepare.executeQuery();

                    if (result.next()) {
                        String deleteGrade = "DELETE FROM student_grade WHERE "
                                + "studentNum = '" + addStudents_studentNum.getText() + "'";

                        statement = connect.createStatement();
                        statement.executeUpdate(deleteGrade);

                    }

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();

                    addStudentsShowListData();
                    addStudentsClear();

                } else {
                    return;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
    
        
    public void addStudentsClear() {
        addStudents_studentNum.setText("");
        addStudents_year.getSelectionModel().clearSelection();
        addStudents_course.getSelectionModel().clearSelection();
        addStudents_firstName.setText("");
        addStudents_lastName.setText("");
        addStudents_gender.getSelectionModel().clearSelection();
        addStudents_birth.setValue(null);
        addStudents_status.getSelectionModel().clearSelection();
        addStudents_imageView.setImage(null);

        getData.path = "";
    }

     
     
     
     
    public ObservableList<studentData> addStudentsListData() {

        ObservableList<studentData> listStudents = FXCollections.observableArrayList();

        String sql = "SELECT * FROM student";
        connect = database.connectDb();

        try {
            studentData studentD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                studentD = new studentData(result.getInt("studentNum"),
                        result.getString("year"),
                        result.getString("course"),
                        result.getString("firstName"),
                        result.getString("lastName"),
                        result.getString("gender"),
                        result.getDate("birth"),
                        result.getString("status"),
                        result.getString("image"));

                listStudents.add(studentD);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listStudents;
    }
     private ObservableList<studentData> addStudentsListD;
      public void addStudentsShowListData() {
        addStudentsListD = addStudentsListData();

        addStudents_col_studentNum.setCellValueFactory(new PropertyValueFactory<>("studentNum"));
        addStudents_col_year.setCellValueFactory(new PropertyValueFactory<>("year"));
        addStudents_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
        addStudents_col_firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        addStudents_col_lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        addStudents_col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        addStudents_col_birth.setCellValueFactory(new PropertyValueFactory<>("birth"));
        addStudents_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        addStudents_tableView.setItems(addStudentsListD);
      }
      
      
       public void addStudentsSelect() {

        studentData studentD = addStudents_tableView.getSelectionModel().getSelectedItem();
        int num = addStudents_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        addStudents_studentNum.setText(String.valueOf(studentD.getStudentNum()));
        addStudents_firstName.setText(studentD.getFirstName());
        addStudents_lastName.setText(studentD.getLastName());
        addStudents_birth.setValue(LocalDate.parse(String.valueOf(studentD.getBirth())));

        String uri = "file:" + studentD.getImage();

        image = new Image(uri, 120, 149, false, true);
        addStudents_imageView.setImage(image);

        getData.path = studentD.getImage();

    }
      
//##############################################[Deconnexion]###################################################################"
      
      
      
    private double x = 0;
    private double y = 0;

    public void logout() {
        try {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to logout?");
          
            
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                logout.getScene().getWindow().hide();

           
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });

                root.setOnMouseDragged((MouseEvent event) -> {
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);

                    stage.setOpacity(.8);
                });

                root.setOnMouseReleased((MouseEvent event) -> {
                    stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.TRANSPARENT);

                stage.setScene(scene);
                stage.show();
            } else {
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
//##############################################[Page Filiere]###################################################################"
  
    
    
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

                    
                    availableFiliereShowListData();
                
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

                    
                    availableFiliereShowListData();
                  
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
     
//##############################################[Page Module]###################################################################"
     
     
        public void filiereModuleList() {

        String listCourse = "SELECT * FROM filiere";

        connect = database.connectDb();

        try {

            ObservableList listC = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(listCourse);
            result = prepare.executeQuery();

            while (result.next()) {
                listC.add(result.getString("nom_filiere"));
            }
            filiereNom.setItems(listC);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
        
        
          public void moduleYearList() {

        List<String> yearL = new ArrayList<>();

        for (String data : yearList) {
            yearL.add(data);
        }

        ObservableList ObList = FXCollections.observableArrayList(yearL);
        niv_module.setItems(ObList);

     }
     
        
    public ObservableList<moduleData> availableModuleListData(){
    
        ObservableList<moduleData> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM module";

        connect = database.connectDb();

        try {
            moduleData ModuleD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                ModuleD = new moduleData(result.getString("Nom_mod"),
                        result.getString("description_mod"),
                        result.getString("niveau_mod"),
                        result.getString("filiere"));

                listData.add(ModuleD);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;

    
    
     }
    
    
    private ObservableList<moduleData> availableModuleList;

    public void availableModuleShowListData() {
        availableModuleList = availableModuleListData();

        Nom_mod.setCellValueFactory(new PropertyValueFactory<>("module"));
        description_mod.setCellValueFactory(new PropertyValueFactory<>("description"));
        niveau_mod.setCellValueFactory(new PropertyValueFactory<>("niveau"));
        filiere.setCellValueFactory(new PropertyValueFactory<>("filiere"));

           


        module_tableView.setItems(availableModuleList);

    }
    
    
    
        public void availableModuleAdd() {

        String insertData = "INSERT INTO module (Nom_mod,description_mod,niveau_mod,filiere) VALUES(?,?,?,?)";

        connect = database.connectDb();

        try {
            Alert alert;

                      if (Nom_module.getText().isEmpty()
                              || desc_module.getText().isEmpty() 
                              || niv_module.getSelectionModel().getSelectedItem() == null
                              || filiereNom.getSelectionModel().getSelectedItem() == null) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                String checkData = "SELECT Nom_mod FROM module WHERE Nom_mod = '"
                        + Nom_module.getText() + "' and niveau_mod = '"
                        + niv_module.getSelectionModel().getSelectedItem() + "'";

                statement = connect.createStatement();
                result = statement.executeQuery(checkData);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Module: " + Nom_module.getText() + " was already exist!");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1, Nom_module.getText());
                    prepare.setString(2, desc_module.getText());
                    prepare.setString(3,(String) niv_module.getSelectionModel().getSelectedItem());
                    prepare.setString(4, (String) filiereNom.getSelectionModel().getSelectedItem());
                  

                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                    availableModuleShowListData();
                    
                    availableModuleClear();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
        
        public void availableModuleUpdate() {

        String updateData = "UPDATE module SET description_mod = '"
                + desc_module.getText() + "', niv_mod = '"
                + filiereNom.getSelectionModel().getSelectedItem() + "' WHERE Nom_mod = '"
                + Nom_module.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;

            if (Nom_module.getText().isEmpty()
                    || desc_module.getText().isEmpty()
                     || niv_module.getSelectionModel().getSelectedItem().isEmpty()
                    || filiereNom.getSelectionModel().getSelectedItem().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Course: " + Nom_module.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                   
                    availableModuleShowListData();
                 
                    availableModuleClear();

                } else {
                    return;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
        
    public void availableModuleDelete() {

        String deleteData = "DELETE FROM module WHERE Nom_mod = '"
                + Nom_module.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;

            if (Nom_module.getText().isEmpty()
                    || desc_module.getText().isEmpty()
                    || niv_module.getSelectionModel().getSelectedItem() == null
                    || filiereNom.getSelectionModel().getSelectedItem() == null) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE Course: " + Nom_module.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();

                    
                    availableModuleShowListData();
                   
                    availableModuleClear();

                } else {
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
        
        
     public void availableModuleClear() {
         Nom_module.setText("");
        desc_module.setText("");
        niv_module.getSelectionModel().clearSelection();
        filiereNom.getSelectionModel().clearSelection();
        
    }
    
    
     public void availableModuleSelect() {
        moduleData moduleD = module_tableView.getSelectionModel().getSelectedItem();
        int num = module_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        Nom_module.setText(moduleD.getModule());
        desc_module.setText(moduleD.getDescription());
//        filiereNom.setValue(moduleD.getFiliere());
//        niv_module.setValue(moduleD.getNiveau());


    }
    
  
     

//##############################################[Page Matiere]###################################################################"
     
        public void MatiereModuleList() {

        String listCourse = "SELECT * FROM module";

        connect = database.connectDb();

        try {

            ObservableList listC = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(listCourse);
            result = prepare.executeQuery();

            while (result.next()) {
                listC.add(result.getString("Nom_mod"));
                System.out.println(listC);
            }
            modulematiere.setItems(listC);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
     
        
    public ObservableList<matiereData> availableMatiereListData(){
    
        ObservableList<matiereData> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM matiere";

        connect = database.connectDb();

        try {
            matiereData matiereD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                matiereD = new matiereData(result.getString("nom_mat"),
                        result.getString("descrip_mat"),
                        result.getInt("volume_horaire"),
                        result.getInt("coeff_mat"),
                        result.getString("module"));

                listData.add(matiereD);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;

    
    
     }
    
    
    private ObservableList<matiereData> availableMatiereList;

    public void availableMatiereShowListData() {
        availableMatiereList = availableMatiereListData();

        matiere_col.setCellValueFactory(new PropertyValueFactory<>("Matiere"));
        matiere_col_description.setCellValueFactory(new PropertyValueFactory<>("description"));
        matiere_coef.setCellValueFactory(new PropertyValueFactory<>("coeff"));
        matiere_volume.setCellValueFactory(new PropertyValueFactory<>("volume"));
        matiere_module.setCellValueFactory(new PropertyValueFactory<>("module"));


        matiere_tableView.setItems(availableMatiereList);

    }
    
    
    
        public void availableMatiereAdd() {

        String insertData = "INSERT INTO matiere (nom_mat,descrip_mat,volume_horaire,coeff_mat,module) VALUES(?,?,?,?,?)";

        connect = database.connectDb();

        try {
            Alert alert;

                      if (nom_matiere.getText().isEmpty()
                              || volume_horaire.getText().isEmpty() 
                              || matiere_description.getText().isEmpty() 
                              || matiere_coeff.getText().isEmpty()
                              || modulematiere.getSelectionModel().getSelectedItem() == null) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {
//           VERIFIER SI DEJA EXISTE
                String checkData = "SELECT nom_mat FROM matiere WHERE nom_mat = '"
                        + nom_matiere.getText() + "'";

                statement = connect.createStatement();
                result = statement.executeQuery(checkData);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("matiere: " + nom_matiere.getText() + " was already exist!");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(insertData);
                    prepare.setString(1, nom_matiere.getText());
                    prepare.setString(2, matiere_description.getText());
                    prepare.setString(3, volume_horaire.getText());
                    prepare.setString(4, matiere_coeff.getText());
                    prepare.setString(5, (String) modulematiere.getSelectionModel().getSelectedItem());
                  

                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                 
                    availableMatiereShowListData();
                 
                    availableMatiereClear();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
        
        public void availableMatiereUpdate() {

        String updateData = "UPDATE matiere SET descrip_mat = '"
                + matiere_description.getText() + "', volume_horaire = '"
                + volume_horaire.getText()
                + "', coeff_mat = '"+  matiere_coeff.getText() + "', module = '"+ 
                modulematiere.getSelectionModel().getSelectedItem()  
                +  "' WHERE nom_mat = '"  + nom_matiere.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;

            if (nom_matiere.getText().isEmpty()
                    || matiere_description.getText().isEmpty()
                    || volume_horaire.getText().isEmpty()
                    || matiere_coeff.getText().isEmpty() 
                    || modulematiere.getSelectionModel().getSelectedItem().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE module: " + nom_matiere.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                   
                    availableMatiereShowListData();
                 
                    availableMatiereClear();

                } else {
                    return;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
        
    public void availableMatiereDelete() {

        String deleteData = "DELETE FROM matiere WHERE nom_mat = '"
                + nom_matiere.getText() + "'";

        connect = database.connectDb();

        try {
            Alert alert;

            if (nom_matiere.getText().isEmpty()
                    || matiere_description.getText().isEmpty()
                    || volume_horaire.getText().isEmpty()
                    || matiere_coeff.getText().isEmpty()
                    || modulematiere.getSelectionModel().getSelectedItem() == null) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE Course: " + nom_matiere.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();

                   
                    availableMatiereShowListData();
                    // POUR VIDER
                    availableMatiereClear();

                } else {
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
        
        
     public void availableMatiereClear() {
         nom_matiere.setText("");
        matiere_description.setText("");
        volume_horaire.setText("");
        matiere_coeff.setText("");
        modulematiere.getSelectionModel().clearSelection();
        
    }
    
    
     public void availableMatiereSelect() {
        matiereData matiereD = matiere_tableView.getSelectionModel().getSelectedItem();
        int num = matiere_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        nom_matiere.setText(matiereD.getMatiere());
        matiere_description.setText(matiereD.getDescription());
        volume_horaire.setText(String.valueOf(matiereD.getCoeff()));
        matiere_coeff.setText(String.valueOf(matiereD.getVolume()));
        modulematiere.setValue(matiereD.getModule());

    }
    
//#########################################################[Page Note]################################################################"
   
    
     
    public void studentGradesUpdate() {
        double finalCheck1 = 0;
        double finalCheck2 = 0;

        String checkData = "SELECT * FROM student_grade WHERE studentNum = '"
                + studentGrade_studentNum.getText() + "'";

        connect = database.connectDb();

        double finalResult = 0;

        try {

            prepare = connect.prepareStatement(checkData);
            result = prepare.executeQuery();

            if (result.next()) {
                finalCheck1 = result.getDouble("first_sem");
                finalCheck2 = result.getDouble("second_sem");
            }

            if (finalCheck1 == 0 || finalCheck2 == 0) {
                finalResult = 0;
            } else { // LA MOYENNE DE LES 2 CC
                finalResult = (Double.parseDouble(studentGrade_firstSem.getText())
                        + Double.parseDouble(studentGrade_secondSem.getText()) / 2);
            }

            String updateData = "UPDATE student_grade SET "
                    
                    + "', CC1 = '" + studentGrade_firstSem.getText()
                    + "', CC2 = '" + studentGrade_secondSem.getText()
                    + "', Moyenne_mat = '" + finalResult + "' WHERE studentNum = '"
                    + studentGrade_studentNum.getText() + "'";

            Alert alert;

            if (studentGrade_studentNum.getText().isEmpty()
                    || studentGrade_year.getText().isEmpty()
                    || studentGrade_course.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();

            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Student #" + studentGrade_studentNum.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateData);

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    // POUR AFFICGER LA TABLE DES ENREGISTREMENTS
                    studentGradesShowListData();
                } else {
                    return;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      public void studentGradesClear() {
        studentGrade_studentNum.setText("");
        studentGrade_year.setText("");
        studentGrade_course.setText("");
        studentGrade_firstSem.setText("");
        studentGrade_secondSem.setText("");
    }
     
      public ObservableList<studentData> studentGradesListData() {

        ObservableList<studentData> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM student_grade";

        connect = database.connectDb();

        try {
            studentData studentD;

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                studentD = new studentData(result.getInt("studentNum"),
                         result.getString("year"),
                         result.getString("course"),
                         result.getDouble("CC1"),
                         result.getDouble("CC2"),
                         result.getDouble("moyenne_mat"));

                listData.add(studentD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
   private ObservableList<studentData> studentGradesList;

   public void studentGradesShowListData() {
        studentGradesList = studentGradesListData();

        studentGrade_col_studentNum.setCellValueFactory(new PropertyValueFactory<>("studentNum"));
        studentGrade_col_year.setCellValueFactory(new PropertyValueFactory<>("year"));
        studentGrade_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
        studentGrade_col_firstSem.setCellValueFactory(new PropertyValueFactory<>("CC1"));
        studentGrade_col_secondSem.setCellValueFactory(new PropertyValueFactory<>("CC2"));
        studentGrade_col_final.setCellValueFactory(new PropertyValueFactory<>("Moyenne"));

        studentGrade_tableView.setItems(studentGradesList);

    }  
   public void studentGradesSelect() {

        studentData studentD = studentGrade_tableView.getSelectionModel().getSelectedItem();
        int num = studentGrade_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        studentGrade_studentNum.setText(String.valueOf(studentD.getStudentNum()));
        studentGrade_year.setText(studentD.getYear());
        studentGrade_course.setText(studentD.getCourse());
        studentGrade_firstSem.setText(String.valueOf(studentD.getCC1()));
        studentGrade_secondSem.setText(String.valueOf(studentD.getCC2()));
    }
   public void studentGradesSearch() {

        FilteredList<studentData> filter = new FilteredList<>(studentGradesList, e -> true);

        studentGrade_search.textProperty().addListener((Observable, oldValue, newValue) -> {

            filter.setPredicate(predicateStudentData -> {

                if (newValue.isEmpty() || newValue == null) {
                    return true;
                }
                String searchKey = newValue.toLowerCase();

                if (predicateStudentData.getStudentNum().toString().contains(searchKey)) {
                    return true;
                } else if (predicateStudentData.getYear().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateStudentData.getCourse().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateStudentData.getCC2().toString().contains(searchKey)) {
                    return true;
                } else if (predicateStudentData.getCC2().toString().contains(searchKey)) {
                    return true;
                } else if (predicateStudentData.getMoyenne().toString().contains(searchKey)) {
                    return true;
                } else {
                    return false;
                }
            });
        });

        SortedList<studentData> sortList = new SortedList<>(filter);

        sortList.comparatorProperty().bind(studentGrade_tableView.comparatorProperty());
        studentGrade_tableView.setItems(sortList);

    }
    
    
//#######################################################[Switch]#################################################################
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
            addStudentsShowListData();
            addStudentsYearList();
            addStudentsGenderList();
            addStudentsStatusList();

        } else
            if (event.getSource() == addStudents_btn) {

            addStudents_form.setVisible(true);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(false);
            matiere_form.setVisible(false);
            Module_form.setVisible(false);

            addStudents_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");

            availableCourse_btn.setStyle("-fx-background-color:transparent");
            studentGrade_btn.setStyle("-fx-background-color:transparent");
            gestionmatiere_btn.setStyle("-fx-background-color:transparent");
            gestionmodule_btn.setStyle("-fx-background-color:transparent");

//            POUR AFFICHER LES DONNEES QD JE CLIQUE LE BOUTON STUDENTS
            addStudentsShowListData();
            addStudentsYearList();
            addStudentsGenderList();
            addStudentsStatusList();
            addStudentsCourseList();
            
            
//            addStudentsSearch();
        } else if (event.getSource() == availableCourse_btn) {

            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(true);
            studentGrade_form.setVisible(false);
            matiere_form.setVisible(false);
            Module_form.setVisible(false);

            availableCourse_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            addStudents_btn.setStyle("-fx-background-color:transparent");
//            home_btn.setStyle("-fx-background-color:transparent");
              gestionmatiere_btn.setStyle("-fx-background-color:transparent");
              studentGrade_btn.setStyle("-fx-background-color:transparent");
               gestionmodule_btn.setStyle("-fx-background-color:transparent");

            availableFiliereShowListData();
        } else if (event.getSource() == studentGrade_btn) {

            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(true);
            matiere_form.setVisible(false);
            Module_form.setVisible(false);

            studentGrade_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            addStudents_btn.setStyle("-fx-background-color:transparent");
            gestionmatiere_btn.setStyle("-fx-background-color:transparent");
            availableCourse_btn.setStyle("-fx-background-color:transparent");
            gestionmodule_btn.setStyle("-fx-background-color:transparent");


                studentGradesShowListData();

//            studentGradesShowListData();
//            studentGradesSearch();
        } else if (event.getSource() == gestionmatiere_btn) {
//            home_form.setVisible(false);
            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(false);
            matiere_form.setVisible(true);
            Module_form.setVisible(false);


            gestionmatiere_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            studentGrade_btn.setStyle("-fx-background-color:transparent");
            addStudents_btn.setStyle("-fx-background-color:transparent");
             gestionmodule_btn.setStyle("-fx-background-color:transparent");
            availableCourse_btn.setStyle("-fx-background-color:transparent");
//            home_btn.setStyle("-fx-background-color:transparent");

            availableMatiereShowListData();
            MatiereModuleList();
//            studentGradesSearch();
        } else if (event.getSource() == gestionmodule_btn) {

            addStudents_form.setVisible(false);
            availableCourse_form.setVisible(false);
            studentGrade_form.setVisible(false);
            matiere_form.setVisible(false);
            Module_form.setVisible(true);


            gestionmodule_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3f82ae, #26bf7d);");
            studentGrade_btn.setStyle("-fx-background-color:transparent");
             gestionmatiere_btn.setStyle("-fx-background-color:transparent");
            addStudents_btn.setStyle("-fx-background-color:transparent");
            availableCourse_btn.setStyle("-fx-background-color:transparent");
//            home_btn.setStyle("-fx-background-color:transparent");


            availableModuleShowListData();
            moduleYearList();
            filiereModuleList();
//            studentGradesSearch();
        }


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
              addStudentsShowListData();
              addStudentsYearList();
              addStudentsStatusList();
              addStudentsGenderList();
              addStudentsCourseList();
              moduleYearList();
              filiereModuleList();
              MatiereModuleList();
              availableFiliereShowListData();          
              availableModuleShowListData();
              availableMatiereShowListData();
              studentGradesShowListData();

            System.out.println("Initialisation du contrôleur dashboardController...");
        }

}
