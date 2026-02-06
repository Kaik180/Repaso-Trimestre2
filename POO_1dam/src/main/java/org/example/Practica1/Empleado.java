package org.example.Practica1;

public class Empleado {

    private static int CANTIDADEMPLEADOS = 1;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;


    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public Empleado getDirector() { return director; }


    public Empleado(String nombre, String cargo, Empleado director) {

        this.id = calcularId();
        this.nombre = nombre;
        this.cargo = verificarCargo(cargo);

        // ✔ Si es director → director = null
        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }

        CANTIDADEMPLEADOS++;
    }

    private String calcularId() {
        return "EP" + CANTIDADEMPLEADOS;
    }

    // Verificación correcta del cargo
    private String verificarCargo(String cargo) {

        if (cargo.equalsIgnoreCase("director") || cargo.equalsIgnoreCase("técnico") || cargo.equalsIgnoreCase("presentador") || cargo.equalsIgnoreCase("colaborador")) {

            return cargo.toLowerCase();
        }

        return "pte";
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + (director != null ? director.getNombre() : "null") +
                '}';
    }
}

