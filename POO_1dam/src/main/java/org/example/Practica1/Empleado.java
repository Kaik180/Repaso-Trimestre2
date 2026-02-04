package org.example.Practica1;

public class Empleado {
    private int CANTIDADEMPLEADOS =1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = calcularid();
        this.nombre = nombre;
        this.cargo = verificarCargo(cargo);
        this.director=director;
        CANTIDADEMPLEADOS++;
    }
    private String calcularid(){
        return "EP"+CANTIDADEMPLEADOS;

    }
    private String verificarCargo(String Cargo){
        if (Cargo.equals("director")&&Cargo.equals("técnico")&&Cargo.equals("colaborador")){
            return Cargo;
        }else {
            return "pte";
        }


    }



}
