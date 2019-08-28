package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextArea txtName;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lblName;

    @FXML
    void showName(MouseEvent event) {
        //System.out.println("in showName");
        String name;
        name = txtName.getText();
        System.out.println(name);

        lblName.setText(name);
    }

}
