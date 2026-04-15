package org.example.pruebafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    static Contador contador = new Contador();
    @FXML
    private Label welcomeText;

//    @FXML
//   private Button pruebaPulsarButton;
//
//   @FXML
//   private Label contadorLabel;
//
//   @FXML
//  public void initialize() {
//       Contador cont = new Contador();
//
//     pruebaPulsarButton.setOnAction(x -> {
//           cont.contar();
//          contadorLabel.setText(Integer.toString(cont.getContador()));
//      });
//  }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public  void siguienteClickButton() throws IOException {
        HelloApplication.setRoot("segunda-view");
    }

    public void guardarButton(ActionEvent actionEvent) {
    }


//    public  void resetContador() throws IOException {
//        contador.resetear();
//        contadorLabel.setText(Integer.toString(contador.getContador()));
//    }
}
