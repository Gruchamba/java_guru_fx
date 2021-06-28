package lesson_04_event_handler;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class CircleController {

    @FXML
    private Circle circle;

    public void up() {
        circle.setCenterY(circle.getCenterY() - 10);
        System.err.println("UP");
    }

    public void down() {
        circle.setCenterY(circle.getCenterY() + 10);
        System.err.println("DOWN");
    }

    public void left() {
        circle.setCenterX(circle.getCenterX() - 10);
        System.err.println("LEFT");
    }

    public void right() {
        circle.setCenterX(circle.getCenterX() + 10);
        System.err.println("RIGHT");
    }

}
