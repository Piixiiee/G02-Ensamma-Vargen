package Controller;

import Model.Forrest.Choice;
import Model.Forrest.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Objects;

public class NewGameController {

    Event event;

    @FXML
    private TextArea textBox;

    @FXML
    private ImageView GameImage, Cross;

    @FXML
    private Button ChoiceButton1, ChoiceButton2, ChoiceButton3, ChoiceButton4, ExitButton;

    public void initialize() {
        textBox.setText(event.getEventText());
    }

    public void pressedExitButton() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../View/MainMenu.fxml")));
        Stage aboutStage = (Stage) ExitButton.getScene().getWindow();
        aboutStage.setScene(new Scene(root));
    }

}
