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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author macbookpro
 */
public class NewStudentController implements Initializable {

    @FXML
    private AnchorPane main;
    @FXML
    private Pane newStudentPane;
    @FXML
    private JFXButton addStudentSecondPage;
    @FXML
    private JFXButton CancelAddingBtn;
    @FXML
    private JFXTextField firstNameTextField;
    @FXML
    private JFXTextField secondNameTextField;
    @FXML
    private JFXDatePicker birthDayDatePicker;
    @FXML
    private JFXTextField nationalityTextField;
    @FXML
    private JFXTextField HomePhoneTextField;
    @FXML
    private JFXTextField cellPhoneTextField;
    @FXML
    private JFXTextArea homeAdressTextField;
    @FXML
    private JFXTextField emailTextField;
    @FXML
    private JFXTextField faxTextField;
    @FXML
    private JFXTextField cityTextField;
    @FXML
    private JFXTextField zipCodeTextField;
    @FXML
    private JFXButton uploadImgBtn;
    @FXML
    private ComboBox<String> genderchoiceBox;
    @FXML
    private ComboBox<String> LevelchoiceBox;
    @FXML
    private ComboBox<String> ClasschoiceBox;
    @FXML
    private JFXTextField FatherNameTextField;
    @FXML
    private JFXTextField MotherNameTextField1;
 private String[] gender = {
        "BOY", "Girl"
    };
    String[] level ={
        "level1","level2","level3","level4","level5","level6"
    };
    String[] classes ={
        "class 1","class 2","class 3","class 4","class 5","class 6"
    };
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        genderchoiceBox.getItems().addAll(gender);
        LevelchoiceBox.getItems().addAll(level);
        ClasschoiceBox.getItems().addAll(classes);
    }    
        @FXML
    private JFXButton closebtn;

    @FXML
    private void handlerClicks(ActionEvent event) {
        if(event.getSource() == closebtn){
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            }
    }

    @FXML
    private void uploadImage(ActionEvent event) {
        
    }
    
}
