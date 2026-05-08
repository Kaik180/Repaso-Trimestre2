package org.example.pruebafx;

public class PrincipalFicheros {
    public static void main(String[] args) {
        ActividadesFicheros app = new ActividadesFicheros();

        app.generarArchivos("ejemplo", 3);

        app.listarPorExtension(".txt");

        app.convertirMayusculas("ejemplo(1).txt");
    }
}
