package mx.com.vemm.learninglambdaexpfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Button button = new Button();
        button.setText("Click me!");
        button.setFont(new Font(24));
        button.setOnAction(actionEvent -> System.out.println("Hello world!"));
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello world!");
//            }
//        });


        StackPane root = new StackPane();
        root.getChildren().add(button);

        stage.setScene(new Scene(root, 300, 300));
        stage.setTitle("Hello");
        stage.show();

    }


}