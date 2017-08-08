/********************
 * Andrew Evans
 * Mini Project #3
 * CS 1302 Section 4
 * DentistOfficeGUI Class
 ********************/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

import javafx.event.Event;
import javafx.event.EventHandler;

import java.awt.*;

public class DentistOfficeGUI extends Application implements EventHandler<ActionEvent> {

    //Labels
    Label userNameLabel;
    Label passwordLabel;

    Label patientID;
    Label patientPassword;
    Label patientFirstName;
    Label patientLastName;
    Label patientAddress;
    Label patientEMail;
    Label patientInsCo;

    Label dentistID;
    Label dentistPassword;
    Label dentistFirstName;
    Label dentistLastName;
    Label dentistEMail;
    Label dentistOfficeNumber;

    //TextField Inputs
    TextField userNameInput;
    TextField passwordInput;

    TextField patientIDInput;
    TextField patientPasswordInput;
    TextField patientFirstNameInput;
    TextField patientLastNameInput;
    TextField patientAddressInput;
    TextField patientEMailInput;
    TextField patientInsCoInput;

    TextField dentistIDInput;
    TextField dentistPasswordInput;
    TextField dentistFirstNameInput;
    TextField dentistLastNameInput;
    TextField dentistEMailInput;
    TextField dentistOfficeNumberInput;

    //Buttons
    Button loginButton;
    Button clearButton;
    Button exitButton;
    Button displayPatientAppointment;

    //ComboBox Dropdown Button
    ComboBox<Appointment> displayDentistAppointment;

    //Setting Up Stages
    Stage window;
    Stage patientStage = new Stage();
    Stage dentistStage = new Stage();


