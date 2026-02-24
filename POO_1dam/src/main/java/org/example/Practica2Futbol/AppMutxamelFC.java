package org.example.Practica2Futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMutxamelFC {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();

    private static final String PATRON_FORMACION = "\\d-\\d-\\d";

    // MAIN CORRECTO
    public static void main(String[] args) {

        String opcion;
        do {
            System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
            System.out.println("1. Mantenimiento de jugadores");
            System.out.println("2. Mantenimiento de entrenadores");
            System.out.println("3. Mantenimiento de masajistas");
            System.out.println("4. Consultar equipos");
            System.out.println("X. Salir");
            System.out.println("==========================================================================================");
            System.out.print("Selecciona una opción --> ");

            opcion = teclado.nextLine().trim().toUpperCase();

            switch (opcion) {
                case "1":
                    // menuJugadores();
                    break;
                case "2":
                    menuEntrenadores();
                    break;
                case "3":
                    // menuMasajistas();
                    break;
                case "4":
                    // consultarEquipos();
                    break;
                case "X":
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (!opcion.equals("X"));
    }

    // ============================
    //      MENÚ ENTRENADORES
    // ============================

    private static void menuEntrenadores() {
        String opcion;

        do {
            System.out.println("\n=== Mantenimiento de Entrenadores ===");
            System.out.println("[1]. Añadir nuevo entrenador");
            System.out.println("[2]. Modificar datos de entrenador existente");
            System.out.println("[X]. Volver al menú principal");
            System.out.print("Selecciona una opción --> ");

            opcion = teclado.nextLine().trim().toUpperCase();

            switch (opcion) {
                case "1":
                    añadirEntrenador();
                    break;
                case "2":
                    modificarEntrenador();
                    break;
                case "X":
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (!opcion.equals("X"));
    }

    // ============================
    //      AÑADIR ENTRENADOR
    // ============================

    private static void añadirEntrenador() {

        try {
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
                return;
            }

            System.out.print("Edad: ");
            int edad = Integer.parseInt(teclado.nextLine());

            if (edad < 18) {
                System.out.println("Un entrenador debe ser mayor de edad.");
                return;
            }

            System.out.println("Equipo que entrena (BENJAMIN, ALEVÍN, INFANTIL, CADETE, JUVENIL, SENIOR): ");
            String equipoStr = teclado.nextLine().toUpperCase();

            Equipos equipo;
            try {
                equipo = Equipos.valueOf(equipoStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Categoría no válida.");
                return;
            }

            System.out.print("Formación preferida (formato N-N-N): ");
            String formacion = teclado.nextLine().trim();

            // Validar formación con excepción personalizada
            validarFormacion(formacion);

            // Crear entrenador
            Entrenador nuevo = new Entrenador(nombre, edad, equipo, formacion);
            listaEntrenadores.add(nuevo);

            System.out.println("Entrenador añadido correctamente.");

        } catch (FormacionIncorrectaException e) {
            System.out.println("¡Error! " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("La edad debe ser un número.");
        } catch (Exception e) {
            System.out.println("Error inesperado al introducir los datos.");
        }
    }

    private static void validarFormacion(String formacion) throws FormacionIncorrectaException {

        if (!formacion.matches(PATRON_FORMACION)) {
            throw new FormacionIncorrectaException(
                    "La formación debe tener el formato N-N-N (por ejemplo 4-3-3)."
            );
        }
    }

    private static void modificarEntrenador() {

        if (listaEntrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
            return;
        }

        System.out.println("=== Lista de entrenadores ===");
        for (int i = 0; i < listaEntrenadores.size(); i++) {
            System.out.println("[" + i + "] " + listaEntrenadores.get(i));
        }

        System.out.print("Selecciona un entrenador --> ");
        int idx = Integer.parseInt(teclado.nextLine());

        if (idx < 0 || idx >= listaEntrenadores.size()) {
            System.out.println("Índice no válido.");
            return;
        }

        Entrenador e = listaEntrenadores.get(idx);

        System.out.println("¿Qué quieres modificar? [nombre, edad, equipo, formacion]");
        String campo = teclado.nextLine().toLowerCase();

        try {
            switch (campo) {
                case "nombre":
                    System.out.print("Nuevo nombre: ");
                    e.setNombre(teclado.nextLine());
                    break;

                case "edad":
                    System.out.print("Nueva edad: ");
                    e.setEdad(Integer.parseInt(teclado.nextLine()));
                    break;

                case "equipo":
                    System.out.print("Nuevo equipo: ");
                    e.setEquipo(Equipos.valueOf(teclado.nextLine().toUpperCase()));
                    break;

                case "formacion":
                    System.out.print("Nueva formación (N-N-N): ");
                    String nuevaFormacion = teclado.nextLine();
                    validarFormacion(nuevaFormacion);
                    e.setFormacionPreferida(nuevaFormacion);
                    break;

                default:
                    System.out.println("Campo no válido.");
            }

            System.out.println("Modificación realizada.");

        } catch (FormacionIncorrectaException ex) {
            System.out.println("¡Error! " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error en los datos introducidos.");
        }
    }
}

