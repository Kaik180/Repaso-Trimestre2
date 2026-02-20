package org.example.Practica2Futbol;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{
    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo,String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        this.formacionPreferida=formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica el proximo entrenamiento para ser lo mas epico posible con explosiones incluidas");

    }
    public void hacerCambios(){
        System.out.println("el entrenador ve que un jugador es mas paquete de lo normal y lo cambia");

    }
    @Override
    public void concentrarse() {
        System.out.println("el entrenador "+ getNombre()+"Se concentra al maximo");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("el entrenador "+getNombre()+" Viaja a la ciudad: "+ ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("el entrenador "+getNombre()+ " Celebra el gol gol gol gol");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador "+getNombre()+" entrenar mentalmente mas jugadas poderosas");
    }

    @Override
    public void jugadorPartido(String rival) {
        System.out.println("El entrenador "+getNombre()+" tiene como rival: "+ rival);
    }
}