    @Override
    public void start(Stage primaryStage) {

        //Creating Titles
        window = primaryStage;
        window.setTitle("Dentist Office Login System");
        patientStage.setTitle("Patient Information");
        dentistStage.setTitle("Dentist Information");


        //Setting Up GridPanes
        GridPane grid = new GridPane();
        GridPane patientGrid = new GridPane();
        GridPane dentistGrid = new GridPane();

        //Main Login Screen Gridpane Format
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Patient GridPane Format
        patientGrid.setPadding(new Insets(10, 10, 10, 10));
        patientGrid.setVgap(8);
        patientGrid.setHgap(10);

        //Dentist GridPane Format
        dentistGrid.setPadding(new Insets(10, 10, 10, 10));
        dentistGrid.setVgap(8);
        dentistGrid.setHgap(10);


        //Login Information Header
        Text loginInfo = new Text("Login Information");
        loginInfo.setFill(Color.BLACK);
        loginInfo.setStyle("-fx-font: 30 georgia;");
        grid.setConstraints(loginInfo, 0 , 0);


        //Username Label Format
        userNameLabel = new Label();
        userNameLabel.setText("Username");
        grid.setConstraints(userNameLabel, 0, 1);

        //Username Input Window Format
        userNameInput = new TextField();
        grid.setConstraints(userNameInput, 1, 1);

        //Password Label Format
        passwordLabel = new Label();
        passwordLabel.setText("Password");
        grid.setConstraints(passwordLabel, 0, 2);

        //Password Input Window Format
        passwordInput = new TextField();
        grid.setConstraints(passwordInput, 1, 2);


        //Patient Login Header
        Text patientInfo = new Text("Patient Information");
        patientInfo.setFill(Color.BLACK);
        patientInfo.setStyle("-fx-font: 30 georgia;");
        patientGrid.setConstraints(patientInfo, 0 , 0);

        //Patient ID Label Format
        patientID = new Label();
        patientID.setText("Patient I.D.");
        patientGrid.setConstraints(patientID, 0, 1);

        //Patient ID Input Window Format
        patientIDInput = new TextField();
        patientGrid.setConstraints(patientIDInput, 1, 1);

        //Patient Password Label Format
        patientPassword = new Label();
        patientPassword.setText("Password");
        patientGrid.setConstraints(patientPassword, 0, 2);

        //Patient Password Input window Format
        patientPasswordInput = new TextField();
        patientGrid.setConstraints(patientPasswordInput, 1, 2);

        //Patient First Name Label Format
        patientFirstName = new Label();
        patientFirstName.setText("First Name");
        patientGrid.setConstraints(patientFirstName, 0, 3);

        //Patient First Name Input Window Format
        patientFirstNameInput = new TextField();
        patientGrid.setConstraints(patientFirstNameInput, 1, 3);

        //Patient Last Name Label Format
        patientLastName = new Label();
        patientLastName.setText("Last Name");
        patientGrid.setConstraints(patientLastName, 0, 4);

        //Patient Last Name Input Window Format
        patientLastNameInput = new TextField();
        patientGrid.setConstraints(patientLastNameInput, 1, 4);

        //Patient Address Label Format
        patientAddress = new Label();
        patientAddress.setText("Address");
        patientGrid.setConstraints(patientAddress, 0, 5);

        //Patient Address Input Window Format
        patientAddressInput = new TextField();
        patientGrid.setConstraints(patientAddressInput, 1, 5);

        //Patient E-Mail Label Format
        patientEMail = new Label();
        patientEMail.setText("E-Mail");
        patientGrid.setConstraints(patientEMail, 0, 6);

        //Patient E-Mail Input Window Format
        patientEMailInput = new TextField();
        patientGrid.setConstraints(patientEMailInput, 1, 6);

        //Patient Insurance Company Label Format
        patientInsCo = new Label();
        patientInsCo.setText("Insurance Company");
        patientGrid.setConstraints(patientInsCo, 0, 7);

        //Patient Insurance Company Input Window Format
        patientInsCoInput = new TextField();
        patientGrid.setConstraints(patientInsCoInput, 1, 7);


        //Dentist Login Header
        Text dentistInfo = new Text("Dentist Information");
        dentistInfo.setFill(Color.BLACK);
        dentistInfo.setStyle("-fx-font: 30 georgia;");
        dentistGrid.setConstraints(dentistInfo, 0 , 0);

        //Dentist ID Label Format
        dentistID = new Label();
        dentistID.setText("Dentist ID");
        dentistGrid.setConstraints(dentistID, 0, 1);

        //Dentist ID Input Window Format
        dentistIDInput = new TextField();
        dentistGrid.setConstraints(dentistIDInput, 1, 1);

        //Dentist Password Label Format
        dentistPassword = new Label();
        dentistPassword.setText("Password");
        dentistGrid.setConstraints(dentistPassword, 0, 2);

        //Dentist Password Input Window Format
        dentistPasswordInput = new TextField();
        dentistGrid.setConstraints(dentistPasswordInput, 1, 2);

        //Dentist First Name Label Format
        dentistFirstName = new Label();
        dentistFirstName.setText("First Name");
        dentistGrid.setConstraints(dentistFirstName, 0, 3);

        ///Dentist First Name Input Window Format
        dentistFirstNameInput = new TextField();
        dentistGrid.setConstraints(dentistFirstNameInput, 1, 3);

        //Dentist Last Name Label Format
        dentistLastName = new Label();
        dentistLastName.setText("Last Name");
        dentistGrid.setConstraints(dentistLastName, 0, 4);

        //Dentist Last Name Input Window Format
        dentistLastNameInput = new TextField();
        dentistGrid.setConstraints(dentistLastNameInput, 1, 4);

        //Dentist E-Mail Label Format
        dentistEMail = new Label();
        dentistEMail.setText("E-Mail");
        dentistGrid.setConstraints(dentistEMail, 0, 5);

        //Dentist E-Mail Input WIndow Format
        dentistEMailInput = new TextField();
        dentistGrid.setConstraints(dentistEMailInput, 1 , 5);

        //Dentist Office Number Label Format
        dentistOfficeNumber = new Label();
        dentistOfficeNumber.setText("Office Number");
        dentistGrid.setConstraints(dentistOfficeNumber, 0, 6);

        //Dentist Office Number Input Window Format
        dentistOfficeNumberInput = new TextField();
        dentistGrid.setConstraints(dentistOfficeNumberInput, 1, 6);





        //Login Button Format
        loginButton = new Button();
        loginButton.setText("Login");
        grid.setConstraints(loginButton, 0, 6);
        loginButton.setOnAction(this);

        //Clear Button Format
        clearButton = new Button();
        clearButton.setText("Clear");
        clearButton.setOnAction(this);
        grid.setConstraints(clearButton, 0, 7);

        //Exit Button Format and Action
        exitButton = new Button();
        exitButton.setText("Exit");
        exitButton.setOnAction(this);
        grid.setConstraints(exitButton, 0, 8);

        //Display Appointment Button Patient Window
        displayPatientAppointment = new Button();
        displayPatientAppointment.setText("Display Appointment");
        displayPatientAppointment.setOnAction(this);
        patientGrid.setConstraints(displayPatientAppointment, 0, 9);

        //Display Appointment Button on Dentist Window
        displayDentistAppointment = new ComboBox<>();
        displayDentistAppointment.setPromptText("Select Appointment");
        displayDentistAppointment.setOnAction(this);
        dentistGrid.setConstraints(displayDentistAppointment, 0, 8);


        //Adding all the elements to the grids

        grid.getChildren().addAll(loginInfo, userNameLabel, userNameInput, passwordLabel, passwordInput, loginButton, clearButton, exitButton);

        patientGrid.getChildren().addAll(patientInfo, patientID, patientIDInput, patientPassword, patientPasswordInput, patientFirstName, patientFirstNameInput, patientLastName, patientLastNameInput,
                                         patientAddress, patientAddressInput, patientEMail, patientEMailInput, patientInsCo, patientInsCoInput, displayPatientAppointment);

        dentistGrid.getChildren().addAll(dentistInfo, dentistID, dentistIDInput, dentistPassword, dentistPasswordInput, dentistFirstName, dentistFirstNameInput, dentistLastName, dentistLastNameInput,
                                          dentistEMail, dentistEMailInput, dentistOfficeNumber, dentistOfficeNumberInput, displayDentistAppointment);

        //Setting Up Scenes
        Scene scene = new Scene(grid, 600, 500);
        Scene scene2 = new Scene(patientGrid, 500, 400);
        Scene scene3 = new Scene(dentistGrid, 500, 400);


        window.setScene(scene);
        window.show();

        patientStage.setScene(scene2);

        dentistStage.setScene(scene3);

    }

