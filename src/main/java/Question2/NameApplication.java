package Question2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NameApplication extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NameApplication.class.getResource("Name-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Display Name");
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }

    public static void main(String[] args) {
            launch();
        }
}
