package lesson_07_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class ControllerLoginForm {

    private Stage stage;

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    public void login(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainForm.fxml"));
        Parent parent = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        ControllerMainForm controllerMainForm = loader.getController();
        controllerMainForm.setHelloText(loginField.getText());

        stage.setScene(new Scene(parent));
        stage.show();
    }

    public void exit() {
        System.exit(0);
    }
}
