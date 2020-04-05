package Login;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Login {

  @FXML
  private Button signInButton;

  @FXML
  void signIn(ActionEvent event) throws IOException {
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Parent root = FXMLLoader
        .load(getClass().getResource("../ResidentList/ResidentsList.fxml"));
    primaryStage.setTitle("Resident List");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }

}