    @Override
    public void handle(ActionEvent event) {

        /* If the user clicks on Login, get the username and determine whether it starts with D or A (d or a).
           If username passes first check, then make sure the password matches with the username.
           If it does, then pull data by utilizing getters.
        */

        if (loginButton == event.getSource()){
            String username =  userNameInput.getText();

            if (username.startsWith("d") || username.startsWith("D")){
                Dentist dentist = new Dentist();
                dentist.select(userNameInput.getText());
                if(passwordInput.getText().equalsIgnoreCase(dentist.getPassword())) {
                     dentistIDInput.setText(dentist.getDentId());
                     dentistFirstNameInput.setText(dentist.getFirstName());
                     dentistLastNameInput.setText(dentist.getLastName());
                     dentistEMailInput.setText(dentist.getEmail());
                     dentistOfficeNumberInput.setText(dentist.getOffice() + "");
                     displayDentistAppointment.getItems().clear();
                     displayDentistAppointment.getItems().addAll(dentist.getAp().getAppointmentList());
                    dentistStage.show();
                }
            }

            /* Repeat same process with Patient */

            if (username.startsWith("a") || username.startsWith("A")) {
                Patient patient = new Patient();
                patient.select(userNameInput.getText());
                if(passwordInput.getText().equalsIgnoreCase((patient.getPassword()))) {
                    patientIDInput.setText(patient.getPatId());
                    patientFirstNameInput.setText(patient.getFirstName());
                    patientLastNameInput.setText(patient.getLastName());
                    patientAddressInput.setText(patient.getAddress());
                    patientEMailInput.setText(patient.getEmail());
                    patientInsCoInput.setText(patient.getInsCo());
                    patientStage.show();
                }
            }
        }

        if (event.getSource() == exitButton){
            window.close();
        }
        if (event.getSource() == clearButton){
            userNameInput.setText("");
            passwordInput.setText("");
        }

        /* If the Display Appointment button is clicked in the Dentist Window, create a new Grid, Scene, and Stage.
           Then create labels and display TextFields by utilizing getters.
         */

        if(event.getSource() == displayDentistAppointment){
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(8);
            grid.setHgap(10);

            Appointment a = displayDentistAppointment.getValue();
            if(a != null) {
                Label dateLabel = new Label();
                dateLabel.setText("Date/Time");
                grid.add(dateLabel, 0, 0);

                TextField date = new TextField();
                date.setText(a.getApptDateTime());
                grid.add(date, 1, 0);

                Label patIDLabel = new Label();
                patIDLabel.setText("Patient ID");
                grid.add(patIDLabel, 0, 1);

                TextField patIDInput = new TextField();
                patIDInput.setText(a.getPatId());
                grid.add(patIDInput, 1, 1);

                Label dentIDLabel = new Label();
                dentIDLabel.setText("Dentist ID");
                grid.add(dentIDLabel, 0, 2);

                TextField dentIDInput = new TextField();
                dentIDInput.setText(a.getDentId());
                grid.add(dentIDInput, 1, 2);

                Label procCodeLabel = new Label();
                procCodeLabel.setText("Procedure Code");
                grid.add(procCodeLabel, 0, 3);

                TextField procCodeInput = new TextField();
                procCodeInput.setText(a.getProcCode());
                grid.add(procCodeInput, 1 ,3);

                Scene scene = new Scene(grid, 400, 400);
                Stage dentistStage = new Stage();
                dentistStage.setScene(scene);
                dentistStage.setTitle("Dentist Appointment Information");
                dentistStage.show();
            }
        }

        /* If the Display Appointment button is clicked in the Patient Window, create a new Grid, Scene, and Stage.
           Then create labels and display TextFields by utilizing getters.
         */

        if(event.getSource() == displayPatientAppointment){
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(8);
            grid.setHgap(10);

            Patient patient = new Patient();
            patient.select(patientIDInput.getText());
            Appointment a = patient.getAp();

            Label dateLabel = new Label();
            dateLabel.setText("Date/Time");
            grid.add(dateLabel, 0, 0);

            TextField date = new TextField();
            date.setText(a.getApptDateTime());
            grid.add(date, 1, 0);

            Label patIDLabel = new Label();
            patIDLabel.setText("Patient ID");
            grid.add(patIDLabel, 0, 1);

            TextField patIDInput = new TextField();
            patIDInput.setText(a.getPatId());
            grid.add(patIDInput, 1, 1);

            Label dentIDLabel = new Label();
            dentIDLabel.setText("Dentist ID");
            grid.add(dentIDLabel, 0, 2);

            TextField dentIDInput = new TextField();
            dentIDInput.setText(a.getDentId());
            grid.add(dentIDInput, 1, 2);

            Label procCodeLabel = new Label();
            procCodeLabel.setText("Procedure Code");
            grid.add(procCodeLabel, 0, 3);

            TextField procCodeInput = new TextField();
            procCodeInput.setText(a.getProcCode());
            grid.add(procCodeInput, 1 ,3);

            Scene scene = new Scene(grid, 400, 400);
            Stage patientStage = new Stage();
            patientStage.setScene(scene);
            patientStage.setTitle("Patient Appointment Information");
            patientStage.show();

        }
    }

    public static void main(String[] args) {
        /* This is used to correct a Windows 10 error.
           Without this, the ComboBox will crash the program
         */
        System.setProperty("glass.accessible.force", "false");
        launch(args);
    }

}
