package org.example;

public class Persona {
       private String nombre;
       private String dni;
       private int edad;
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public void Imprimirdatos(){
        System.out.println("nombre: "+ nombre);
        System.out.println("dni: "+ dni);
        System.out.println("edad: "+ edad);
    }
    public String getNombre(){
        return nombre;
    }
    public  void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDni(){
        return dni;
    }
    public  void setDni(String dni){
        this.dni = dni;
    }
    public String getedad(){
        return dni;
    }
    public  void setEdad(int edad){
        this.edad = edad;
    }

}
