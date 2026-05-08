package org.example.pruebafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EstudianteApplication extends Application {

    // Trasladamos la variable static scene de tu ejemplo
    static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Cargamos la vista de estudiantes (ajustamos el tamaño un poco más grande para la tabla)
        FXMLLoader fxmlLoader = new FXMLLoader(EstudianteApplication.class.getResource("estudiante-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 500, 700);
        stage.setTitle("Mantenimiento de Estudiantes");
        stage.setScene(scene);
        stage.show();
    }

    // Trasladamos el método loadFXML exactamente igual
    private static Parent loadFXML (String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EstudianteApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // Trasladamos el método setRoot exactamente igual
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
}
