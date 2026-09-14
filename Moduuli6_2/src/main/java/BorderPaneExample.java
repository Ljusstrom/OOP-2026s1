import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        Button topButton = new Button("NORTH");
        Button rightButton = new Button("EAST");
        Button bottomButton = new Button("SOUTH");
        Button leftButton = new Button("WEST");
        Button centerButton = new Button("CENTER");

        layout.setTop(topButton);
        layout.setRight(rightButton);
        layout.setBottom(bottomButton);
        layout.setLeft(leftButton);
        layout.setCenter(centerButton);

        layout.setAlignment(topButton, Pos.CENTER);
        layout.setAlignment(bottomButton, Pos.CENTER);
        layout.setAlignment(leftButton, Pos.CENTER_LEFT);
        layout.setAlignment(rightButton, Pos.CENTER_RIGHT);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

}