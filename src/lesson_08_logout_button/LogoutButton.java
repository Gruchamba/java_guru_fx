package lesson_08_logout_button;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class LogoutButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(windowEvent -> {
            windowEvent.consume();
            logout(primaryStage);
        });

        primaryStage.show();

    }

    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Вы уверены что хотите выйти?");
        alert.setHeaderText("Это заголовок");
        alert.setContentText("Выходим?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();
        }


    }
}
