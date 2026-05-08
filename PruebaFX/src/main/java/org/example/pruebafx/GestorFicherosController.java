package org.example.pruebafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;

public class GestorFicherosController {
    private ActividadesFicheros logica = new ActividadesFicheros();

    @FXML private TextField nombreBaseField;
    @FXML private TextField cantidadField;
    @FXML private TextField palabraBusquedaField;

    @FXML
    public void ejecutarGenerar() {
        try {
            String nombre = nombreBaseField.getText();
            int n = Integer.parseInt(cantidadField.getText());
            logica.generarArchivos(nombre, n);
            System.out.println("Ficheros creados correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un número válido en la cantidad.");
        }
    }

    @FXML
    public void ejecutarListar() {
        System.out.println("Listado de archivos .txt en resources:");
        logica.listarPorExtension(".txt");
    }

    @FXML
    public void ejecutarContar() {
        String archivo = nombreBaseField.getText();
        String palabra = palabraBusquedaField.getText();
        if (!archivo.isEmpty() && !palabra.isEmpty()) {
            logica.buscarPalabra(archivo, palabra);
        } else {
            System.out.println("Rellena el nombre del archivo y la palabra.");
        }
    }

    @FXML
    public void ejecutarBorrar() {
        logica.borrarFichero(nombreBaseField.getText());
    }

    @FXML
    public void atrasClickButton() throws IOException {
        HelloApplication.setRoot("hello-view");
    }
}