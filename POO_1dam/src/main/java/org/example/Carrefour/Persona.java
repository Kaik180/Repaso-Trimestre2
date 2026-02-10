package org.example.Carrefour;

public class Persona {
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int codigo, String nombre, int sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codigo='" + codigo + '\'' +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("Persona con codigo"+ codigo + "y nombre "+ sueldo + " euros");
    }

    private int codigo;
    private int sueldo;
    private String nombre;
}
