package org.example.pruebafx;

public class NaveSpaceX {

    protected String nombre;
    protected double combustible;
    protected Motor motor;
    protected boolean enVuelo;

    public NaveSpaceX(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.motor = new Motor("Merlin", 845);
        this.enVuelo = false;
    }

    public void lanzar() {
        if (combustible <= 0) {
            throw new IllegalArgumentException("No hay combustible para lanzar");
        }
        enVuelo = true;
        System.out.println("Lanzando nave " + nombre);
    }

    public void aterrizar() {
        if (!enVuelo) {
            throw new IllegalArgumentException("La nave no está en vuelo");
        }
        enVuelo = false;
        System.out.println("Aterrizando nave " + nombre);
    }

    public void repostar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (enVuelo) {
            throw new IllegalArgumentException("No se puede repostar en vuelo");
        }
        this.combustible += cantidad;
    }

    public void consumirCombustible(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (cantidad > combustible) {
            throw new IllegalArgumentException("Combustible insuficiente");
        }
        this.combustible -= cantidad;
    }

    public double consultarCombustible() {
        return combustible;
    }

    public boolean isEnVuelo() {
        return enVuelo;
    }
}

class NaveTripulada extends NaveSpaceX {

    private int numeroAstronautas;
    private int capacidadMaxima;

    public NaveTripulada(String nombre, double combustible, int numeroAstronautas, int capacidadMaxima) {
        super(nombre, combustible);
        this.numeroAstronautas = numeroAstronautas;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumeroAstronautas() {
        return numeroAstronautas;
    }

    public void setNumeroAstronautas(int numeroAstronautas) {
        if (numeroAstronautas < 0 || numeroAstronautas > capacidadMaxima) {
            throw new IllegalArgumentException("Número de astronautas inválido");
        }
        this.numeroAstronautas = numeroAstronautas;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void embarcar(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (numeroAstronautas + cantidad > capacidadMaxima) {
            throw new IllegalArgumentException("Capacidad excedida");
        }
        numeroAstronautas += cantidad;
    }

    public void desembarcar(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (cantidad > numeroAstronautas) {
            throw new IllegalArgumentException("No hay suficientes astronautas");
        }
        numeroAstronautas -= cantidad;
    }

    public void acoplar() {
        if (!enVuelo) {
            throw new IllegalArgumentException("La nave debe estar en vuelo para acoplarse");
        }
        System.out.println("La nave " + nombre + " se está acoplando en órbita.");
    }
}

class Motor {

    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void encender() {
        System.out.println("Motor " + tipo + " encendido con potencia " + potencia);
    }

    public void apagar() {
        System.out.println("Motor apagado");
    }
}