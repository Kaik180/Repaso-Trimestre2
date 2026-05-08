package org.example.pruebafx;

import java.io.*;
import java.util.Scanner;

public class ActividadesFicheros {


    private static final String RUTA = "src/main/resources/";


    public void generarArchivos(String nombreBase, int n) {
        for (int i = 1; i <= n; i++) {
            File archivo = new File(RUTA + nombreBase + "(" + i + ").txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {

                writer.write("Este es el fichero " + nombreBase + "(" + i + ").txt");
            } catch (IOException e) {
                System.out.println("Error al crear archivo: " + e.getMessage());
            }
        }
    }


    public void listarPorExtension(String extension) {
        File carpeta = new File(RUTA);
        String[] archivos = carpeta.list((dir, nombre) -> nombre.endsWith(extension));
        if (archivos != null) {
            for (String a : archivos) System.out.println(a);
        }
    }

    public void buscarPalabra(String nombreArchivo, String palabra) {
        File archivo = new File(RUTA + nombreArchivo);
        int contador = 0;
        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNext()) {
                if (sc.next().equalsIgnoreCase(palabra)) contador++;
            }
            System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        }
    }

    public void convertirMayusculas(String nombreOriginal) {
        File archivo = new File(RUTA + nombreOriginal);
        File temp = new File(RUTA + "temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(temp))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split(" ");
                StringBuilder nuevaLinea = new StringBuilder();
                for (String p : palabras) {
                    if (p.length() > 0) {
                        nuevaLinea.append(p.substring(0, 1).toUpperCase()).append(p.substring(1)).append(" ");
                    }
                }
                writer.write(nuevaLinea.toString().trim());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (archivo.delete()) {
            temp.renameTo(archivo);
            System.out.println("Archivo modificado correctamente.");
        }
    }

    public void combinarArchivos(String archivo1, String archivo2, String resultado) {
        try (Scanner sc1 = new Scanner(new File(RUTA + archivo1));
             Scanner sc2 = new Scanner(new File(RUTA + archivo2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA + resultado))) {

            while (sc1.hasNext() || sc2.hasNext()) {
                if (sc1.hasNext()) writer.write(sc1.next() + " ");
                if (sc2.hasNext()) writer.write(sc2.next() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
