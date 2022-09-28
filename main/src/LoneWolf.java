import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class LoneWolf extends Application{

   @Override
   public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GUI/MainMenu.fxml")));
       Scene scene = new Scene(root);
       stage.setTitle("Lone Wolf");
       Image icon = new Image("images/lonewolflogo.png");
       stage.getIcons().add(icon);
       stage.setScene(scene);
       stage.setResizable(false);
       stage.show();
   }
    public static void main(String[] args) {
        /* launch(args);


        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                Model.getInstance().shutDown();

            }
        })); */

        /*
        This method is only for playing in the terminal, comment out if not wanted
         */
        Controller.startTerminalGame();
    }
}
