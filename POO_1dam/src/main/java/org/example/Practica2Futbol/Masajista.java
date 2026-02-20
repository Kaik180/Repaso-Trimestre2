package org.example.Practica2Futbol;

public class Masajista extends MutxamelIFC {
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }


    public void darMasaje(){
        System.out.println( getNombre()+ "prodece a darle un masaje al jugador");

    }
    @Override
    public void concentrarse() {
        System.out.println("El Masajista"+getNombre()+"Se concentra al maximo");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El Masajista"+getNombre()+" Viaja a la ciudad: "+ ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El Masajista"+getNombre()+ " Celebra el gol gol gol gol");
    }
}
