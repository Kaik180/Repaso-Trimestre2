package org.example.pruebafx;

import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class SegundoController {
    static ObservableList<Persona> listaPersona = FXCollections.observableArrayList();
    @FXML
    private Label welcomeText;

    @FXML
    private Button AtrasButton;

    @FXML
    private TableView<Persona> PersonasTableView;

    @FXML
    private TableColumn<Persona,String> nombreTableColumn;

    @FXML
    private TableColumn<Persona,Integer> edadTableColumn;

    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField edadTextField;

    @FXML
    private void initialize(){
        nombreTableColumn.setCellValueFactory(datos -> new SimpleStringProperty(datos.getValue().getNombre()));
        edadTableColumn.setCellValueFactory(datos -> new SimpleIntegerProperty(datos.getValue().getEdad()).asObject());
        PersonasTableView.setItems(listaPersona);
    }


    public  void atrasClickButton() throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }

    public void guardarButton(){
        String nombre = nombreTextField.getText();
        Integer edad = Integer.parseInt(edadTextField.getText());

        Persona persona = new Persona(nombre,edad);
        listaPersona.add(persona);

        System.out.println("Persona creada "+ nombre+ "-"+ edad);
        System.out.println(listaPersona);
        nombreTextField.clear();
        edadTextField.clear();


    }
}
