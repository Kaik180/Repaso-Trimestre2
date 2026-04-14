package org.example.pruebafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private static int contador;
    @FXML
    private Label welcomeText;

    @FXML
    private Button pruebaPulsarButton;

    @FXML
    private Label contadorLabel;
    @FXML
    private Label contadorLabel;


    @FXML
    public void initialize(){
        Contador cont = new Contador();
        pruebaPulsarButton.setOnAction(x ->{
          cont.contar();
          contadorLabel.setText(Integer.toString(cont.getContador()));

                }



        );
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
