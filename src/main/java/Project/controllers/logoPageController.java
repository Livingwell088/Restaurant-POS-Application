package Project.controllers;

import Project.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class logoPageController {

    @FXML public AnchorPane anchorPane;
    @FXML public AnchorPane content;
    @FXML public Button button;
    @FXML public ImageView image;
    @FXML public Label name;
    @FXML public VBox vbox;

    @FXML
    public void initialize() {
        anchorPane.resize(App.winWidth, App.winHeight);
        content.setLayoutX(App.winWidth / 2 - (image.getFitWidth() / 2));
        content.setLayoutY(App.winHeight / 4);
        vbox.setPrefWidth(image.getFitWidth() * 2);
        name.setLayoutX(App.winWidth / 2 - (vbox.getWidth() / 2));
        name.setLayoutY(App.winHeight / 4);
        name.setAlignment(Pos.CENTER);
    }

    public void toMainPage(ActionEvent actionEvent) {}
}
