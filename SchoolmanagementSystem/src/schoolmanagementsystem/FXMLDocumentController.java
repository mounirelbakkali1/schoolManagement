/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author macbookpro
 */
public class FXMLDocumentController implements Initializable {

    private Pane newStudentPane;

    private String[] yaear = {
        "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"
    };
    @FXML
    private JFXButton studentBtn;
    @FXML
    private JFXButton teachersBtn;
    @FXML
    private JFXButton rhBtn;
    @FXML
    private JFXButton feesBtn;
    
    @FXML
    private JFXButton settingsBtn;
    @FXML
    private AnchorPane rightSidePageAnch;
    @FXML
    private GridPane gridStudents;
    @FXML
    private ComboBox<String> StudentyearChoiceBox;
    @FXML
    private TextField searchStuentsInTab;
    @FXML
    private Pane menuPane;
    @FXML
    private Label titleMenu;
    @FXML
    private Label menuSubDomain;
    @FXML
    private VBox rightvBox;
     @FXML
    private Pane leftPane;
    private JFXButton addStudentSecondPage;
    private JFXButton CancelAddingBtn;
    private JFXTextField firstNameTextField;
    private JFXTextField secondNameTextField;
    private JFXTextField nationalityTextField;
    @FXML
    private JFXButton addStuedentFirstPage;
    @FXML
    private JFXButton closebtn;
    @FXML
    private JFXButton searchbtn;
    @FXML
    private AnchorPane main;
        @FXML
    private AnchorPane anchStudent;
    @FXML
    private BorderPane teacherAnch;
    @FXML
    private JFXButton addStuedentFirstPage1;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        StudentyearChoiceBox.getItems().addAll(yaear);
        
        main.setStyle("-fx-background-image: url(\"/img/png1.png\");-fx-background-repeat: no-repeat;\n" +
"-fx-background-size: cover;");

        

    }

    
    @FXML
    private void handlerClicks(ActionEvent event) throws IOException{
        if(event.getSource() == addStuedentFirstPage){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneNewStudent.fxml"));
            Parent root = loader.load();
         
            NewStudentController sceneNewStudent = loader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            
        }
//        else if(event.getSource() == addStuedentFirstPage){
//            
//        }
        else if(event.getSource() == closebtn){
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            
        }else if(event.getSource() == CancelAddingBtn){
            newStudentPane.setVisible(false);
   
        }else if(event.getSource() == addStudentSecondPage){
            List<JFXTextField> textFields = Arrays.asList(firstNameTextField, secondNameTextField, nationalityTextField);
            for (TextField field : textFields) {
                if (field.getText().isEmpty()) {
                    
                    break;
                }
            }
        }else if (event.getSource()==teachersBtn){
            menuSubDomain.setText("/Home/teachers");
            titleMenu.setText("Teachers");
            anchStudent.setVisible(false);
            teacherAnch.setVisible(true);
            
        }
        else if (event.getSource()==studentBtn){
            menuSubDomain.setText("/Home/students");
            titleMenu.setText("Students");
            anchStudent.setVisible(true);
            teacherAnch.setVisible(false);
        }

        
    }
    
    
    


}
