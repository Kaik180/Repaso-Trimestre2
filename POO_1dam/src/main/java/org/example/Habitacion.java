package org.example;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> listaEelectrodomesticos;


    public ArrayList<Electrodomestico> getListaEelectrodomesticos() {
        return listaEelectrodomesticos;
    }

    public void setListaEelectrodomesticos(ArrayList<Electrodomestico> listaEelectrodomesticos) {
        this.listaEelectrodomesticos = listaEelectrodomesticos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

    public Habitacion(String nombre, double metros) {
        this.nombre = nombre;
        this.metros = metros;
    }
    public void crearElectrodomesticos( String nombre, double consumo){

        for( Electrodomestico electrodomestico : listaEelectrodomesticos ){
            if(electrodomestico.getNombre().equals(nombre)){
                System.out.println("El electrodomestico "+ nombre+" ya esta creado.");
                return;
            }

        }
        Electrodomestico electrodomestico1 = new Electrodomestico(nombre, consumo);
        listaEelectrodomesticos.add(electrodomestico1);
        System.out.println("El electrodomestico "+ nombre+" ha sido creada");
    }
    public double calcularConsumo(){
        double sumar=0;
        for( Electrodomestico electrodomestico : listaEelectrodomesticos ){
            sumar+=electrodomestico.getConsumo();

        }
        return sumar;
    }

}
