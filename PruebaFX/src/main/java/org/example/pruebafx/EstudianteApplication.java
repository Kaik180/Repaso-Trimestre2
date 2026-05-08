package org.example.pruebafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EstudianteApplication extends Application {


    static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(EstudianteApplication.class.getResource("estudiante-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 500, 700);
        stage.setTitle("Mantenimiento de Estudiantes");
        stage.setScene(scene);
        stage.show();
    }


    private static Parent loadFXML (String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EstudianteApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
}
