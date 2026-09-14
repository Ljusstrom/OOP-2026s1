import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {
    private static final String HELLO = "Heippa maailma!";
    private static final String HELLO2 = "Heippa universumi!";

    public void start(Stage window) {
        Label text = new Label(HELLO);
        Button btn = new Button("Press me");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (text.getText() == HELLO) {
                    text.setText(HELLO2);
                } else {
                    text.setText(HELLO);
                }
            }
        });

        // Container pitää olla, koska Scene() ottaa vastaan vain yhden controllin.
        FlowPane pane = new FlowPane();
        pane.getChildren().add(text);
        pane.getChildren().add(btn);

        Scene view = new Scene(pane, 640, 320);
        window.setTitle("My Greeting Application");
        window.setScene(view);
        window.show();
        window.setMinHeight(320);
        window.setMinWidth(640);
    }

    // ÄLKÄÄ IKINÄ LAITTAKO MAIN SAMAAN TIEDOSTOON KUIN JAVAFX !!
//    public static void main(String[] args) {
//        HelloWorldApplication.launch(args);
//    }
}