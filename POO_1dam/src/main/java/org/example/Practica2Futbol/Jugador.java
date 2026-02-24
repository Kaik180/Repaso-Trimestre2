package org.example.Practica2Futbol;

import java.util.ArrayList;

public class Jugador extends  MutxamelIFC implements AccionesDeportivas  {
    static ArrayList<Jugador> listajugadores = new ArrayList<>();
    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad,Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
        this.posicion=posicion;
        validarDorsal();

    }

    public void calentar(){
        System.out.println(getNombre()+" calienta estirando cada fibra de musuclo");

    }
    public void descansar(){
        System.out.println( getNombre()+" despues de un rato de esfuerzo cree merecerse descansar");
    }
    public void marcarGol(){
        System.out.println(getNombre()+" despues de su ultimo sprint chuta y gol gol gol gol!!!!");
    }
    @Override
    public void concentrarse() {
        System.out.println("El jugador"+getNombre()+"Se concentra al maximo");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador"+getNombre()+" Viaja a la ciudad: "+ ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador "+getNombre()+ " Celebra el gol gol gol gol");
    }

    public void entrenar() {
        System.out.println("El jugador "+getNombre()+" entrena fisicamente para ser mas fuerte y rapido");
    }

    @Override
    public void jugadorPartido(String rival) {
        System.out.println("El jugador "+getNombre()+" tiene como rival: "+ rival);
    }
    private void validarDorsal() {

        for (Jugador j : listajugadores){
            if (j.categoria.equals(categoria)){
                if (j.dorsal==dorsal){
                    throw new DorsalIncorrectaException(
                            "La dorsal ya esta escogida por otro jugador"
                    );
                }

            }

        }
        listajugadores.add(this);
    }
}
