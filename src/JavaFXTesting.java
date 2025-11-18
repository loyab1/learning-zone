import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
public class JavaFXTesting extends Application {
    public void start(Stage stage) {

        // Create a simple text label
        Label label = new Label("Hello");


        Rectangle line = new Rectangle(100,10,10,100);
        line.setFill(Color.RED);


        Group root = new Group(label,line);
        // Create a scene (window contents) sized 300x200
        Scene scene = new Scene(root, 300, 200);

        // Set up the stage (the top-level window)
        stage.setTitle("Hello JavaFX");
        stage.setScene(scene);
        stage.show(); // display the window
    }

    public static void main(String[] args) {
        launch(args); // launch the JavaFX application
    }
}

