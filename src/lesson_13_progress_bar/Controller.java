package lesson_13_progress_bar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ProgressBar indeterminateBar;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    private ProgressIndicator indeterminateIndicator;

    @FXML
    private CheckBox controlCheckBox;

    @FXML
    private Label label;

    private BigDecimal progressDecimal = new BigDecimal("0");

    public void plusProgress() {

        if (progressDecimal.doubleValue() >= -0.1 && progressDecimal.doubleValue() < 1) {

            progressDecimal = progressDecimal.add(new BigDecimal("0.1"));

            progressBar.setProgress(progressDecimal.doubleValue());
            progressIndicator.setProgress(progressDecimal.doubleValue());
            label.setText("Прогресс: " + progressDecimal.doubleValue());

        }
    }

    public void minusProgress() {

        if (progressDecimal.doubleValue() > -0.1 && progressDecimal.doubleValue() <= 1) {

            progressDecimal = progressDecimal.subtract(new BigDecimal("0.1"));

            progressBar.setProgress(progressDecimal.doubleValue());
            progressIndicator.setProgress(progressDecimal.doubleValue());
            label.setText("Прогресс: " + progressDecimal.doubleValue());

        }
    }

    public void switchStaterIndicator() {
        if (controlCheckBox.isSelected()) {
            indeterminateBar.setProgress(1.0);
            indeterminateIndicator.setProgress(1.0);
        } else {
            indeterminateBar.setProgress(-0.1);
            indeterminateIndicator.setProgress(-0.1);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        indeterminateIndicator.setStyle("-fx-accent: #3d5a3b;");
        indeterminateBar.setStyle("-fx-accent: #df1711");
    }
}
