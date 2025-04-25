package Question3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class BookApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BookApplication.class.getResource("Book-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("library Management");
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
