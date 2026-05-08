package org.example.pruebafx;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;

public class EstudianteController {
    static ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();

    private Estudiante seleccionado;

    @FXML private TableView<Estudiante> tablaEstudiantes;
    @FXML private TableColumn<Estudiante, Integer> columnaNia;
    @FXML private TableColumn<Estudiante, String> columnaNombre;
    @FXML private TableColumn<Estudiante, LocalDate> columnaFechaNac;

    @FXML private TextField niaTextField;
    @FXML private TextField nombreTextField;
    @FXML private DatePicker fechaNacPicker;

    @FXML private Button botonInsertar;
    @FXML private Button botonGuardar;

    @FXML
    private void initialize() {
        columnaNia.setCellValueFactory(datos -> new SimpleIntegerProperty(datos.getValue().getNia()).asObject());
        columnaNombre.setCellValueFactory(datos -> new SimpleStringProperty(datos.getValue().getNombre()));

        columnaFechaNac.setCellValueFactory(datos ->
                new SimpleObjectProperty<>(datos.getValue().getFecha_nacimiento())
        );

        tablaEstudiantes.setItems(listaEstudiantes);


        botonGuardar.setDisable(true);
    }

    public void clickInsertar() {
        int nia = Integer.parseInt(niaTextField.getText());
        String nombre = nombreTextField.getText();
        LocalDate fecha = fechaNacPicker.getValue();

        Estudiante e = new Estudiante(nia, nombre, fecha);
        listaEstudiantes.add(e);

        limpiarCampos();
    }

    public void clickEditar() {
        seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            niaTextField.setText(String.valueOf(seleccionado.getNia()));
            nombreTextField.setText(seleccionado.getNombre());
            fechaNacPicker.setValue(seleccionado.getFecha_nacimiento());


            botonGuardar.setDisable(false);
            botonInsertar.setDisable(true);
        } else {

            System.out.println("No hay ninguna fila seleccionada.");
        }
    }

    public void clickGuardar() {
        if (seleccionado != null) {

            seleccionado.setNia(Integer.parseInt(niaTextField.getText()));
            seleccionado.setNombre(nombreTextField.getText());
            seleccionado.setFecha_nacimiento(fechaNacPicker.getValue());


            tablaEstudiantes.refresh();


            botonGuardar.setDisable(true);
            botonInsertar.setDisable(false);
            limpiarCampos();
            seleccionado = null;
        }
    }

    public void clickEliminar() {
        Estudiante sel = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (sel != null) {
            listaEstudiantes.remove(sel);
        } else {

            System.out.println("No hay ninguna fila seleccionada.");
        }
    }
    private void limpiarCampos() {
        niaTextField.clear();
        nombreTextField.clear();
        fechaNacPicker.setValue(null);
    }
}
