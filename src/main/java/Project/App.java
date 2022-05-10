package Project;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {

    private static Stage _primaryStage;

    public static Stage getPrimaryStage() {
        return _primaryStage;
    }

    public static double winHeight;
    public static double winWidth;

    @Override
    public void init() {
        log.info("Starting Up");
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        winHeight = screenBounds.getHeight();
        winWidth = screenBounds.getWidth();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/logoPage.fxml"));
        _primaryStage = primaryStage;

        Parent root = loader.load();
        primaryStage.setTitle("Bapp - Home Page");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/styles/style.css");
        App.getPrimaryStage().setMinHeight(600);
        App.getPrimaryStage().setMinWidth(900);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
        //        winHeight = primaryStage.getHeight();
        //        //        System.out.println(winHeight);
        //        winWidth = primaryStage.getWidth();
        //        //        System.out.println(winWidth);
    }

    @Override
    public void stop() {
        log.info("Shutting Down");
    }
}
