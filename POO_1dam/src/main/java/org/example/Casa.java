package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;




    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
         System.out.println("introduce el nombre del propietario: ");
         String nombre = teclado.next();
         teclado.nextLine();
        System.out.println("edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        Propietario propietario = new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("nuevo propietario añadido");
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public Casa(String direccion) {
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();

    }
    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }
    public void crearHabitacion( String nombre, double metros){

        for( Habitacion habitacion : listaHabitaciones){
            if(habitacion.getNombre().equals(nombre)){
                System.out.println("la habitacion"+ nombre+" ya esta creada.");
                return;
            }
            Habitacion habitacion2 = new Habitacion(nombre, metros);
            listaHabitaciones.add(habitacion2);
            System.out.println("la habitacion"+ nombre+" ha sido creada");
        }

    }
    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
    public void mostrarHabitaciones(){
        System.out.println("Casa en "+ direccion+", propietario: "+propietario.getNombre()+" tiene "+ listaHabitaciones.size());
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("- "+habitacion.getNombre() + " ("+ habitacion.getMetros()+") m2");
        }
    }
    public Habitacion getHabitacionMasGrande(){
        Habitacion mayor= listaHabitaciones.get(0);
        for( Habitacion habitacion : listaHabitaciones){
            if(habitacion.getMetros()> mayor.getMetros()){
                mayor=habitacion;
            }

        }
        return mayor;
    }
    public void eliminarHabitacion(String nombre){
        for( Habitacion habitacion : listaHabitaciones){
            if(habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("la habitacion"+ nombre+" ha sido borrada");
                return;
            }
        }
        System.out.println("la habitacion"+ nombre+" no existe");
    }
    public Habitacion habitacionMasConsumo(){
        Habitacion mayor= listaHabitaciones.get(0);
        for( Habitacion habitacion : listaHabitaciones){
            if(habitacion.calcularConsumo()> mayor.calcularConsumo()){
                mayor=habitacion;
            }

        }
        return mayor;
    }

}
