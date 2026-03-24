package org.example.Ejemplos;

import java.util.*;

public class Excursion {
    private String nombre_actividad;
    private String localidad;
    private double precio;
    private List<String> profesores;
    private List<Estudiantea> listaAsistentes;

    public Excursion(String nombre, String localidad, double precio) {
        this.nombre_actividad = nombre;
        this.localidad = localidad;
        this.precio = precio;
        this.profesores = new ArrayList<>();
        this.listaAsistentes = new ArrayList<>();
    }

    public void insertarProfesor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del profesor/a para la excursión en " + localidad);
        String prof = sc.nextLine();
        profesores.add(prof);
        System.out.println("Profesor añadido correctamente a la excursión " + nombre_actividad);
    }

    public void inscribirAsistente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creando estudiante...");
        System.out.print("Inserta los apellidos: ");
        String ape = sc.nextLine();
        System.out.print("Inserta el nombre: ");
        String nom = sc.nextLine();
        System.out.print("Inserta el curso: ");
        String cur = sc.nextLine();
        System.out.print("Inserta su edad: ");
        int edad = sc.nextInt();

        Estudiantea nuevo = new Estudiantea(ape, nom, cur, edad);

        // Control de duplicados: se basa en el método equals de EstudianteA
        if (listaAsistentes.contains(nuevo)) {
            System.out.println("El estudiante ya existe en la lista de asistentes a la actividad " + nombre_actividad);
        } else {
            listaAsistentes.add(nuevo);
            System.out.println("Añadido correctamente el estudiante " + nom + " " + ape + " del curso " + cur);
        }
    }

    public double calcularImporteIngreso() {
        // Devuelve la cantidad en función del número de asistentes inscritos
        return listaAsistentes.size() * precio;
    }

    public void verAsistentes() {
        System.out.println("Lista de inscritos para la actividad " + nombre_actividad + ":");

        // Ordenamos la lista por curso y luego por apellidos
        listaAsistentes.sort(Comparator.comparing(Estudiantea::getCurso)
                .thenComparing(Estudiantea::getApellidos));

        for (int i = 0; i < listaAsistentes.size(); i++) {
            System.out.println("[" + (i + 1) + "]. " + listaAsistentes.get(i));
        }
    }

    public void eliminarAsistentesPorEdad(int edadLimite) {
        // Uso de Iterator para recorrer y eliminar de forma segura
        Iterator<Estudiantea> it = listaAsistentes.iterator();
        while (it.hasNext()) {
            Estudiantea e = it.next();
            if (e.getEdad() < edadLimite) {
                it.remove();
            }
        }
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public String getLocalidad() {
        return localidad;
    }
}