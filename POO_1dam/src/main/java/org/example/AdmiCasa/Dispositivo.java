package org.example.AdmiCasa;

public abstract class Dispositivo {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Dispositivo(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    private String nombre;
    private boolean estado;

    public abstract void enceder();
    public void apagar(){

        if (estado=true){
            estado=false;
            System.out.println(nombre + "apagado");
        }else {
            System.out.println(nombre + "ya esta apagado");
        }

    };
    public void mostrarEstado(){
        if (estado=true){
            System.out.println("El dispositivo esta encendido ");
        }else {
            System.out.println("El dispositivo esta apagado ");
        }

    }
}
