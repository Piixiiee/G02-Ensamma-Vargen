package lonewolf;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class LoneWolfController {

        @FXML
        private StackPane mainmenuStackPane;
        @FXML
        private StackPane aboutpageStackPane;

        //buttons
        @FXML
        private Button aboutpageBackButton;
        @FXML
        private Button mainmenuAboutPageButton;
        //background images
        @FXML
        private ImageView mainmenuBG;


        public void aboutpageToButton(){
                aboutpageStackPane.toFront();
        }
        public void aboutopageBackButton(){
                mainmenuStackPane.toFront();
        }
}
