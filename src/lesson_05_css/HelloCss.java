package lesson_05_css;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloCss extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));

        String css = getClass().getResource("Main.css").toExternalForm();

        Scene scene = new Scene(parent);
        scene.getStylesheets().addAll(css);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
