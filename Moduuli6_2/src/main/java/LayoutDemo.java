import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    @Override
    public void start(Stage stage) {
        GridPane layout = new GridPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");
        Button button5 = new Button("MIDDLE (with long text)");

        layout.add(button1, 0, 0);
        layout.add(button2, 1, 0);
        layout.add(button3, 0, 1);
        layout.add(button4, 1, 1);
        layout.add(button5, 0, 2, 2, 1);

        Scene view = new Scene(layout);

        StackPane layout2 = new StackPane();

        Button button12 = new Button("[           ]");
        Label label = new Label("Hello!");

        label.setOpacity(0.5);

        layout2.getChildren().add(button12);
        layout2.getChildren().add(label);

        Scene view2 = new Scene(layout2);

        view.getStylesheets().add("style.css");
        view2.getStylesheets().add("style.css");

        stage.setScene(view2);
        stage.show();

        button12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(view);
            }
        });

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(view2);
            }
        });
    }
}